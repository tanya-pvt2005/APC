import java.util.Arrays;

public class Student {
    int rollno;
    String name;
    String dept;
    int knowledge;

    static int id = 1;// for student class so tht all idsbe unique



    Student() {

        rollno = id++;

    }

    public void study() {
        System.out.println(name + "is Studying...");
        knowledge += 20;

    }

    public void teach(Student s1) {
        System.out.println(name + " is teaching " + s1.name);
        knowledge += 10;// uss student ki jo dusre ko pdha rha hai , self knowledge increase
        s1.knowledge += 10;

    }

    public void giveExam() {
        if (knowledge >= 40) {
            System.out.println("result : pass");
        } else {
            System.out.println("fail");
        }
    }

    public class Test1 {

        public static void swap(int[] arr1, int[] arr2) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
            System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
        }

        public static void swap2(int[] arr1, int[] arr2) {
            for (int i = 0; i < arr1.length; i++) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr1 = { 1, 2, 3 };
            int[] arr2 = { 4, 5, 6 };

            System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));

            swap(arr1, arr2);// only changes the reference at the swap function but when the control goes
            // back to the main stack frame , the
            swap2(arr1, arr2); // changes the indexes so when the flow goes back to the main stack frame , the
            // values at the indexes are changed

            Student s1 = new Student();
            Student s2 = new Student();

            System.out.println("Breakpoint added");

            System.out.println("Knowledge of student1 " + s1.knowledge + " Knowledge of s2  is" + s2.knowledge);
            s1.teach(s2);
            System.out.println("Knowledge of student1 " + s1.knowledge + " Knowledge of s2  is" + s2.knowledge);

            System.out.println("rollno of student 1 is :" + s1.rollno + "roll no of student 2 is:" + s2.rollno);

        }


    }


}