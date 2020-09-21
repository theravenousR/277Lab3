public class Education {
    private String Degree = "";
    private String Major = "";
    private int Researchers;

    Education(){}
    Education(String d, String m, int r) {
        Degree = d;
        Major = m;
        Researchers = r;
    }

    public void setDegree(String d) {
        Degree = d;
    }

    public void setMajor(String m) {
        Major = m;
    }

    public void setResearchers(int r) {
        Researchers = r;
    }

    public String getDegree() {
        return Degree;
    }

    public String getMajor() {
        return Major;
    }

    public int getResearchers() {
        return Researchers;
    }
}
