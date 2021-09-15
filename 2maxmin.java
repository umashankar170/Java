public class ArrayLenghtDemo
{
    public static void main(String[]args)
    {
       int max1=Integer.parseInt(args[0]);
       int max2=Integer.parseInt(args[0]);
       int min1=Integer.parseInt(args[0]);
       int min2=Integer.parseInt(args[0]);
       
       int array[]=new int[args.length];
       int i=0;
       for(String s: args)
       {
          array[i] = Integer.parseInt(s);
           i++;
       }
       for(i=1;i<args.length;i++)
       {
           if (array[i]>max1)
           max1=array[i];
           if (array[i]<min1)
           min1=array[i];
       }
       for(i=1;i<args.length;i++)
       {
           if(array[i]<max1 && array[i]>max2)
           max2=array[i];
           if (array[i]>min1 && array[i]<min2)
           min2=array[i];
           
         
           
       }
       
       System.out.println(max1+" "+max2);
       
       System.out.println(min1+" " +min2);
       
    }
}