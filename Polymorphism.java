import  java.util.Scanner;
abstract class Publication
{
    String title;
    float price;
    int copies;
    abstract void setprice();
    abstract void salecopy();
}
class Book extends Publication
{
    String author;
    void ordercopies()
    {
    }
    public void setprice()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the name of book: ");
        title=sc.next();
        System.out.println("Enter the name of author: ");
        author=sc.next();
        System.out.println("Enter price: ");
        price=sc.nextInt();
        System.out.println("Enter copies: ");
        copies=sc.nextInt();
    }
    public void salecopy()
    {
        System.out.println("Name of book: "+title);
        System.out.println("Name of author: "+author);
        System.out.println("Price of book: "+price);
        System.out.println("Number of copies: "+copies);
        System.out.println("Total sale: "+copies*price);
    }
}
class Magazine extends Publication
{
    int quantity;
    String currentIssue;
    public void salecopy()
    {
        System.out.println("Name of magazine: "+title);
        System.out.println("Price of magazine: "+price);
    }
    public void setprice()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of magazine: ");
        title=sc.next();
        System.out.println("Order quantity: ");
        quantity=sc.nextInt();
        System.out.println("Price of magazine: ");
        price=sc.nextInt();
        System.out.println("Enter number of copies: ");
        copies=sc.nextInt();
    }
    public void receiveIssue()
    {
        System.out.println(" Enter currentIssue: ");
        Scanner sc=new Scanner(System.in);
        currentIssue=sc.next();
        System.out.println("You will receive " +currentIssue+ " soon.");
    }
}
class Polymorphism
{
    public static void main(String args[])
    {
        Book b=new Book();
        b.setprice();
        b.salecopy();
        Magazine m=new Magazine();
        m.setprice();
        m.salecopy();
        m.receiveIssue();
    }
}
