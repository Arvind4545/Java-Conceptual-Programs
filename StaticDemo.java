
class StaticDemo
{
    static 
    {
        System.out.println("Inside Static block of Static Demo class which contains main");
    }
    public StaticDemo()
    {
        System.out.println("Inside constructor of staticDemo");
    }
    public static void main(String arg[])
    {
        System.out.println("Inside main ");
        System.out.println("Value of Static No3: "+ Demo.No3);
        System.out.println("Value of Static No4 : "+Demo.No4);
        Demo.gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.fun();
        
    }
}

class Demo 
{
    public int No1 ;   // Non Static Characteristics 
    public int No2 ;   //Non Static Characteristics 
    public static int No3 ;  //static characteristics
    public static int No4 ;   //Static Characteristics 

    
    public Demo()  // constructor
    {
        System.out.println("Inside Constructor");
        No1 = 11 ;
        No2 = 21 ;
    }
    static  //Static block
    {
        System.out.println("Inside Static Block of Demo class");
        No3 = 51 ;
        No4 = 101 ;

    }
    public void fun()   //Non Static Method 
    {
        //Non static method can access Static as well as non static Data
        //we can use this keyword
        System.out.println("Inside non Static method fun");
        System.out.println("Value of No1 : "+this.No1 );
        System.out.println("Value of No2: "+this.No2 );
        System.out.println("Value of No3 : "+this.No3 );
        System.out.println("Value of No4 : "+this.No4 );
        
    }
    public static void gun()  //Static Method 
    {
        //Sttic method can access only Static Data 
        //We cannot use this keyword
        System.out.println("Inside Static Method gun");
        //System.out.println("Value of No1 : "+No1);
        //System.out.println("Value of No2 : "+No2);
        System.out.println("Value of No2 : "+No3);
        System.out.println("Value of No4 : "+No4);
    }
}

class Demo2
{
    System.out.println("Inside ")
}