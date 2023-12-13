import java.util.*;
public class Complex
{
    float real,imaginary;
    Complex()
    {
    }
    Complex(float real,float imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    Complex add(Complex O1,Complex O2)
    {
        Complex O3=new Complex();
        O3.real=O1.real+O2.real;
        O3.imaginary=O1.imaginary+O2.imaginary;
        return O3;
    }
    Complex sub(Complex O1,Complex O2)
    {
        Complex O3=new Complex();
        O3.real=O1.real-O2.real;
        O3.imaginary=O1.imaginary-O2.imaginary;
        return O3;
    }
    Complex mul(Complex O1,Complex O2)
    {
        Complex O3=new Complex();
        O3.real=(O1.real*O2.real)-(O1.imaginary*O2.imaginary);
        O3.imaginary=(O1.real*O2.imaginary)+(O1.imaginary*O2.real);
        return O3;
    }
    Complex div(Complex O1,Complex O2)
    {
        float real,imag,deno;
        deno = (O2.real*O2.real + O2.imaginary*O2.imaginary);
        real = (O1.real*O2.real + O1.imaginary*O2.imaginary)/deno;
        imag = (O2.real*O1.imaginary - O1.real*O2.imaginary)/deno;
        System.out.println("Division = "+real+"+"+imag+"i");
        return null;
    }

    public static void main(String[] args)
    {
        int b;
        do
        {
            System.out.println("");
            Scanner obj=new Scanner(System.in);
            System.out.println("Available operations on complex number \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice =");
            int a=obj.nextInt();
            System.out.println("");
            System.out.println("Enter real part of 1st number = ");
            float r1=obj.nextFloat();
            System.out.println("Enter imaginary part of 1st number = ");
            float i1=obj.nextFloat();
            Complex O1=new Complex(r1,i1);
            System.out.println("");
            System.out.println("Enter real part of 2nd number = ");
            float r2=obj.nextFloat();
            System.out.println("Enter imaginary part of 2nd number = ");
            float i2=obj.nextFloat();
            Complex O2=new Complex(r2,i2);
            Complex O4=new Complex();
            System.out.println("");

            switch(a)
            {
                case 1:
                    O4=O4.add(O1, O2);
                    System.out.println("Addition = "+O4.real+"+"+O4.imaginary+"j");
                    System.out.println("");
                    break;
                case 2:
                    O4=O4.sub(O1, O2);
                    System.out.println("Subtraction = "+O4.real+"+"+O4.imaginary+"j");
                    System.out.println("");
                    break;
                case 3:
                    O4=O4.mul(O1, O2);
                    System.out.println("Multiplication = "+O4.real+"+"+O4.imaginary+"j");
                    System.out.println("");
                    break;
                case 4:
                    O4=O4.div(O1,O2);
                    break;

            }
            System.out.println("Do you want to repeat\n1.Yes\n2.No\nEnter your choice =");
            b =obj.nextInt();


        }while(b==1);
    }
}
