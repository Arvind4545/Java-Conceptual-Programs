
import java.util.* ;

class ExceptionDemoSolution
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in) ;
        
        int iNo1 = 0  ,iNo2 = 0 , iAns = 0 ;

        System.out.println("Enter First Number") ;
        iNo1 = sobj.nextInt() ;

        System.out.println("Enter Second Number") ;
        iNo2 = sobj.nextInt() ;

        try
        {   
            System.out.println("Inside try block") ; 
            iAns = iNo1 / iNo2 ; //Arithmetic Exception(Exception prone code)
            System.out.println("Division is : "+iAns) ;
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Inside Catch1 ") ;
            System.out.println(obj) ;
        }
        catch(NullPointerException obj)
        {
            System.out.println("Inside Catch2 ") ;
            System.out.println(obj) ;
        }
        catch(Exception obj)
        {
            System.out.println("Inside Catch3 ") ;
            System.out.println(obj) ;
        }
        finally
        {
            System.out.println("Inside finally block");
            sobj.close() ;
        }
        
    }
}