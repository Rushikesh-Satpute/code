import java.util.*;
public class Main {
    void displayArithmetic() {
        int a,b,c;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = r.nextInt();
        b = r.nextInt();
        try{
            c = a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException h) {
            System.out.println("You can not divide by zero.");
        }
    }
    void displayNumber() {
        String a;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        a = r.next();
        try{
            int b = Integer.parseInt(a);
            System.out.println(b);
        }
        catch(NumberFormatException e) {
            System.out.println("Number format exception occured.");
        }
    }
    void displayArray(){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int [10];
        System.out.println("Number of elements in array are 10\nEnter index to access element: ");
        try {
            int c = sc.nextInt();
            sc.close();
            System.out.println(arr[c]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound ");
        }
    }
}
class one{
    public static void main(String args[]) {
        int ch,cont;
        do {
            System.out.println("1. Arithmetic Exception\n2. Array Index Out \n3. Number Format Exception\nEnter your choice: ");
            Scanner r = new Scanner(System.in);
            ch = r.nextInt();
            switch(ch) {
                case 1: {
                    Main m = new Main();
                    m.displayArithmetic();
                    break;
                }case 2: {
                    Main m = new Main();
                    m.displayArray();
                    break;
                }case 3:{
                    Main m = new Main();
                    m.displayNumber();
                    break;
                }
            }
            System.out.println("Press 0 for Quit and 1 for Continue.");
            cont = r.nextInt();
        }while(cont==1);
    }
}
