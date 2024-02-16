public class Faculty extends Person{
    private myDate HireDate;
    private String FacultyID;
    Faculty(){
        this.firstName ="";
        this.lastName = "";
        this.HireDate= new myDate(0,0,0);
        this.FacultyID= "";
    }
    Faculty(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.HireDate= new myDate(0,0,0);
        this.FacultyID= "";
    }
    Faculty(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.HireDate= new myDate(0,0,0);
        this.FacultyID= "";
    }
    Faculty(String _firstName, String _lastName, myDate _hdate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.HireDate = new myDate(_hdate);
        this.FacultyID= "";
    }
    Faculty(String _firstName, String _lastName, String _facultyID, myDate _hdate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.HireDate = new myDate(_hdate);
        this.FacultyID= _facultyID;
    }
    public void setFacultyID(String _FacultyID){
        this.FacultyID = _FacultyID;
    }
    public String getFacultyID(){
        return this.FacultyID;
    }
    public void setHireDate(myDate _newhdate){
        this.HireDate = new myDate(_newhdate);
    }
    public String getHireDate(){
        return this.HireDate.toString();
    }
    @Override
    public String toString() {
        return "Faculty {" +
                "First Name= " + firstName +
                ", Last Name= " + lastName +
                ", Faculty ID= " + getFacultyID() +
                ", Hiring Date= " + HireDate.toString()+ '}';
    }
}
