public class Student
{
    private int Sid;
    private String name;
    private String Degree;
    private String Address;

    private int feesPaid;



    public Student(int sid, String name, String degree, String address, int feesPaid) {
        Sid = sid;
        this.name = name;
        Degree = degree;
        Address = address;
        this.feesPaid = feesPaid;
    }

    public Student() {

    }


    public int remainingFees()
    {
        return this.getTotalFees() - this.getFeesPaid();
    }

    public int getTotalFees()
    {
        if(this.getDegree().equals("BA"))
        {
            return 10000;
        }
        else if(getDegree().equals("BCOM"))
        {
            return 20000;
        }
        else if(getDegree().equals("BCA"))
        {
            return 25000;
        }
        else
        {
            return 30000;
        }
    }
    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
