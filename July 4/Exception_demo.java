public class Exception_demo {
    public static void main(String[] args) {
        try{
            m1();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("My custom exception");
        }

        m2();
    }

    private static void m2() {
        try{
            throw new Exception("Handled in function m2 itself");
        }catch(Exception e){
            System.out.println("2 custom exception handled");
        }
        System.out.println("Printed after handling 2 exception");
    }

    private static void m1() throws Exception{
        throw new Exception("My Exception");
//        System.out.println("This won't be printed");
    }


}
