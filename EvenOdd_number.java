import java.util.Scanner;

public class EvenOdd_number {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");

        num =sc.nextInt();

        if(num%2==0){
            System.out.println(num +" is Even Number");
        }
        else{
            System.out.println(num +" is odd Number");

        }
    }
    
}
