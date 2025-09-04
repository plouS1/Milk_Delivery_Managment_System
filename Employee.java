
/**
 * description of class Employee here.
 *
 * @author ()
 * @version (Jan 2023)
 */
public class Employee extends Person
{
    // instance variables -
    private int employeeId;
    private String role;

    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
    // initialise instance variables
     
    }
 public Employee(String name, String surnName, int nationalIdnum,long phoneNumber, int employeeId, String role)
    {
        super(name, surnName,nationalIdnum,phoneNumber);
        this.employeeId = employeeId;
        this.role = role;
    }
    
     public int getId() {

    return employeeId;
    }

    public void setId(int emId) {

    this.employeeId=emId;
    } 
    
    
     public String getRole() {

    return role;
    }

    public void setRole(int role) {

    this.employeeId= role;
    } 
    public String toString()  {

        return    (" The Employee "+ super.toString()+ "and has employee id "+employeeId+ "and his role is "+role);
       // return "Name and surname is : " + name + ",  " + surname + 
          //     " the National Id is: " + idNum+ "and the phone number is "+phoneNumber;
    }
   
} // class Employee

   


   