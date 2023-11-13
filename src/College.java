import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class College
{
    private int Uid;
    private String name;
    private String address;

    private int Totalfees;

    private HashMap<Integer , List<Student>> collegeVsStudent;

    public College(int uid, String name, String address, int Totalfees, HashMap<Integer, List<Student>> collegeVsStudent) {
        Uid = uid;
        this.name = name;
        this.address = address;
        this.Totalfees = Totalfees;
        this.collegeVsStudent = collegeVsStudent;
    }

    public void addStudentToCollege(Student student)
    {
        List<Student> stu = new ArrayList<>();
        stu.add(student);
        this.collegeVsStudent.put(this.getUid() , stu);
    }
    public int getFees() {
        return Totalfees;
    }

    public void setFees(int fees) {
        this.Totalfees = Totalfees;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
