public class constructor {
    int x;

    constructor(){
        System.out.println("It is default constructor");
    }
    constructor(int i )
    {
        x=i;
        System.out.println("It is parameterised constructor");

    }

    public static void main(String args[])
    {

        constructor b=new constructor();
        constructor b1=new constructor(9);

    }
}
