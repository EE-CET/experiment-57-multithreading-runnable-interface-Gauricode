class MyRunnable implements Runnable {
    // Override run() method
    // Loop from 1 to 5 and print numbers separated by space
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable obj1 = new MyRunnable();

        // Create a Thread object passing the runnable instance
        Thread t1 = new Thread(obj1);

        // Start the thread
        t1.start();
    }
}
