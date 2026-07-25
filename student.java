class student{
    int rollno;
    String name;
    private String dept;
    private String section;
    int year;
    
    public String getdept(){
        return dept;
    }
    public void setdept(String dept){
        this.dept=dept;
    }
    public String getsection(){
        return section;
    }
    student(int rollno,String name,String dept,String section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("rollno;"+rollno);
        System.out.println("name;"+name);
        System.out.println("dept;"+dept);
        System.out.println("section;"+section);
        System.out.println("year"+year);
        System.out.println();
    }
}
public class main{
    public static void main(String[]args){
        student[]students=new student[3];
        student s1=new student(101,"jeni","ECE","B",3);
        students[0]=s1;
        student s2=new student(102,"deva","BME","A",2);
        students[1]=s2;
        students[2]=new student(103,"anu","EEE","C",1);
        students[1].setdept("AIDS");
        for(int i=0;i<students.length;i++){
            students[i].display();
        }
    }
}
