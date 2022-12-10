

class Multi
{
    public static void main(String arg[])
    {
        //Arr is 2 Dimensional array which Contains 3 one Dimensional Array,
        //each one Dimensional array Contains 4 Elements , each Element is of 
        //type integer
        //Allowed only in C, c++
        //int Arr[3][4]= {(10,20,30,40),{50,60,70,80},{90,100,110,120}};

        //Allowed only in Java
        int Arr[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};

        System.out.println(Arr.length);  //3
        System.out.println(Arr[0].length); //4
        System.out.println(Arr[1].length); //4



    }
}