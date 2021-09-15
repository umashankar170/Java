import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
public class Averagebuffer
{  
    public static void main(String args[]) throws IOException  
    {   
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        String u=reader.readLine();
        int r=Integer.parseInt(u);
        for(int i=0;i<r;i++)
        {
            String m=reader.readLine();     
            sum=sum+Integer.parseInt(m);    
            
        }    
        int avg=sum/r;
        System.out.println("Average marks:"+avg);
    }
}