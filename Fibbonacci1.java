public class Fibbonacci1
{
    public static void main(String[]args)
    {
    int a=0,b=1,c;
    System.out.print(a +"   "+ b);
    for(int i=0;i<=10;i++)
    {
        c=a+b;
    System.out.println(" "+c);
    a=b;
    b=c;
    }

    }
}