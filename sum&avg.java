public class ArrayLenghtDemo
{
    public static void main(String[]args)
    {
       int [] myarr=new int[args.length];
       int i=0;
       for(String s: args)
       {
           myarr[i] = Integer.parseInt(s);
           i++;
       }
       int sum=0;
       float average;
       for(i=0;i<myarr.length;i++)
       {
           sum=sum+myarr[i];
       }
       average=(float)sum/myarr.length;
       System.out.println(sum);
       System.out.println(average);
    }
}