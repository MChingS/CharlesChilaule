public class Student implements StudentService{// has a relationship

    //encapsulation making attributes private
    private String studLname="";
    private String studFname="";
    private String studIDno="";
    private String studGrade="";
    private char studGender=' ';
    private String studNo="";

    //encapsulation start
    public String getStudLname() {
        return studLname;
    }

    public void setStudLname(String studLname) {
        this.studLname = studLname;
    }

    public String getStudFname() {
        return studFname;
    }

    public void setStudFname(String studFname) {
        this.studFname = studFname;
    }

    public String getStudIDno() {
        return studIDno;
    }

    public void setStudIDno(String studIDno) {
        this.studIDno = studIDno;
    }

    public String getStudGrade() {
        return studGrade;
    }

    public void setStudGrade(String studGrade) {
        this.studGrade = studGrade;
    }

    public char getStudGender() {
        return studGender;
    }

    public void setStudGender(char studGender) {
        this.studGender = studGender;
    }

    public String getStudNo() {
        return studNo;
    }

    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }
    //encapsulation end

    //methods start
    @Override
    public void learn() {
       System.out.println("Common method for all classes which is learn in student class");
    }

    @Override
    public void playSport() {
        System.out.println("Play sport method in student class");
    }

    @Override
    public void monitorClass() {
        System.out.println("Monitor method in student class");
    }
    //methods end
}
