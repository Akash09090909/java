// WAP TO FIND THE LIST OF ARMSTRONG NUMBERS FOR A GIVEN RANGE OF NUMBER.
import java.util.Scanner;
public class Armstrong {
    

    public static void main(String[] args) 
    {
        
        int max,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minimum number");
        min=sc.nextInt();//1
        System.out.println("Enter the maximum number");
        max=sc.nextInt();//1000

        for (int i = min; i <= max; i++) //1-1000
        {
            int len=0;
            int original=i,original2=i,temp=i,rem,sum=0;

            while (original2>0) 
            {
                original2=original2/10;
                len++;
            }
            // len=String.valueOf(i).length();
            while (temp>0)
            {
                rem=temp%10;
                sum=(int)(sum+ Math.pow(rem, len));
                temp=temp/10;
            }
            if(sum==original)
            {
                System.out.println(original+" is Armstrong.");
            }
        }
        sc.close();

    }
}

