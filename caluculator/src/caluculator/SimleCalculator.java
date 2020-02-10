package caluculator;
import java.util.Scanner;
public class SimleCalculator{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int firstNumber;
    int secondNumber;
    int c;

    System.out.println("Write a number");
    firstNumber = Integer.parseInt(input.nextLine());

    System.out.println("Write another number");
    secondNumber = Integer.parseInt(input.nextLine());
    System.out.println("Enter ur choice");
    c=input.nextInt();
    switch(c) {
    case 1:
    Addition A=new Addition();
    A.add(firstNumber,secondNumber);
    break;
    case 2:
    Substraction S=new Substraction();
    S.sub(firstNumber,secondNumber);
    break;
    case 3:
    Multipilcation M=new Multipilcation();
    M.mul(firstNumber,secondNumber);
}
}
}