import java.util.*;
import java.lang.*;
import java.io.*;
public class Demo{
    static int count=0;
    static void checkPalindrome(String x){
        StringBuilder s1 = new StringBuilder(x);
        if(x.equals(s1.reverse().toString())){
            System.out.println(x+" is a Palindrome.");
            count+=1;
        } else {
            System.out.println(x+" is not a Palindrome.");
        }
    }
    static void evenOdd(int x){
        if(x%2==0){
            System.out.println(x+" is Even number.");
            count +=1;
        } else {
            System.out.println(x+" is Odd number.");
        }
    }
    static void prime (int x){
        boolean flag=false;
        for (int i=2; i<= x/2; ++i){
            if(x%i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(x+" is Prime number.");
            count +=1;
        } else
            System.out.println(x+" is not a Prime number.");
    }
    static void check(int ch, int x){
        switch(ch){
            case 1:
                evenOdd(x);
                break;
            case 2:
                prime(x);
                break;
            default:
                System.out.println("Enter correct option.");
        }
    }
    static void numberOp(){
        int element, n, choice;
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>nums = new ArrayList<Integer>();
        System.out.print("Enter the no. of element:");
        n=sc.nextInt();
        System.out.print("Enter the elements:");
        for (int i=0; i<n; i++){
            element = sc.nextInt();
            nums.add(element);
        }
        System.out.println("Enter the Operation: \n1. Even or Odd. \n2. Prime No.");
        choice=sc.nextInt();
        Iterator itr = nums.iterator();
        count=0;
        while(itr.hasNext()){
            check(choice, (int)itr.next());
        }
        if(choice==1){
            System.out.println("Total no. of Even no. is: "+count);
            System.out.println("Total no. of Odd no. is: "+(nums.size()-count));
        } else {
            System.out.println("Total no. of Prime no. is: "+count);
            System.out.println("Total no. of Non Prime no. is: "+(nums.size()-count));
        }
    }
    static void stringOp(){
        int n;
        String word;
        ArrayList<String> words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            word=sc.next();
            words.add(word);
        }
        count=0;
        for (String w:words){
            checkPalindrome(w);
        }
        System.out.println("Total no. of palindrome is: "+count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Option: \n1. String \n2. Integer");
        int ch = sc.nextInt();
        if (ch==2)
            numberOp();
        else
            stringOp();
    }
}
