package Marvellous.PPA ;   //Nested Package

public class Loop 
{
    public void Display()
    {
        int Arr[] = new int [4] ;

        Arr[0] = 10 ;
        Arr[1] = 20 ;
        Arr[2] = 30 ;
        Arr[3] = 40 ;

        System.out.println("Elements of Array are : ");
        
        for(int iCount = 0 ; iCount < Arr.length ; iCount++ )
        {
            System.out.println(Arr[iCount]) ;
        }
    }
}