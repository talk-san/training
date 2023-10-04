public class Main {
    public static void main(String[] args) {
        System.out.println("Main is starting");

//        Thread thread1 = new Thread1("Thread1");
//        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside: " + Thread.currentThread() + " " + 2);
            }
        },"Thread2");
        thread2.start();

        System.out.println("Main is exiting");
    }
}

