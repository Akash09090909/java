
    import java.util.Scanner;
    public class Array 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the size");
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        int arr1[]=new int[size];

        System.out.println("Enter elements in Array");
        for (int i = 0; i < size; i++) 
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Our Array is ");
        for (int i = 0; i < size; i++) 
        {
            System.out.println(arr1[i]);
        }
    }
}

