import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDequeGold {
    public static void main(String[] args) {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> sad2 = new ArrayDequeSolution<>();

        for (int i = 0; i < 10; i++) {
            sad1.addFirst(i);
            sad2.addFirst(i);

        }
        sad1.printDeque();


        for (int i = 0; i < 10; i++) {
            double numberBetweenZeroAndOne = StdRandom.uniform();

            if (numberBetweenZeroAndOne > 0.5) {
                sad1.addFirst(i);
                sad2.addFirst(i);
            }
            else {
                sad1.removeFirst();
                sad2.removeFirst();
            }

        }
        sad1.addFirst(10);

        for (int i = 0; i < sad1.size(); i++) {
            assertEquals("these two value is not equal",sad1.get(i),sad2.get(i));
        }

        for (int i = 11; i < 20; i ++) {
            double numberBetweenOneAndTwo = StdRandom.uniform(1,2);

            if (numberBetweenOneAndTwo > 1.5) {
                sad1.addLast(i);
                sad2.addLast(i);
            }
            else {
                sad1.removeLast();
                sad2.removeLast();
            }

        }

        for (int i = 0; i < sad1.size(); i++) {
            assertEquals("these two values is not the same!",sad1.get(i),sad2.get(i));
        }
    }
}
