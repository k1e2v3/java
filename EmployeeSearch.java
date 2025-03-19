import java.util.Scanner;

class Employee {
int eno;
String ename;
double esalary;


Employee(int eno, String ename, double esalary) {
this.eno = eno;
this.ename = ename;
this.esalary = esalary;
}


void display() {
System.out.println("Employee No: " + eno);
System.out.println("Employee Name: " + ename);
System.out.println("Employee Salary: " + esalary);
System.out.println();
}
}

public class EmployeeSearch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("Enter the number of employees: ");
int n = sc.nextInt();
sc.nextLine(); 


Employee[] employees = new Employee[n];


for (int i = 0; i < n; i++) {
  System.out.println("Enter details for employee " + (i + 1));

 
  int eno = -1;
  while (eno == -1) {
      try {
          System.out.print("Employee No: ");
          eno = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid employee number (integer).");
      }
  }

  
  System.out.print("Employee Name: ");
  String ename = sc.nextLine(); 


  double esalary = -1;
  while (esalary == -1) {
      try {
          System.out.print("Employee Salary: ");
          esalary = Double.parseDouble(sc.nextLine());
      } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid salary (decimal number).");
      }
  }


  employees[i] = new Employee(eno, ename, esalary);
}


System.out.println("\nEmployee Details:");
for (int i = 0; i < n; i++) {
  employees[i].display();
}

sc.close();
}
}

