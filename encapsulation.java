 class employee{
    private double salary;
    public void setsalary(double salary){
        if (salary>=0){
            this.salary=salary;
        }
        else{
        
        System.out.println("invalis salary");
        }
    }
    public double getsalary(){
        return salary;
    }
}
public class Main{
    public static void main(String[]args){
        employee e=new employee();
        e.setsalary(50000);
        System.out.println(e.getsalary());
        e.setsalary(-1000);//invalid
    }
}
