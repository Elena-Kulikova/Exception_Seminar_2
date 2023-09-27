package Seminar_2;
// Если необходимо, исправьте код: 
// try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }


public class Task2 {
    public static void main(String[] args) {
        //Не был задан массив
        int[] intArray = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        try {
            // на 0 делить нельзя!
            // int d = 0;
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
    

