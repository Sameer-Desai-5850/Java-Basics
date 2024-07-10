
import java.util.Scanner;
public class Num_is_PositivOrNegativ {
    public static void main(String args[]){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        //System.out.println(Number);
        if(Number>0){
            System.out.println("+ve number");
        }
        if(Number<0){
            System.out.println("-ve number");
        }
        else{
            System.out.println(" number is 0");

        }

    }
    
}
