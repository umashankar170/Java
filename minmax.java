public class ArrayLenghtDemo
{
    public static void main(String[]args)
    {
       int max=Integer.parseInt(args[0]);
       int min=Integer.parseInt(args[0]);
       int array[]=new int[args.length];
       int i=0;
       for(String s: args)
       {
          array[i] = Integer.parseInt(s);
           i++;
       }
       for(i=1;i<args.length;i++)
       {
           if (array[i]>max)
           max=array[i];
           if(array[i]<min)
           min=array[i];
       }
       
       System.out.println(max);
       System.out.println(min);
    }
}