import java.util.Scanner;

public class Sum_N_Number { 
    public static void main(String args[]){
        System.out.println("enter the number till which u need sum:");

        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=Num;i++){
            sum=sum+i;
        }
        System.out.println("sum is :"+sum);
    }
    
}
