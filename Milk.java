import java.util.Date;


public class Milk implements java.io.Serializable {

private int SupplierId;
private Double Quantity;
private String TypeOfMilk;
private Date date;

 public Milk() {

      // TODO Auto-generated constructor stub
    }

Milk (int SupplierId, Double Quantity, String TypeOfMilk, Date date){

    this.SupplierId = SupplierId;
    this.Quantity = Quantity;
    this.TypeOfMilk = TypeOfMilk;
    this.date= date;
}


public int  getSupplierId() {

    return SupplierId;
}

public void setSupplierId(int SupplierId) {

    this.SupplierId = SupplierId;
}


public Double getQuantity() {

    return Quantity;
}

public void setQuantity(Double Quantity) {

    this.Quantity = Quantity;
}


public String getTypeOfMilk() {
    
    return TypeOfMilk;
}


public void setTypeOfMilk(String TypeOfMilk) {

    this.TypeOfMilk=TypeOfMilk;
}


public Date getDate() {
    
    return date;
}


public void setDate(Date date) {

    this.date=date;
}

public String toString() {
  
    
return "Suplier Id: " +SupplierId+  

" Quantity in Kilos " + Quantity + " "

        + " Type of Milk : " +TypeOfMilk+" the date collected is " +date;

}

public Milk inputMilk() {

    System.out.println("Input Milk Details");
    int Id = IBIO.inputInt("Type in the Milk supplier's Id ");
    double Quantity= IBIO.inputInt("Type the milk quantity ");
    String name = IBIO.input("Type the Milk's type ");
    String myDate = IBIO.input("Type the Milk's collection date MM/dd/yyyy???? ");

        
    Milk myMilkSupply = new Milk (Id, Quantity, name, date);

    return myMilkSupply;
} // input milk end 


public Milk inputMilkwithId(int myid) {

    System.out.println("Input Milk Details");
    //Id = IBIO.inputInt("Type in the Milk supplier's Id ");
   // int Id = myid;
    double Quantity= IBIO.inputInt("Type the milk quantity ");
    String name = IBIO.input("Type the Milk's type ");
    String myDate = IBIO.input("Type the Milk's collection date MM/dd/yyyy???? ");
       Date date = new Date(myDate);    
        
    Milk myMilkSupply = new Milk (myid, Quantity, name, date);

    return myMilkSupply;
} // input milk end 
}// end class