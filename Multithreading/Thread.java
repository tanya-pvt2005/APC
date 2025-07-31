import java.util.Scanner;

public class Thread {

    public static void main(String[] args) {
        //How to create a thread
        //1. Extend thread class -> simpler but limited
        //2. Implement the Runnable interface -> better
        //currently we run pgm on main thread

        Scanner sc = new Scanner(System.in);
        //users have 5 sec to enter their name
        //for e.g. timer is time-consuming operation here

        System.out.println("You have 5 seconds to enter your name: ");

        //but the problem is -> all code runs on main thread
        //so we don't get the normal flow of execution
        for(int i=0; i<5; i++){
            try{
                Thread.sleep(1000); //Thread is current thread we are working on
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i == 5){
                System.out.println("Time's up");
            }
        }
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello "+name);

    }
}
