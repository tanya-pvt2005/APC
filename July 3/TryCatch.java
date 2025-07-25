public class TryCatch {

    public static void main(String[] args) {
        try{
            System.out.println(3/0);
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Hello World");
        }
    }
}
