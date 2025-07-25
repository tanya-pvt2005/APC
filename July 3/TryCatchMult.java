import java.sql.SQLOutput;

public class TryCatchMult {

    public static void main(String[] args) {
       f1();
        System.out.println("Hello");
    }
    private static void f1(){
        try {
            f2();
            System.out.println("Hello after f2");
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    private static void f2(){
        f3();
        System.out.println("Line after Exception");
    }
    private static void f3() throws Exception{
        System.out.println(3/0);
    }
}
