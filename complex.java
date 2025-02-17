import java.util.Scanner;

public class complex {
    
    public static void main(String[] args) {
        int a,b,c,d,real,image;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the real part of the first expression");
        a=obj.nextInt();
        System.out.println("enter the imaginary part of the first expression");
        b=obj.nextInt();
        System.out.println("enter the real part of the second expression");
        c=obj.nextInt();
        System.out.println("enter the imaginary part of the second expression");
        d=obj.nextInt();
        real=a+c;
        image=b+d;
        System.out.println("complex expression is: "+real + " + " + image + "i");

    }
}
