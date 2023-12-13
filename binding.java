import java.util.Scanner;
abstract class shape {
    private double height;
    private double width;

    public void setvalues(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double get_height() {
        return height;
    }
    public double get_width() {
        return width;
    }
    public abstract double compute_area();
}

class Rectangle extends shape {
    public double compute_area() {
        return get_height() * get_width();
    }
}
class Triangle extends shape {
    public double compute_area() {
        return get_height() * get_width() / 2;
    }
}
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check, ch, h, w;
        shape s;
        do {
            System.out.println("Select Shape:");
            System.out.println("1.Rectangle\n2.Triangle\n3.Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Height:");
                    h = sc.nextInt();
                    System.out.println("Enter Width:");
                    w = sc.nextInt();
                    Rectangle r = new Rectangle();
                    s = r;
                    s.setvalues(h, w);
                    System.out.println("Area of Rectangle is " + s.compute_area());
                    break;
                case 2:
                    System.out.println("Enter Height:");
                    h = sc.nextInt();
                    System.out.println("Enter Width:");
                    w = sc.nextInt();
                    Triangle t = new Triangle();
                    s = t;
                    s.setvalues(h, w);
                    System.out.println("Area of Triangle is " + s.compute_area());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
            }
            System.out.println("Do you want to continue?\n1.Yes\n2.No");
            check = sc.nextInt();
        } while (check == 1);
        System.out.println("End of Program...");
    }
}
