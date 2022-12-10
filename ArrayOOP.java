import java.util.Scanner ;

class ArrayX
{
    public int Arr[];
    public int iSize ;

    public ArrayX(int iNo)
    {
        this.iSize = iNo ;
        this.Arr = new int[iSize];  //Resource Allocation 
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the elements : ");
        for(int iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elements of Array are : ");
        for(int iCnt = 0 ; iCnt < iSize ; iCnt++ )
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int Addition()
    {
        int iSum = 0;
        for(int iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum ;
    }
}
class ArrayOOP
{
    public static void main(String arg[])
    {

        ArrayX obj1 = new ArrayX(5);
        obj1.Accept();
        obj1.Display();
        
        int iRet = obj1.Addition();
        System.out.println("Addtion is : "+iRet);

        
    }
}