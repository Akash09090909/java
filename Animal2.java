public class Animal2 {
    String color ;
    int age;
    void tata(int a,String c)
    {
        age=a;
        color=c;
        
        
    } 
    void display()
    {
        System.out.println(color+ "     yo ha    " +age);

    }
    public static void main(String[] args) {
        Animal2 buzo=new Animal2();
        buzo.tata(10,"black");
        buzo.display();
    }

}
