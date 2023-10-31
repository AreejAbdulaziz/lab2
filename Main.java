import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      //1  String[] words = {"cat", "dog", "red", "is", "am"};
      //  String max = words[0];
       // longest(words, max);
       /*/2/ int []array={1,1,1,3,3,5};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int number=s.nextInt();
        int N=occurences(array, number);
        System.out.println(N);
        /*/
        //3
        //int []array={1,4,17,7,25,3,100};
        //largestNumbers(array);

        /*/4/ int []array={5,4,3,2,1};
        reverse(array);
         */
        //5
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int r=s.nextInt();
        int []a=new int[r];
        int option;
        do {
            System.out.println("Enter option");
            option=s.nextInt();

        switch (option){
            case 1:
                takeValue(a,r);
                break;
            case 2:
                display(a);
                break;
            case 3:
                System.out.println("Enter number to search");
                int number=s.nextInt();
                search(a,number);
                break;
            case 4:
                sort(a);
                break;
            default: System.out.println("stop");
            break;
        }} while (option!=5);
        System.out.println("Exiting the program");

        /*/6/  System.out.println("Enter minimum value of the range");
        int min=s.nextInt();
        System.out.println("Enter maximum value of the range");
        int max=s.nextInt();
        System.out.println("Enter number of random numbers to generate");
        int randomNumber=s.nextInt();
        random( min, max, randomNumber);
         */
    }
        //1
        /* public static void longest(String []words,String max) {
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > max.length()) {
                    max = words[i];

                }
            }
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() == max.length()) {
                    System.out.println(words[i]);
                }
            }
         */

        //2
   /*  public static int occurences(int []array,int number) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(number==array[i] ){
                count=count+1;
    }
}
        return count;
    }

    */
    //3
//        public static void largestNumbers(int []array){
//            Arrays.sort(array);
//            for(int i=array.length-1;i> array.length-4;i--) {
//                System.out.println(array[i]);
//
//        }}

//4
    /* public static void reverse(int []array){
        for(int i=array.length-1;i>=0;i--) {
            System.out.print(array[i] + " ");
        }
    }
     */
//5
public static void takeValue(int []a,int r){
    Scanner s = new Scanner(System.in);
    for(int i=0;i<r;i++) {
        System.out.println("Enter element num"+i);
        a[i]=s.nextInt();
    }
}
    public static void display(int []a){
    for(int n:a){
        System.out.print(n+" ");
    }
        System.out.println();
    }
    public static void search(int []a,int number){
    for(int n : a){

        if(n==number){
            System.out.println("true");
        } else System.out.println("false");
    }
    }
    public static void sort(int []a){
    Arrays.sort(a);
    }


//6
/* public static void random(int min,int max,int randomNumber) {
    Random random=new Random();
    for(int i=0;i<randomNumber;i++) {
        System.out.println(random.nextInt(max-min+1)+min);
    }
}
 */


}