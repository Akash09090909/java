
    import java.util.Scanner;

    public class Array2  
    {

    public static void main(String[] args) {
        

        // Array : Homogeneous collection of data 

        // int arr[5]; error
        // int arr[]={10,39,45,65,78};

        // int arr[]=new int[5];

        // int arr[];
        // arr=new int[5];

        // int arr[]=new int[]{10,20,30,40,50};

        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(" at index "+i+" value is "+arr[i]);
        // }

        // System.out.println("the length of array is "+arr.length);

        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.println(" at index "+i+" value is "+arr[i]);
        // }

        // for (int i : arr) 
        // {
        //     System.out.println(" value is "+i);
        // }



    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    // for (int i = 0; i < arr.length; i++) 
    for (int i = 0; i < 5; i++) 
    {
        System.out.print("Enter the value of arr["+i+"] :");
        arr[i]=sc.nextInt();
    }

    System.out.println("=====================================================");

    for (int i = 0; i < arr.length; i++)
    {
        System.out.println("the value at arr["+i+"] is "+arr[i]);
    }

    
    }
}

