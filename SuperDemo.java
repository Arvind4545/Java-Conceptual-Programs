
class Base 
{
    public int A ,  B ;
    public Base(int No1 , int No2 )
    {
        this.A = No1 ;
        this.B = No2 ;
    }
    public void fun()
    {
        System.out.println("Inside Base fun");
        System.out.println("Value of A from fun method is : "+this.A );
        System.out.println("Value of X from gun method is : "+super.X);
    }
}

class Derived extends Base 
{
    public int X , Y ;
    public Derived(int i, int j , int k , int l )
    {
        super(k,l) ;      //First Usecase //Base(51,101)
        this.X = i ;
        this.Y = j ;

    }
    public void gun()
    {
        System.out.println("Value of A from gun method is : "+super.A );//2nd usecase
        super.fun();   //3rd Usecase 
    }
}

class SuperDemo
{
    public static void main(String a[])
    {
        Derived dobj = new Derived(11,21,51,101);
        dobj.gun();
    }
}