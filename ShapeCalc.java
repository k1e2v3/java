import java.util.Scanner;

class Shape {
    
    
    double area(double radius) {
        return Math.PI * radius * radius; 
    }

   
    double area(double length, double width) {
        return length * width;  
    }

   
    double area(int base, double height) {
        return 0.5 * base * height;  
    }
}

public class ShapeCalc {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        
       
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of the circle: " + shape.area(radius));
        
        
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Area of the rectangle: " + shape.area(length, width));

       
        System.out.print("Enter the base of the triangle: ");
        int base = sc.nextInt();  
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of the triangle: " + shape.area(base, height));
        
        sc.close();  
    }
}

