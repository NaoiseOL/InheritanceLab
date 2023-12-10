package ie.atu;
import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private String phone;

    public Person(){

    }

    public Person(String name,String address,String phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

    public void setPersonName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.name=scanner.nextLine();
    }

    public String getPersonName(){
        return name;
    }

    public void setPersonAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter address: ");
        this.address=scanner.nextLine();
    }

    public String getPersonAddress(){
        return address;
    }

    public void setPersonPhone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Phone Number: ");
        this.phone=scanner.nextLine();
    }

    public String getPersonPhone(){
        return phone;
    }

    @Override
    public String toString(){
        return "name= " + name + ", address= " + address + ", phone= " + phone;
    }
}
