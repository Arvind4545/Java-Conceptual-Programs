

class ArrayDemo
{
    public static void main(String arg[])
    {
        //Ways of Creating Single Dimensional Array 
        int Arr1[]= {10,20,30,40};
        //int Arr2[4] ={10,20,30,40}; //Explicite Size is not allowed in java 

        int Arr3[]= new int[4];  //Dynamic Memory Allocation
        Arr3[0] = 10 ;
        Arr3[1] = 20 ;
        Arr3[2] = 30 ;
        Arr3[3] =  40 ;

        int Arr4[] = new int[]{10 , 20 , 30 , 40 }; //Dynamic Memory with Initialization list 
    }
}