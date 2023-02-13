import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student[] student = new  Student[4];
        ArrayList<Student> arrayList =new ArrayList<>();
        arrayList.add(new Student("BOYS", 22));
        arrayList.add(new Student("BOY", 25));
        arrayList.add(new Student("BOS", 20));
        arrayList.add(new Student("YSO", 21));
        arrayList.add(new Student("MARK", 24));
        //System.out.printf(student);
        arrayList.add(3,21);
        System.out.println(arrayList.set(0.22));
    }
}