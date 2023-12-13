import java.util.Scanner;
public interface Vehicle {
    void gearchange(int a);
    void speedup(int a);
    void applybreak(int a);
    Scanner sc=new Scanner(System.in);
    public void get_input();

}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    int increspeed;
    int decspeed;
    public void get_input(){
        System.out.println("Gear of bicycle=");
        gear=sc.nextInt();
        System.out.println("Speed of bicycle=");
        speed=sc.nextInt();
    }
    public void display(){
        System.out.println("Gear is:" +gear);
        System.out.println("Speed is:" +speed);
    }
    public void gearchange(int newgear){
        gear=newgear;
    }
    public void speedup(int increase_speed){
        increspeed=speed+increase_speed;
    }
    public void applybreak(int decrease_speed){
        decspeed=speed-decrease_speed;
    }
    public void show(){
        System.out.println("New gear of bicycle:"+gear);
        System.out.println("Speedup of bicycle:"+increspeed);
        System.out.println("Apply break of bicycle:"+decspeed);
    }
}
class car implements Vehicle{
    int speed;
    int gear;
    int increspeed;
    int decspeed;
    public void get_input(){
        System.out.println("Gear of car=");
        gear=sc.nextInt();
        System.out.println("Speed of car=");
        speed=sc.nextInt();
    }
    public void display(){
        System.out.println("Gear is:" +gear);
        System.out.println("Speed is:" +speed);
    }
    public void gearchange(int newgear){
        gear=newgear;
    }
    public void speedup(int increase_speed){
        increspeed=speed+increase_speed;
    }
    public void applybreak(int decrease_speed){
        decspeed=speed-decrease_speed;
    }
    public void show(){
        System.out.println("New gear of car:"+gear);
        System.out.println("Speedup of car:"+increspeed);
        System.out.println("Apply break of car:"+decspeed);
    }
}
class bike implements Vehicle{
    int speed;
    int gear;
    int increspeed;
    int decspeed;
    public void get_input(){
        System.out.println("Gear of bike=");
        gear=sc.nextInt();
        System.out.println("Speed of bike=");
        speed=sc.nextInt();
    }
    public void display(){
        System.out.println("Gear is:" +gear);
        System.out.println("Speed is:" +speed);
    }
    public void gearchange(int newgear){
        gear=newgear;
    }
    public void speedup(int increase_speed){
        increspeed=speed+increase_speed;
    }
    public void applybreak(int decrease_speed){
        decspeed=speed-decrease_speed;
    }
    public void show(){
        System.out.println("New gear of bike:"+gear);
        System.out.println("Speedup of bike:"+increspeed);
        System.out.println("Apply break of bike:"+decspeed);
    }
}
class test{
    public static void main(String args[]){
        Bicycle b1=new Bicycle();
        car c1=new car();
        bike o1=new bike();
        b1.get_input();
        b1.display();
        b1.gearchange(10);
        b1.speedup(50);
        b1.applybreak(20);
        b1.show();
        c1.get_input();
        c1.display();
        c1.gearchange(20);
        c1.speedup(40);
        c1.applybreak(30);
        c1.show();
        o1.get_input();
        o1.display();
        o1.gearchange(10);
        o1.speedup(50);
        o1.applybreak(20);
        o1.show();
    }
}
