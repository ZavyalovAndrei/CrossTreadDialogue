import java.util.ArrayList;
import java.util.Collection;

public class Main {

    private static final int TREAD_QUANTITY = 4;
    private static final int INTERRUPT_DELAY = 15000;

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup MyGroup = new ThreadGroup("My group");
        Collection<Thread> threads = new ArrayList<>(TREAD_QUANTITY);

        for (int i = 0; i < TREAD_QUANTITY; i++) {
            threads.add(new TestTread(MyGroup, "№" + (i + 1)));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        Thread.sleep(INTERRUPT_DELAY);
        MyGroup.interrupt();
    }
}