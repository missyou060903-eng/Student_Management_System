package entity;

public class Student {
    private String Sno;
    private String Sname;
    private int Sage;
    private String Sde;
    public Student(){};
    public Student(String Sno,String Sname,int Sage,String Sde){
        this.Sno=Sno;
        this.Sname=Sname;
        this.Sage=Sage;
        this.Sde=Sde;
    }
    public String getSno(){return Sno;}
    public void setSno(String Sno){this.Sno=Sno;}

    public String getSname(){return Sname;}
    public void setSname(String Sname){this.Sname=Sname;}

    public int getSage() { return Sage; }
    public void setSage(int Sage) { this.Sage = Sage; }

    public String getSde(){return Sde;}
    public void setSde(String Sde){this.Sde=Sde;}
    public String toString() {
        return "学号：" + Sno + " | 姓名：" + Sname + " | 年龄：" + Sage + " | 学院：" + Sde;
    }
}
