class EvenThread extends Thread {
    private int n;

    public EvenThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }

    @Override
    public String toString() {
        return "EvenThread";
    }
}

class OddThread extends Thread {
    private int m;

    public OddThread(int m) {
        this.m = m;
    }

    @Override
    public void run() {
        for (int i = 1; i <= m; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }

    @Override
    public String toString() {
        return "OddThread";
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10; // Define the upper limit for even numbers
        int m = 15; // Define the upper limit for odd numbers

        EvenThread evenThread = new EvenThread(n);
        OddThread oddThread = new OddThread(m);

        evenThread.start();
        oddThread.start();
    }
}
