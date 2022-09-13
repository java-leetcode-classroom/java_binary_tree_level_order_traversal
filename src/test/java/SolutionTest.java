import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void levelOrderExample1() {
    assertEquals(List.of(List.of(3),List.of(9, 20), List.of(15, 7)),
        sol.levelOrder(sol.createBinaryTree(new String[]{"3", "9", "20", "null", "null", "15", "7"})));
  }
  @Test
  void levelOrderExample2() {
    assertEquals(List.of(List.of(1)),
        sol.levelOrder(sol.createBinaryTree(new String[]{"1"})));
  }
  @Test
  void levelOrderExample3() {
    assertEquals(List.of(),
        sol.levelOrder(null));
  }
}