import java.util.regex.Pattern;

public class BankAccount {
    private int number;
    private int balance;
    private String customerName;
    private String customerMail;
    private String customerPhone;

    public void setNumber(int number){
        this.number = number;
    }

    public void setBalance(int amount){
        this.balance = amount;
    }

    public void setCustomerName(String customerName){
        String pattern = "(\\w)*\\s(\\w)*";

        if(customerName.matches(pattern)){
            this.customerName = customerName;
        } else {
            this.customerName = "Invalid Name";
        }
    }

    public void setCustomerMail(String mail){
        String pattern = "(\\w)*[@](\\w)*\\.(\\w){1,3}";

        if(mail.matches(pattern)){
            this.customerMail = mail;
        } else {
            this.customerMail = "Invalid Address";
        }
    }

    public void setCustomerPhone(String number){
        String pattern = "(\\d){2}(\\s)(\\d){3}\\s(\\d){2}\\s(\\d){2}|([+](\\d){2}\\s)?((\\d){3}\\s){2}(\\d){3}";

        if(number.matches(pattern)){
            this.customerPhone = number;
        } else {
            this.customerPhone = "Invalid Phone";
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
