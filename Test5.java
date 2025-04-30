// Write a method to print all odd numbers from 1 to a given number n

// import java.util.Scanner;
// public class Test5{
//     public static void oddNumber(int num){
//         for(int i=1; i<=num; i ++){
//            if(i%2!=0){
//               System.out.println(i);
//           }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number: ");
//         int num = sc.nextInt();
//         oddNumber(num);
//         sc.close();

//     }
// }


// Create a method to convert a given number of days into years, months, and days

import java.util.Scanner;
public class Test5{
    public static void oddNumber(int num){
        for(int i=1; i<=num; i ++){
           if(i%2!=0){
              System.out.println(i);
          }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        oddNumber(num);
        sc.close();

    }
}