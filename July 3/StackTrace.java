public class StackTrace {
    public static void main(String[] args) {

//        A stack trace is a list that shows where an error happened in your code.

//        It tells you:

//        What the error was
//        Which lines of code were running when the error occurred
//        Which functions were called, and in what order

        f1();
    }

    private static void f1() {
        f2();
    }

    private static void f2() {
        f3();
    }

    private static void f3() {
        System.out.println(3/0);
    }
}
