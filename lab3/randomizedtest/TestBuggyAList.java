import edu.princeton.cs.algs4.StdRandom;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
  @Test
  public void testThreeAddThreeRemove() {
      AListNoResizing<Integer> correct = new AListNoResizing<>();
      BuggyAList<Integer> broken = new BuggyAList<>();

      correct.addLast(5);
      correct.addLast(10);
      correct.addLast(15);

      broken.addLast(5);
      broken.addLast(10);
      broken.addLast(15);

      Assert.assertEquals(correct.size(), broken.size());

      Assert.assertEquals(correct.removeLast(), broken.removeLast());
      Assert.assertEquals(correct.removeLast(), broken.removeLast());
      Assert.assertEquals(correct.removeLast(), broken.removeLast());
  }

    @Test
    public void TestBug(){

        AListNoResizing<Integer> correct = new AListNoResizing<>();
        BuggyAList<Integer> buggy  = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 3);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                correct.addLast(randVal);
                buggy.addLast(randVal);
                Assert.assertEquals(correct.size(), buggy.size());
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1 && correct.size() > 0) {
                // getLast
                int lastVal_correct = correct.getLast();
                int lastVal_buggy = buggy.getLast();
                Assert.assertEquals(lastVal_correct, lastVal_buggy);
                System.out.println("getLast(" + lastVal_correct + ")");
            } else if (operationNumber == 2 && correct.size() > 0) {
                // removeLast
                int lastVal_correct = correct.removeLast();
                int lastVal_buggy = buggy.removeLast();
                Assert.assertEquals(correct.size(), buggy.size());
                Assert.assertEquals(lastVal_correct, lastVal_buggy);
                System.out.println("removeLast(" + lastVal_buggy + ")");
            }
        }
    }
}
