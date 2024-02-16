public class Student extends Person{
    private myDate EnrollmentDate;
    private myDate GraduationDate;
    private String StudentID;
    Student(){
        this.firstName ="";
        this.lastName = "";
        this.EnrollmentDate = new myDate(0,0,0);
        this.GraduationDate = new myDate(0,0,0);
        this.StudentID = "";
    }
    Student(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.EnrollmentDate = new myDate(0,0,0);
        this.GraduationDate = new myDate(0,0,0);
        this.StudentID = "";
    }
    Student(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.EnrollmentDate = new myDate(0,0,0);
        this.GraduationDate = new myDate(0,0,0);
        this.StudentID = "";
    }
    Student(String _firstName, String _lastName, myDate _edate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.EnrollmentDate = new myDate(_edate);
        this.GraduationDate = new myDate(0,0,0);
        this.StudentID = "";
    }
    Student(String _firstName, String _lastName, myDate _edate, myDate _gdate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.EnrollmentDate = new myDate(_edate);
        this.GraduationDate = new myDate(_gdate);
        this.StudentID = "";
    }
    Student(String _firstName, String _lastName, String _studentID , myDate _edate, myDate _gdate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.EnrollmentDate = new myDate(_edate);
        this.GraduationDate = new myDate(_gdate);
        this.StudentID = _studentID;
    }
    public void setStudentID(String _studentID){
        this.StudentID = _studentID;
    }
    public String getStudentID(){
        return this.StudentID;
    }
    public void setEnrollmentDateDate(myDate _newedate){
        this.GraduationDate = new myDate(_newedate);
    }
    public String getEnrollmentDate(){
        return this.EnrollmentDate.toString();
    }
    public void setGraduationDate(myDate _newgdate){
        this.GraduationDate = new myDate(_newgdate);
    }
    public String getGraduationDate(){
        return this.GraduationDate.toString();
    }
    @Override
    public String toString() {
        return "Student {" +
                "First Name= " + firstName +
                ", Last Name= " + lastName +
                ", Student ID= " + getStudentID() +
                ", Enrollment Date= " + EnrollmentDate.toString() +
                ", Graduation Date= " + GraduationDate.toString() +
                '}';
    }
}
