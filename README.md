# java_tree_level_order_traversal

Given the `root`of a binary tree, return *the level order traversal of its nodes' values*
. (i.e., from left to right, level by level).

## Examples

**Example 1:**

![https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg](https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg)

```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

```

**Example 2:**

```
Input: root = [1]
Output: [[1]]

```

**Example 3:**

```
Input: root = []
Output: []

```

**Constraints:**

- The number of nodes in the tree is in the range `[0, 2000]`.
- `-1000 <= Node.val <= 1000`

## 解析

題目給定一個二元樹根結點 root。

要求實作一個演算法根據 level order 來尋訪二元樹，並回傳每個 level的結構

這題跟 [199. Binary Tree Right Side View](https://www.notion.so/199-Binary-Tree-Right-Side-View-266ca3b629444b019b41652423f51175) 一樣需要用 Breadth First Search 演算法來實作

使用一個 queue 來儲存每個 level 的所有 node 

每次都把這個 queue 的 level 紀錄下來及為所求

如下圖

![](https://i.imgur.com/LBC8UmF.png)

這樣等到 queue 為空時，整個tree 都走訪結束

因此時間複雜度是 O(n) ，空間複雜度也是 O(n)

## 程式碼
```java
class Solution {
  /**
   * Definition for a binary tree node.
   * public class TreeNode {
   *     int val;
   *     TreeNode left;
   *     TreeNode right;
   *     TreeNode() {}
   *     TreeNode(int val) { this.val = val; }
   *     TreeNode(int val, TreeNode left, TreeNode right) {
   *         this.val = val;
   *         this.left = left;
   *         this.right = right;
   *     }
   * }
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(queue.size() > 0) {
      int levelSize = queue.size();
      List<Integer> level = new ArrayList<>();
      for (int count = 0; count < levelSize; count++) {
        TreeNode node = queue.poll();
        if (node != null) {
          level.add(node.val);
          queue.add(node.left);
          queue.add(node.right);
        }
      }
      if (level.size() > 0) {
        result.add(level);
      }
    }
    return result;
  }
}
```
## 困難點

1. 理解二元樹 level order traversal的意思
2. 理解怎麼去做 level order traversal

## Solve Point

- [x]  Understand what problem would like to solve
- [x]  Analysis Complexity