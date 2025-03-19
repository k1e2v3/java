import java.util.Scanner;

public class string {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter a string:");
String input = sc.nextLine();

System.out.println("\nString manipulation:");
System.out.println("Original string: " + input);
System.out.println("Length of string: " + input.length());
System.out.println("Uppercase: " + input.toUpperCase());
System.out.println("\nLowercase: " + input.toLowerCase());

System.out.println("\nEnter another string to concatenate:");
String string2 = sc.nextLine();
System.out.println("Concatenated string: " + input.concat(" " + string2));

System.out.println("\nEnter another string to concatenate:");
String string3 = sc.nextLine();
System.out.println("Concatenated string: " + input.concat(" " + string3));

if (input.length() > 3) {
  System.out.println("Substring (first 3 characters): " + input.substring(0, 3));
} else {
  System.out.println("Substring (full string): " + input);
}

System.out.println("\nEnter a character to replace:");
char oldChar = sc.next().charAt(0);
System.out.println("Enter a new character to replace with:");
char newChar = sc.next().charAt(0);
System.out.println("String after replacement: " + input.replace(oldChar, newChar));

sc.nextLine(); 

System.out.println("\nEnter a word to check if it is in the string:");
String word = sc.nextLine();
if (input.contains(word)) {
  System.out.println("Yes, the string contains: " + word);
} else {
  System.out.println("No, the string does not contain: " + word);
}

String reversed = new StringBuilder(input).reverse().toString();
System.out.println("Reversed string: " + reversed);

sc.close();
}
}

