class book{
    private int pgno;
    public int getter(){
        return pgno;
    }
    public void setter(int x){
        if(x>0)
            pgno=x;
        else
            System.out.println("invalid");
    }
}
public class Getseten {
    public static void main(String[] args){
        book obj=new book();
        obj.setter(-100);
        System.out.println(obj.getter());
    }
}