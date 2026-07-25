class college{
    void department(){
        System.out.println("welcome to excel engineering college");
    }
}
class CSE extends college{
    void department(){
        System.out.println("welcome to computer science engineering");
    }
}
class ECE extends college{
    void department(){
        System.out.println("welcome to electronic and communication engineering");
    }
}
class aids extends college{
    void department(){
        System.out.println("welcome to artifical intellingence data science");
    }
}
public class poly{
    public static void main(String[] args){
        college c=new CSE();
        c.department();
        college d=new ECE();
        d.department();
        college e=new aids();
        e.department();
    }
}
