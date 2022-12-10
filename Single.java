/*
class Object (Parent Class of every Class)
{
    //Code
    //clone Method 
    //Equals Method 
    //Length Method 
    //Finalize Method 
}
*/

class Base //class Base extends Object 
{
    public int A, B ;
    public Base()
    {
        System.out.println("Base Constructor");
        this.A = 10 ;
        this.B = 20 ;
    }
    public void fun()  //Defination 
    {
        System.out.println("Inside Base fun");
    }
    public void gun() //Defination
    {
        System.out.println("Inside Base gun");
    }
    public void fun(int No) //Overloaded Function
    {
        System.out.println("Inside Base fun with one Integer");
    }
}

class Derived extends Base //Class Derived : public Base 
{
    public int X, Y ;

    public Derived()
    {
        System.out.println("Inside Derived Constructor");
        this.X = 30 ;
        this.Y = 40 ;
    }

    public void sun()  //Defination
    {
        System.out.println("Inside Derived Sun");
    }

    public void gun()  //Overrided Defination(In Java , Every method is by Default Virtual)
    {
        System.out.println("Inside Derived gun");
    }
}
class Single 
{
    public static void main(String arg[])
    {
        //Base bobj = new Base() ;  //No Casting 
        //Derived dobj1 = new Derived() ; //No Casting
        Base bobj2 = new Derived(); //Upcasting 
        //Derived dobj2 = new Base(); //DownCasting (NA)

        bobj2.fun();
        bobj2.fun(11);
        bobj2.gun();
        //bobj2.sun();
    }
}    