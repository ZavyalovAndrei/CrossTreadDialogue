public class TestTread extends Thread {

    private static final int DELAY = 2500;

    public TestTread(ThreadGroup group, String name) {
        super(group, name);
        }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(DELAY);
                System.out.println("Поток " + getName() + " запущен.");
            }
        } catch (InterruptedException err) {
            System.out.println("Поток " + getName() + " пытались завершить, пока он спал.");
            return;
        } finally {
            System.out.println("Поток " + getName() + " завершает работу.");
        }
    }
}


