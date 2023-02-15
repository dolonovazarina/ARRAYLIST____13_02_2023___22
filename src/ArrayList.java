import java.util.List;
import java.util.Scanner;

public class ArrayList<I extends Number> {
//    public static void main(String[] args) throws IOException {
//
//        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < data.length; i++) list.add(data[i]);
//        ArrayList<Integer> even = new ArrayList<Integer>();   // чётные
//        ArrayList<Integer> odd = new ArrayList<Integer>();    // нечётные
//        int i = 0;
//        while (list.add; > i) {
//            Class<? extends ArrayList> x = list.getClass();
//            if (x % 2 == 0)    // если x - чётное
//                even.add(x);   // добавляем x в коллекцию четных чисел
//            else
//                odd.add(x);    // добавляем x в коллекцию нечетных чисел
//            i++;
//        }
//    }

//    private void add(I datum) {
//    }

    private static class IOException extends java.lang.Exception {
//        import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
        public class task7 {
            public static void main(String[] args) {
                int[] a;
                Scanner z = new Scanner(System.in);
                System.out.println("Enter the number of elements in the array");
                int n = z.nextInt();
                a = new int[n];
                for (int i = 0; i <= (n - 1); i++) { //Принимаем все числа массива
                    Scanner x = new Scanner(System.in);
                    System.out.println("Enter" + " " + i + " " + "number of the array");
                    int b;
                    b = x.nextInt();
                    a[i] = b;
                }
                List<Integer> even = (List<Integer>) new ArrayList<Integer>();
                List<Integer> odd = (List<Integer>) new ArrayList<Integer>();
                for(int i = 0; i< n; i++){
                    if (a[i]%2==0) {
                        even.add(i);
                    }
                    else {
                        odd.add(i);
                    }
                }
                int sumEven = 0;
                int sumOdd = 0;
                for (int i = 0; i < n; i++){
                    sumEven +=odd.get(i);
                }
                for (int i = 0; i < n; i++){
                    sumOdd+=even.get(i);
                }
                System.out.println("Array of even numbers is: " + even);
                System.out.println("The sum of even numbers is " + sumEven);
                System.out.println("Array of odd numbers is: " + odd);
                System.out.println("The sum of odd numbers is " + sumOdd);
            }
        }
    }
}
