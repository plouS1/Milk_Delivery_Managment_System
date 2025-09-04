import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {

ArrayList<Supplier> SupplierStorageList = new ArrayList<Supplier>();
//ArrayList<Milk> milkStorageList = new ArrayList<Milk>();        
LinkedList<Milk> milkStorageList = new LinkedList<Milk>();      

String  myMilkFile = ("c:\\testIA\\myMilk.ser");
String  mySuppliersFile = ("c:\\testIA\\mySuppliers.ser");


public Main() {
System.out.println ("Welcome to my program");    


String sDate1="31/12/1998";
String sDate2="12/12/2015";

/**

try
{ 
    
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
    System.out.println(sDate1+"\t"+date1);
       
    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); 
    date1=formatter1.parse(sDate1);
    System.out.println(sDate1+"\t"+date1);
       
    
    Date date2 = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");  
    String strDate = formatter.format(date2);  
    System.out.println(" Date Format with dd is the simpliest MMMM yyyy : "+strDate); 
     System.out.println(" sketo Date Format with dd MMMM yyyy : "+date2); 
    
    
      Date date3 = new Date("12/12/2017");
      System.out.println("  The date is set current date is " + date3);
       System.out.println(" sketo Date Format with dd MMMM yyyy : "+date3); 
      
      
       Date date4 = new Date(2017, 05, 11);
      System.out.println("  The date is set current date is " + date4);
      
     
            
 
}
catch (java.text.ParseException pe)
{
    pe.printStackTrace();
}
//System.out.println(sDate1+"\t"+date1);

    //methodInputSupplier();        // used for testing
 */
 //public Employee(String name, String surnName, int nationalIdnum,long phoneNumber, int employeeId)
Employee e1= new  Employee("Peter","Doole", 1001567,2105623456, 100045, "employee");
Employee e2= new  Employee("Maria","Mule",  2001567,2104523457, 100046, "manager");

String name = IBIO.input("Type the employee user name ");  
long employeeID = IBIO.inputLong("Type in your employee ID number: ");
   System.out.println();   
   
// if ( name.equals(e1.getName()) && (employeeID == 100045) && "employee".equals(e1.getRole() )  )
if ( name.equals(e1.getName()) && (employeeID == 100045) && "employee".equals(e1.getRole()) || 
     name.equals(e2.getName()) && (employeeID == 100046) &&  "manager".equals(e2.getRole())  )
{     System.out.println("You are authorised to proceed  ");   // start of if 


char intro;    
do {     
// Character input 


 if (  name.equals(e2.getName()) && (employeeID == 100046) && "manager".equals(e2.getRole())  )
 {
 System.out.println("   Press S to for Suppliers menu  ");
 System.out.println("   Press M for Milk menu  ");
 System.out.println("   Press C to close the program:- ");  
 System.out.print  ("   ------------------------------- ");
 } // if for Manager
 else 
 {
 System.out.println("   Press M for Milk menu  ");
 System.out.println("   Press C to close the program:- ");  
 System.out.print  ("   ------------------------------- ");
 } // if for employee
 //intro = IBIO.inputChar(" Press S for Suppliers menu  and M for Milk menu  or C to close the program:- ");
 intro = IBIO.inputChar("");
intro  = Character.toUpperCase(intro);  

    // Print the read value
    // System.out.println("You have selected  = "+intro);  // for testing
        System.out.println(); 
  if (intro == 'S'  && (employeeID==e2.getId() ) )  // allow only MANAGfileOuter(); fileOuter();  to add supplier 
    {    
    System.out.println("----------  Suppliers menu  ----------");
     
    fileOuter();            //  load supplier data from .ser file 
    viewMethodSupplier();
    fileTransmitter ();     // saves - loads suppliers data INTO the file for  storage

    } // if
  else 
       if (intro == 'M') 
       {
       System.out.println("---------  Milk Menu  ---------");
       
       fileOuter();            //  load supplier data from .ser file 
       fileOuterMilk(); 
       viewMethodMilk();
          //     
       fileTransmitterMilk(); 
       
       } //else if
       else if  (intro == 'C') 
       {
       System.out.println("You typed  "+intro+" this will terminate the program");
       }//else if
       else  System.out.println ("Wrong input try again: ");
    
} while  (Character.toUpperCase(intro) != 'C');   
   // methodInputMilk();
}   //   of 
else    
System.out.println("You are not authorized to proceed. Program terminated  ");
   // reportMonthlyMilk();
   

    //milkStorageList ();

}

public static void main(String[] args) {

new Main();
}

public void methodInpuSupplier() {

System.out.println("Is my list of supplier empty: " + SupplierStorageList.isEmpty());

   Supplier supplierOne = new Supplier (1002, "Dimitra", "Spata", 694421254);
   SupplierStorageList.add(supplierOne);
 
   Supplier supplierFour = new Supplier();
   supplierFour.inputSupplier();

   SupplierStorageList.add(supplierFour);

System.out.println("Is my list of supplier empty: " + SupplierStorageList.isEmpty());

}
//method list this basically to add a supplier  (not needed used during testing )


public void displayListSupplier() {

    System.out.println("Supplier Details: ");

    Iterator itr = SupplierStorageList.iterator();

    while (itr.hasNext()) {

        Supplier sp = (Supplier)itr.next();

        System.out.println (sp.toString() );

    }   // while

    }
//display list 

public void searchMethodbyPhoneNumber() {

    boolean found = false;
    int supplierToFind = IBIO.inputInt("Type the specific phone number you are looking for");

    Iterator itr = SupplierStorageList.iterator();

    while (itr.hasNext()) {
    Supplier sp = (Supplier)itr.next();

    if (supplierToFind == sp.getphoneNumber()){
        System.out.println("Name : "+sp.getName()+ "Phone Number :" +sp.getphoneNumber());
     found = true;
}//if
  
}//while

if (found == false)
    System.out.println("A supplier with phone number :" +supplierToFind + "has not been found");
  
}   //search method by supplier's phone numebr

    public void searchMethodByName() {

        boolean found =  false;

        String supplierToFind = IBIO.inputString("Type the supplier's name you are looking for: ");
        Iterator itr = SupplierStorageList.iterator();
  
    while (itr.hasNext()) {

    Supplier sp = (Supplier)itr.next();

        if (supplierToFind.contains (sp.getName())) {
        System.out.println("Name : " +sp.getName());
         found = true;
        } // if statment
    } // while loop 

        if (found = false) {
        System.out.println("A supplier with name"+supplierToFind +"does not exist");
        } // if statment

}

//search method by supplier's name     
    public void searchMethodBySupplierId() {

        boolean found =  false;
        int supplierToFind = IBIO.inputInt("Type the supplier's id you are looking for ");

        Iterator itr = SupplierStorageList.iterator();

    while (itr.hasNext()) {

    Supplier su = (Supplier)itr.next();

        if (supplierToFind==(su.getId())) {
        System.out.println("Supplier ID : " +su.getId());
        found = true;
        } // if statment

    } // while loop 

        if (found = false) {
        System.out.println("A supplier with Id "+supplierToFind +" does not exist");    
                           }

    }   // search by inputting supplier Id     

    
     public boolean supplierIdexists( int supplierToFind) {

        boolean found =  false;
      //  int supplierToFind = IBIO.inputInt("Type the supplier's id-- ");

        Iterator itr = SupplierStorageList.iterator();

    while (itr.hasNext()) {

    Supplier su = (Supplier)itr.next();

        if (supplierToFind==(su.getId())) {
        //System.out.println("Supplier ID : " +su.getId());
        found = true;
       
        } // if statment
      
    } // while loop 
          return found;
        //if (found = false) {
      //  System.out.println("A supplier with Id "+supplierToFind +" does not exist");    
    }   // search by inputting supplier id
    
    
    public void searchMethodByLocation() {

        boolean found =  false;

        String supplierToFind = IBIO.inputString("Type the location where the supplier can be from");
        Iterator itr = SupplierStorageList.iterator();

    while (itr.hasNext()) {

    Supplier su = (Supplier)itr.next();

        if (supplierToFind.contains(su.getLocation())) {
        System.out.println("Supplier ID : " +su.getName());
        found = true;
        } // if statment

    } // while loop 

        if (found = false) {
        System.out.println("A supplier with Id "+supplierToFind +" does not exist");    
        }
    }    //search method by location

    public void deleteSupplierBySupplierID() {

    System.out.println ("Size of Supplier list" + SupplierStorageList.size());

    boolean found = false ;
    int SupplierToDelete = IBIO.inputInt("Type in the Supplier's ID to delete the Supplier from the list");

    Iterator itr= SupplierStorageList.iterator();

    while (itr.hasNext()) {
    Supplier sp= (Supplier) itr.next();

    if (SupplierToDelete == (sp.getId()) ) {
      itr.remove();  
    System.out.println("deleted Supplier: " + sp.getName() + sp.getId() );
    found = true;
    }// if      

    } //while

    System.out.println ("Size of Supplier list after removal is" + SupplierStorageList.size());   

    if (found == false)
    System.out.println("The supplier has not been found nor deleted");

    }
    //Search by name for the details of the supplier, 
    // and search for the quantity of milk delivered by the supplier in kilos by date.
    
    public void searchNameforQuantity() {

        boolean found =  false;

        String supplierToFindName = IBIO.inputString("Type the supplier's name you are looking for: ");
        Iterator itr = SupplierStorageList.iterator();
  
    while (itr.hasNext()) {

    Supplier sp = (Supplier)itr.next();

        if (supplierToFindName.contains (sp.getName())) {
        System.out.println(" The suppliers details are: "+sp.toString());
         found = true;
        } // if statment
    } // while loop 

 if (found == false) {
    System.out.println("A supplier with name: "+supplierToFindName +" does not exist");
    } // if statment

 else  
    if (found == true) 
    {   //   05/22/201
String myDate = IBIO.input("Type the Milk's collection date to look for MM/dd/yyyy ");
Date mydate = new Date(myDate);

//  System.out.println("Searching for the : "+ mydate);

 boolean isfound =  false;
 int supplierToFind = IBIO.inputInt("Type in the supplier's id who has delivered milk ");
    
 Iterator myitr = milkStorageList.iterator();
 double totalQuantity=0; // initialze 
                                
while (myitr.hasNext()) {
        
    Milk su = (Milk)myitr.next();
        // System.out.println("Date input equals  Date in File : "+mydate.equals(su.getDate()));
         //  System.out.print("The month to look for  is  " + (date1.getMonth() +1) ); 
         //  System.out.println(" The month recorded in file is  " + (1+su.getDate().getMonth() ) );   
    if ( mydate.equals(su.getDate() ) &&  ( supplierToFind==(su.getSupplierId())  ) ) 
  
    // (mydate.getMonth() +1) == ( su.getDate().getMonth()+1  ) &&  (mydate.getYear()==su.getDate().getYear() ) 
    //    &&  (supplierToFind==(su.getSupplierId()) )  )       
    {  //  System.out.println("Date input equals  Date in File : "+mydate.equals(su.getDate()));
       //      System.out.println("Quantity delivered in Kilos is : " +su.getQuantity());
    totalQuantity = totalQuantity + su.getQuantity();    // add milk delivered.
    isfound = true;
    } // if statment

} // while loop 
       SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");  
       String strDate = formatter.format(mydate);  
 if (isfound == false) {
   System.out.println("A supplier with Id: "+supplierToFind +" has not delivered milk on "+strDate);    }
 else {
   System.out.println(""); 
  //  System.out.print("During the : "+ (mydate.getMonth()+1)+" month of year: "+ (1900+mydate.getYear() ) );   
  //  System.out.println(" Date Format with dd is the simpliest MMMM yyyy : "+strDate);   
   System.out.println("The total quantity of milk delivered by "+supplierToFindName +" on "+ strDate+ " is "+  totalQuantity + " kilos" );
     }  //else
    
        
    }   // else
}   // end of method
    
    //  data is saved in a .ser file
    public void fileTransmitter(){
    try {

        FileOutputStream fileOut =
        new FileOutputStream(mySuppliersFile);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(SupplierStorageList);
        out.close();

        fileOut.close();

        System.out.printf("Serialized data is saved in the file:  "+ mySuppliersFile);  System.out.println();
     } catch (IOException i) {
        i.printStackTrace();
     }

    }   // end of fileTransmitter for supplier (deserlization)

    public void  fileOuter() {        

    try {

       //  FileInputStream fileIn = new FileInputStream("/tempSotiris/mySuppliers.ser");
        FileInputStream fileIn = new FileInputStream(mySuppliersFile);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         SupplierStorageList = (ArrayList) in.readObject();

         in.close();
         fileIn.close();

      } catch (IOException i) {

         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {

         System.out.println("Suppliers file not found");
         c.printStackTrace();
         return;
      }

}   // fileOuter for supplier (serilization) 

public void viewMethodSupplier() {

char selection = ' ';    

do {

// load data from files 
System.out.println();

System.out.println("Please type 1 to present the Suppliers");
System.out.println("Please type 2 to add a new Suppliers in the database");
System.out.println("Please type 3 to search for a certain Supplier by their Supplier ID, Name, Phone Number or Location");
System.out.println("Please type 4 to remove a supplier by their Supplier ID");
System.out.println("Please type X to return to main menu");

selection = IBIO.inputChar(" ");
selection = Character.toUpperCase(selection);

switch ( selection )
{
case '1': System.out.println ("Suppliers: ") ;

        displayListSupplier();
        break;
         
case '2': System.out.println("Add a new supplier");

    int id = IBIO.inputInt("Type the supplier's Id ");
    if (!supplierIdexists(id ) )  // if suppliers does not exist ask for the details 
    {   String name =          IBIO.input("Type the supplier name ");
        String location =      IBIO.input("Type the location where the supplier has his heard ");
        long phoneNumber = IBIO.inputLong("Type the phone number of the supplier ");

        Supplier thisSupplier = new Supplier (id,name,location,phoneNumber);
           //  System.out.println("-----The new Supplier exists  "+ supplierIdexists(thisSupplier.getId())  );
          //  System.out.println("-----The Supplier you typed is  "+  thisSupplier.getId()  );
           SupplierStorageList.add(thisSupplier );  // input data and  place in the list 
      //  SupplierStorageList.add(thisSupplier.inputSupplier () );  // input data and  place in the list 
       }
    else System.out.println("-----The Supplier "+ id+" already exists in the file it can not be added.-----");
        break;
        
        //   System.out.println("-----The Supplier id you typed is  "+ thisSupplier.getId()); 
        //   System.out.println("-----The Supplier iname you typed is  "+ thisSupplier.getName()); 
           
    //    if (!supplierIdexists(thisSupplier.getId() ) )
    //   {  //  System.out.println("-----The new Supplier exists  "+ supplierIdexists(thisSupplier.getId())  );
          //  System.out.println("-----The Supplier you typed is  "+  thisSupplier.getId()  );
    //       SupplierStorageList.add(thisSupplier );  // input data and  place in the list 
      //  SupplierStorageList.add(thisSupplier.inputSupplier () );  // input data and  place in the list 
    //   }
       
case '3': char Search = IBIO.inputChar ("Type N to search by Name, I to search by ID, "+ " P to search by their phone number, and L by their Location");

            if (Character.toUpperCase(Search) ==    'N') searchMethodByName();

            else if (Character.toUpperCase(Search) == 'I') searchMethodBySupplierId();

            else if (Character.toUpperCase(Search) == 'P') searchMethodbyPhoneNumber();

            else if (Character.toUpperCase(Search) == 'L') searchMethodByLocation();

                 else System.out.println ("wrong inputs please re-check return to main menu");
            break;

case '4': System.out.println("Type the Id of the supplier you want to delete");
        deleteSupplierBySupplierID();
        break;
        
case 'X': System.out.println("Pressed X will be exiting Suppliers menu");
         break;
default:
    System.out.println("Invalid input, cheak again");

}//  switch

} while (Character.toUpperCase(selection) != 'X') ;

} // viewMethodSupplier end    


// ******************************** Milk *******************************
// report milk delevered in a month by supplier 
public void reportMonthlyMilk() {
  //   05/22/201
String myDate = IBIO.input("Type the Milk's collection date to look for MM/dd/yyyy ");
Date date1 = new Date(myDate);

System.out.print("Searching for the : "+ (date1.getMonth()+1) + " month ");

System.out.println("of the year: "+ (1900+date1.getYear() ) );

 boolean found =  false;
 int supplierToFind = IBIO.inputInt("Type in the supplier's id who has delivered milk ");
    
 Iterator itr = milkStorageList.iterator();
 double totalQuantity=0; // initialze 
                                
while (itr.hasNext()) {
                 
    Milk su = (Milk)itr.next();
    System.out.println("");   
         //  System.out.print("The month to look for  is  " + (date1.getMonth() +1) ); 
         //  System.out.println(" The month recorded in file is  " + (1+su.getDate().getMonth() ) );   
    if ( (date1.getMonth() +1) == ( su.getDate().getMonth()+1  ) &&  (date1.getYear()==su.getDate().getYear() ) 
        &&  (supplierToFind==(su.getSupplierId()) )  )
    {
        System.out.println("Quantity Delivered in Kilos : " +su.getQuantity());
    totalQuantity = totalQuantity + su.getQuantity();    // add milk delivered.
    found = true;
    } // if statment

} // while loop 
 
 if (found == false) {
   System.out.println("A supplier with Id"+supplierToFind +"does not exist");    }
 else {

   System.out.println(""); 
   System.out.print("During the : "+ (date1.getMonth()+1)+" month of year: "+ (1900+date1.getYear() ) );
   System.out.println("The total quantity is delivered is   " +  totalQuantity  );
     }  //else
}   // reportMonthlyMilk() 

public void methodInputMilk() {

System.out.println("Is my list of supplier empty: " + milkStorageList.isEmpty());

// Milk deliveryOne = new Milk (1201, 5001.0, "gidino", 12/12/2017);
// milkStorageList.add(deliveryOne);

//Milk deliveryTwo = new Milk (1202, 5002.0, "sheep");
//milkStorageList.add(deliveryTwo);

// milkStorageList.add(deliveryThree);

System.out.println("end of inputting milk");

}
   
public void displayListMilk() {

            System.out.println("Milk Details: ");

            Iterator itr = milkStorageList.iterator();
            
             int i = 1;
            while (itr.hasNext()) {
               System.out.print(" " + i+"-");
              //  int i = itr.nextIndex(); System.out.println(itr.next() + " is at index" + i); 
              //  System.out.println("index: " + itr.nextIndex() + " value: " + itr.next());
                Milk mk = (Milk)itr.next();   
                System.out.println (mk.toString());
                i++;
            }

            } //display list for milk

public void searchMethodForMilkByID() {

    boolean found =  false;
    int supplierToFind = IBIO.inputInt("Type in the supplier's id who has delivered milk ");
    Iterator itr = milkStorageList.iterator();

while (itr.hasNext()) {

Milk su = (Milk)itr.next();

    if (supplierToFind==(su.getSupplierId())) {
    System.out.println("Total Quantity Delivered in Kilos : " +su.getQuantity());
    found = true;
    } // if statment

} // while loop 

    if (found == false) {
    System.out.println("A supplier with Id "+supplierToFind +" has not delivered milk or does not exist");    
    }

}  //  searchMethodForMilkByID


public void viewMethodMilk() {

char selection = ' ';    

do {

// load data from files 
System.out.println();
System.out.println("PLease type 1 to present the quantity by Supplier Id");
System.out.println("Please type 2 to add new quantity of milk");
System.out.println("PLease type 3 to search for quantity of Milk delivered by specific Supplier");
System.out.println("PLease type 4 to display the total Milk delivered by specific Supplier");
System.out.println("PLease type 5 to display quantity of Milk delivered by specific Supplier by date");
System.out.println("PLease type 6 to delete a specific Milk delivery");
System.out.println("PLease type X to return to main menu");

selection = IBIO.inputChar(" ");
selection = Character.toUpperCase(selection);

switch ( selection )
{

case '1':   System.out.println (" Present Milk : ") ;
            displayListMilk();
            break;

case '2': System.out.println("Add a new Milk entry");
            
            int id = IBIO.inputInt("Type the supplier's Id ");
            if ( supplierIdexists(id ) )  // if suppliers exist enter the details 
            {
            Milk thisMilk = new Milk();   // declare create new object
            //milkStorageList.add(thisMilk.inputMilk());
             milkStorageList.add(thisMilk.inputMilkwithId (id) );  // bug fixed with date 
            }
            else System.out.println("-----The Supplier "+ id+" is not in the Suppliers list Milk can not be added.-----");
            break;   
 
            
            
case '3':   System.out.println("Search Milk Delivered by Supplier's ID");
            searchMethodForMilkByID();
            break;        
 
case '4':   System.out.println("Calculate total milk Delivered by Supplier's ID");
            totalquatityMilkByID();
            break;             
 
case '5':   System.out.println(" Display quantity of Milk delivered by specific Supplier by date");
            searchNameforQuantity();
            break;  
            
case '6':   System.out.println(" Delete a specific  Mlik delivery. Select which o delete: example 5");
            displayListMilk();
            int milknumber = IBIO.inputInt("Type the Milk delivery to be removed ");
            if ( (milknumber>0 || milknumber == 0)  && (milknumber<milkStorageList.size()) )
            // milkStorageList.isEmpty(
            milkStorageList.remove(milknumber-1 );  //  since we count from 0 to end in Lists
            else
            System.out.println("You entered a delivery that does not exist!");
            break; 
            
case 'X': System.out.println("Milk Menu Terminated ");
            break;

default:
    System.out.println("Invalid input, check again");
}    //switch

} while (selection != 'X') ;  // change input to upperclass
  //  while (Character.toUpperCase(selection) != 'X') ;  // change input to upperclass  NOT WORKING WHY?
} // viewMethodMilk    Character.toUpperCase(

    //  data is saved in a .ser file
    public void fileTransmitterMilk(){
    try {

        //FileOutputStream fileOut =  new FileOutputStream("myMilk.ser");
      //  FileOutputStream fileOut =  new FileOutputStream("myMilkFile");  why is it a bug????
        FileOutputStream fileOut =  new FileOutputStream(myMilkFile);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(milkStorageList);
        out.close();

        fileOut.close();

        System.out.printf("Serialized data is saved in the file "+myMilkFile);  System.out.println();
     } catch (IOException i) {
        i.printStackTrace();
     }

    }   // end of fileTransmitter for supplier (deserlization)

    public void  fileOuterMilk() {        
     //    String  myMilkFile = ("c:\\testIA\\myMilk.ser");  placed at top of program 
    try {   

       //  FileInputStream fileIn = new FileInputStream("/tempSotiris/mySuppliers.ser");  // never worked
       
      //  FileInputStream fileIn = new FileInputStream("myMilk.ser");   old
      
         FileInputStream fileIn = new FileInputStream(myMilkFile);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         milkStorageList = (LinkedList) in.readObject();      
            System.out.println("The file with the delivered  milk is in "+  fileIn.getFD() );
             // System.out.println("The file with the delivered  milk is in "+  fileIn.getFileName());
         in.close();
         fileIn.close();

      } catch (IOException i) {

         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {

         System.out.println("Milk file not found");
         c.printStackTrace();
         return;
      }

}   // fileOuter for supplier (serilization) 


public void totalquatityMilkByID() {

    boolean found =  false;
    int supplierToFind = IBIO.inputInt("Type in the supplier's id to calculate the delivered milk");
    Iterator itr = milkStorageList.iterator();

  Double sum = 0.0;
while (itr.hasNext()) {

Milk su = (Milk)itr.next();
  
    if (supplierToFind==(su.getSupplierId())) {
    System.out.println("Quantity Delivered in Kilos : " +su.getQuantity());
    sum = sum + su.getQuantity();
    found = true;
    } // if statment

} // while loop 

    if (found = false) {
    System.out.println("A supplier with Id"+supplierToFind +"does not exist");    
    }
 System.out.println("Total Quantity of Milk Delivered in Kilos is : " +sum);
}  //  searchMethodForMilkByID

}// main end 


 
 
/* notes on files
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html
 * 
 * 
 * https://mkyong.com/java/how-to-get-the-filepath-of-a-file-in-java/
 * 
 *
 * https://mkyong.com/java/how-to-read-file-in-java-fileinputstream/
 * 
 * 
 * https://jenkov.com/tutorials/java-io/fileinputstream.html    has alot on inputStream
 * https://zetcode.com/java/fileinputstream/
 * 
 * 
 * https://www.javatpoint.com/java-string-to-date
 * https://compiler.javatpoint.com/opr/test.jsp?filename=DateToStringExample2
 * https://www.geeksforgeeks.org/date-class-java-examples/* 
 * 
 * 
 * https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/?ref=rp
 * 
 *https://www.geeksforgeeks.org/linkedlist-indexof-method-in-java/

 * 
 * https://www.geeksforgeeks.org/object-serialization-inheritance-java/?ref=rp
 * 
 * 
 * https://www.tutorialspoint.com/how-to-remove-an-element-from-arraylist-or-linkedlist-in-java
 * 
 * 
 * https://www.geeksforgeeks.org/remove-element-arraylist-java/
 * /
 */