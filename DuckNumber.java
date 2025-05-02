//Write a method to determine if a number is a Duck number
import java.util.Scanner;
public class DuckNumber {
    public static void duckNumber(int num){
        int count=0;
        while(num!=0){
            if(num%10==0){
                count++;
                break;
            }
            num=num/10;
        }
        if(count==1){
            System.out.println(num+ " is duck number");
        }
        else{
            System.out.println(num + " is not a duck number");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Duck number: ");
        int num = sc.nextInt();
        sc.close();
        duckNumber(num);
        
    }
    
}