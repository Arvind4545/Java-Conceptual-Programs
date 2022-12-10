import java.util.Scanner;

class ArrayUser 
{
    public static void main(String Arg[])
    {
        int iCnt = 0 ;
        int iSum = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int iSize = sobj.nextInt();

        //int Arr[] = (int * )malloc(iSize * sizeof(int));
        int Arr[] = new int[iSize];

        System.out.println("Number of Elements in the Array are : "+Arr.length);

        System.out.println("Enter the Elements of Array: ");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++ )
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the Array are : ");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++ )
        {
            System.out.println(Arr[iCnt]);
        }

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++ )
        {
            iSum = Arr[iCnt] + iSum ;
        }

        System.out.println("Sum of Elements is : "+ iSum);
    }
}