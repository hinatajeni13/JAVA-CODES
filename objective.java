class book{
    String author;
    String tittle;
    int year;
    String publisher;
    book(String author ,String tittle,int year,String publisher){
       this.author=author;
       this.tittle=tittle;
       this.year=year;
       this.publisher=publisher;
}
void display(){
    System.out.println("author="+author);
    System.out.println("tittle="+tittle);
    System.out.println("year="+year);
    System.out.println("publisher="+publisher);
}
}
public class Main{
    public static void main(String[]args){
        book[]book=new book[3];
    book s1=new book("dharshini","kadhal",2006,"chandru");
    book[0]=s1;
    book s2=new book("deva","tholvi",2023,"pranav");
    book[1]=s2;
    book[2]=new book("anu","success",2024,"jeni");
    for(int i=0;i<book.length;i++){
        book[i].display();
    }
}
}
