
import java.util.Scanner;
public class Sum_Of_Range {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 2 number");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
             sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
