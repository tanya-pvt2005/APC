public class StringConcept {
    public static void main(String[] args) {

        //Strings can be initialised by new keyword or string literal
        //Both init in heap, but for strings : in heap memory we have String pool (hence if same s1 and s2, in pool refers to one value only)
        //in case of new keyword: it is not in String pool of heap
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = new String("Hi");

        //true because reference is same
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        //Changing a bit
        String s4= "Hi";
        s4+="Hahaha";
        String s5 = "Hi"+"Hahaha";
        System.out.println(s4+" "+s5);
        System.out.println(s4==s5);

        //strings are immutable hence in concatenation it is not possible to Directly change value of original reference,
        //a new string is formed and it's reference is created
        //hence ans is false

        //check where is the new strign formed? pool or heap
        String st1 = "HiHahaha";
        System.out.println(s4==st1); //false: after concatenation, outside pool

    }
}
