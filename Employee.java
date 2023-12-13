import java.util.*;
public class Employee{
    String name,mailId,add;
    int empId;
    long mobileNo;
    Scanner r = new Scanner(System.in);
    void getData(){
        System.out.println("Enter employee Id: ");
        empId = r.nextInt();
        System.out.println("Enter employee name: ");
        name = r.next();
        System.out.println("Enter employee Mail id: ");
        mailId = r.next();
        System.out.println("Enter employee mobile number: ");
        mobileNo = r.nextLong();
        System.out.println("Enter employee address: ");
        add = r.next();
    }
    void displayData(){
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Mobile number: "+mobileNo);
        System.out.println("Employee Mail Id: "+mailId);
        System.out.println("Employee Address: "+add);
    }
}
class Programmer extends Employee{
    double bp,da,hra,pf,club,Gross,net;
    void getProgrammer() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter your basic pay: ");
        bp = r.nextDouble();
    }
    void calProgrammer(){
        da = bp*0.97;
        hra = bp*0.1;
        pf = bp*0.12;
        club = bp*0.001;
        Gross = bp+da+hra;
        net = Gross-pf-club;
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("\tPAY SLIP");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("Basic pay: "+bp);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("Club: "+club);
        System.out.println("Gross: "+Gross);
        System.out.println("Net Salary: "+net);
    }
}
class assistantProgrammer extends Employee{
    double bp,da,hra,pf,club,Gross,net;
    void getAssistantProgrammer() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter your basic pay: ");
        bp = r.nextDouble();
    }
    void calAssistantProgrammer(){
        da = bp*0.97;
        hra = bp*0.1;
        pf = bp*0.12;
        club = bp*0.001;
        Gross = bp+da+hra;
        net = Gross-pf-club;
        System.out.println("~~~~~~");
        System.out.println("\tPAY SLIP");
        System.out.println("~~~~~~");
        System.out.println("Basic pay: "+bp);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("Club: "+club);
        System.out.println("Gross: "+Gross);
        System.out.println("Net Salary: "+net);
    }
}
class associateProgrammer extends Employee{
    double bp,da,hra,pf,club,Gross,net;
    void getAssociateProgrammer() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter your basic pay: ");
        bp = r.nextDouble();
    }
    void calAssociateProgrammer(){
        da = bp*0.97;
        hra = bp*0.1;
        pf = bp*0.12;
        club = bp*0.001;
        Gross = bp+da+hra;
        net = Gross-pf-club;
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("\tPAY SLIP");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("Basic pay: "+bp);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("Club: "+club);
        System.out.println("Gross: "+Gross);
        System.out.println("Net Salary: "+net);
    }
}
class Professor extends Employee{
    double bp,da,hra,pf,club,Gross,net;
    void getProfessor() {
        System.out.println("Enter your basic pay: ");
        bp = r.nextDouble();
    }
    void calProfessor(){
        da = bp*0.97;
        hra = bp*0.1;
        pf = bp*0.12;
        club = bp*0.001;
        Gross = bp+da+hra;
        net = Gross-pf-club;
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("\tPAY SLIP");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("Basic pay: "+bp);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("Club: "+club);
        System.out.println("Gross: "+Gross);
        System.out.println("Net Salary: "+net);
    }
}
class salary{
    public static void main(String args[]){
        int ch,cont;
        do{
            System.out.println("PAYROLL");
            System.out.println("1. Programmer \n2. Assistant Programmer \n3. Associate Programmer \n4. Professor");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    Programmer p = new Programmer();
                    p.getData();
                    p.getProgrammer();
                    p.displayData();
                    p.calProgrammer();
                    break;
                } case 2:{
                    assistantProgrammer a = new assistantProgrammer();
                    a.getData();
                    a.getAssistantProgrammer();
                    a.displayData();
                    a.calAssistantProgrammer();
                    break;
                } case 3: {
                    associateProgrammer a1 = new associateProgrammer();
                    a1.getData();
                    a1.getAssociateProgrammer();
                    a1.displayData();
                    a1.calAssociateProgrammer();
                    break;
                } case 4:{
                    Professor p1 = new Professor();
                    p1.getData();
                    p1.getProfessor();
                    p1.displayData();
                    p1.calProfessor();
                    break;
                }
            }
            System.out.println("Press 0 for Quit and 1 for Continue.");
            cont = sc.nextInt();
        }while(cont==1);
    }
}