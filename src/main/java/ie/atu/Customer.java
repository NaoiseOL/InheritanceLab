package ie.atu;

public class Customer extends Person{
    private String customerNumber;
    private boolean mailingList;

    public Customer(String name,String address,String phone, String customerNumber,boolean mailinglist){
        super(name,address,phone);
        this.customerNumber = "";
        this.mailingList = true;
    }

    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }
    public String getCustomerNumber(){
        return customerNumber;
    }

    public void setMailingList(boolean mailingList){
        this.mailingList=mailingList;
    }

    public boolean isMailingList() {
        return mailingList;
    }
}
