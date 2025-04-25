// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers=generate(1,10,10000);
        mergesort(numbers,0,99);
        display(numbers);
        System.out.println(generate(0,10,10));

    }
   /*Generate 10000 random integers between 1 and 100
    */
    public static int[] generate(int low, int high, int size) {
        Random rand = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(high - low + 1) + low;
        }
        return result;
    }
  public static void mergesort(int[] a,int low, int high ){

  }
  public static void display(int[]a){
     for(int x: a){
         System.out.print(x );
         System.out.print("\t");
     }
  }
}