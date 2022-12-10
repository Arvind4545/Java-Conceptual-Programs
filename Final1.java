//Same as constant Characteristics of class from C++ 
class Demo 
{
    public int No1 ;  
    public final int No2 = 11 ; //const int No2 ;
    public final int No3 ;      //const int No3 ;

    public Demo()               // : No2(11) , No3(21)
    {
        No1 = 0 ; 
        No3 = 21 ;              //NA in C++ 
    }
}
class Final1
{
    public static void main(String a[])
    {
        final int i = 51 ; 
        Demo dobj = new Demo();
        dobj.No1++ ;
        dobj.No2++ ;
        dobj.No3++ ;
    }
}