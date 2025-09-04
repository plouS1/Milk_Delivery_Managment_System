
/**
 *  description of class Person here.
 *
 * @author ()
 * @version (Jan 23)  
 */
public class Person  implements java.io.Serializable
{
    // instance variables  
    private String name;
    private String surname;
    private int idNum;
    private long phoneNumber;
    
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        // initialise instance variables
    }
 // Constructor
    Person(String name, String surnName, int nationalIdnum,long phoneNumber) {

        this.name = name;
        this.surname = surnName;
        this.idNum = nationalIdnum;
        this.phoneNumber=phoneNumber;
    } 

    Person(int nationalIdnum, String name, long phoneNumber) {

        this.idNum = nationalIdnum;
        this.name = name;
        this.phoneNumber=phoneNumber;
    } 
   public String getSurname() {

    return surname;
    }

    public void setSurname(String sname) {

    this.surname = sname;
        }
        
    public String getName() {

    return name;
    }

    public void setName(String name) {

    this.name = name;
        }

    public int getId() {

    return idNum;
    }

    public void setId(int Id) {

    this.idNum=Id;
    } 
    
    public long getphoneNumber() {

    return phoneNumber;
   }

   public void setphoneNumber(long phoneNumber) {

    this.phoneNumber=phoneNumber;
   }
   
     public String toString()  {

        return "Name and surname is : " + name + ",  " + surname + 
               " the National Id is: " + idNum+ "and the phone number is "+phoneNumber;
    }
}   // Person class

