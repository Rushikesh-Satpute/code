public interface Strategy{
    public void pay(int amount);
}
//Paypal
package demoProject;
public class PayPal implements Strategy{
    private String emailId;
    private String password;
    public PayPal(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }
    public void pay(int amount){
        System.out.println(amount + " paid using PayPal. ");
    }
}
//Creditcard
package demoProject;
public class CreditCard implements Strategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    public CreditCard(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    public void pay(int amount) {
        System.out.println(amount +" paid with Credit/Debit card. ");
    }
}
//item
package demoProject;
public class item {
    private String upcCode;
    private int price;
    public item(String upc, int cost){
        this.upcCode=upc;
        this.price = cost;
    }
    public String getUpcCode(){
        return upcCode;
    }
    public int getPrice(){
        return price;
    }
}
//Shopping cart
package demo Project;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart{
    List<item>items;
    public ShoppingCart(){
        this.items=new ArrayList<item>();
    }
    public void addItem(item item) {
        this.items.add(item);
    }
    public void removeItem(item item){
        this.items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(item item: items){ sum += item.getPrice(); }
        return sum;
    }
    public void pay(Strategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
package demo Project;
public class ShoppingCartTest{
    public static void main(String args[]){
        ShoppingCart cart = new ShoppingCart();
        item item = new item("1234",10);
        item item = new item("5678",90);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new PayPal("myemail@ex.com","pwd"));
        cart.pay(new CreditCard("Aparna Bindage","1234567890","786","12/15"));
    }
}
