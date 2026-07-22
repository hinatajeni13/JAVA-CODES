class student{
    int rollno;
    String name;
    String dept;
    String section;
    int year;
    student(int rollno,String name,String dept,String Section,int year){
       this.rollno=rollno;
       this.name=name;
       this.dept=dept;
       this.section=Section;
       this.year=year;
}

void display(){
    System.out.println("rollno="+rollno);
    System.out.println("name="+name);
    System.out.println("dept="+dept);
    System.out.println("section="+section);
    System.out.println("year="+year);
}
}
public class Main{
    public static void main(String[]args){
        student[]students=new student[3];
    student s1=new student(9,"anu","ECE","A",3);
    students[0]=s1;
    student s2=new student(24,"dharshini","IT","A",4);
    students[1]=s2;
    students[2]=new student(25,"deva","BME","B",4);
    for(int i=0;i<students.length;i++){
        students[i].display();
    }
}
}
