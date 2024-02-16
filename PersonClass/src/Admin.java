public class Admin extends Person{
    private myDate HireDate;
    private String AdminID;
    Admin(){
        this.firstName ="";
        this.lastName = "";
        this.HireDate= new myDate(0,0,0);
        this.AdminID= "";
    }
    Admin(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.HireDate= new myDate(0,0,0);
        this.AdminID= "";
    }
    Admin(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.HireDate= new myDate(0,0,0);
        this.AdminID= "";
    }
    Admin(String _firstName, String _lastName, myDate _hdate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.HireDate = new myDate(_hdate);
        this.AdminID= "";
    }
    Admin(String _firstName, String _lastName, String _adminID, myDate _hdate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.HireDate = new myDate(_hdate);
        this.AdminID= _adminID;
    }
    public void setAdminIDID(String _AdminID){
        this.AdminID = _AdminID;
    }
    public String getFacultyID(){
        return this.AdminID;
    }
    public void setHireDate(myDate _newhdate){
        this.HireDate = new myDate(_newhdate);
    }
    public String getHireDate(){
        return this.HireDate.toString();
    }
    @Override
    public String toString() {
        return "Admin {" +
                "First Name= " + firstName +
                ", Last Name= " + lastName +
                ", Admin ID= " + AdminID +
                ", Hiring Date= " + HireDate.toString()+ '}';
    }
}
