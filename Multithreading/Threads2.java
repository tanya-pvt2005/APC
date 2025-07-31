import java.util.Scanner;

public class Threads2 {
    public static void main(String[] args) {
        //currently we run pgm on main thread

        Scanner sc = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name: ");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        //but the problem is -> all code runs on main thread
        //so we don't get the normal flow of execution
        //hence we create a separate thread
        //we have a class in our folder -> MyRunnable
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello "+name);

    }
}
