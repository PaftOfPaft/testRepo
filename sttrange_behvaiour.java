import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        int[] intArray = new int[10];

        System.out.print("unsorted array:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(20);
            System.out.print("\t" + intArray[i]);
        }

//        int currentValue;
//        int nextValue;

        for (int i = intArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
//                 currentValue = intArray[j];
//                 nextValue = intArray[j + 1];

                if (intArray[j] < intArray[j + 1]) {
                    int number = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = number;
                }
            }
        }

        System.out.print("\nsorted array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("\t" + intArray[i]);
        }
    }
}