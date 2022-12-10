import java.lang.* ;

class Demo 
{
    public void fun() //fun@0
    {
        System.out.println("Fun Without Parameters");
    }
    public void fun(int i) //fun@i
    {
        System.out.println("Fun with one Integer as a Parameter");
    }
    public void fun(int i , int j ) //fun@2ii
    {
        System.out.println("Fun with 2 Integers as a Parameters");
    }
    public void fun(double d) //fun@1d
    {
        System.out.println("Fun with 1 Double as a Parameter");
    }
}

class Overloading 
{
    public static void main(String a[])
    {
        Demo dobj = new Demo();

        dobj.fun();
        dobj.fun(10);
        dobj.fun(10,20);
        dobj.fun(9.8);

    }
}