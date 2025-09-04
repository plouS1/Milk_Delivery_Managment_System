public class Supplier extends Person implements java.io.Serializable  {

//private int Id;
//private String name;
//private long phoneNumber;
private String location;

    public Supplier() {
      // TODO Auto-generated constructo

    }

//Supplier (int Id, String name, String location, long phoneNumber){

//    this.name=name;
//    this.Id=Id;
//    this.location=location;
//    this.phoneNumber=phoneNumber;   

//}

Supplier (int Id, String name, String location, long phoneNumber){

    super(Id,name,phoneNumber);
    this.location=location;
     
}   // Person(int nationalIdnum, String name, long phoneNumber)
 
/*
public String getName() {

return name;
}

public void setName(String name) {

    this.name = name;
}

public int getId() {

    return Id;
}

public void setId(int Id) {

    this.Id=Id;
}




public long getphoneNumber() {

    return phoneNumber;
}

public void setphoneNumber(long phoneNumber) {

    this.phoneNumber=phoneNumber;
}

*/
public String getLocation() {

    return location;
}


public void setLocation (String location) {

    this.location=location;
}

public String toString() {

return "Name of supplier: " +super.getName()+  

" Personal supplier ID: " + super.getId() + " Location from where the Milk comes : " 
  + location + " Supplier's phone number : " + super.getphoneNumber() + "\n";    

}

public Supplier inputSupplier() {

    System.out.println("Input Supplier Details ");

    int Id = IBIO.inputInt("Type the supplier's Id ");
    String name = IBIO.input("Type the supplier name ");
    String location = IBIO.input("Type the location where the supplier has his heard ");
    long phoneNumber = IBIO.inputLong("Type the phone number of the supplier ");

    Supplier mySupply = new Supplier (Id,name,location,phoneNumber);

    return mySupply;
}//inputSupplier this method is to add a supplier but much simpler and the user does not need to have internal accesse to the code to do this 


}//Supplier