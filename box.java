class Box
{  
    double width;
    double height;
    double depth;
    double volume;
    void setWidth(double w)
    {  
        width=w;
    }
    void setHeight(double h)
    {  
        height=h;
    }
    void setDepth(double d)
    {  
        depth=d;
    }
    void getVolume()
    {  
        volume= width*height*depth;
        System.out.println("the volume is" + volume);
    }
}
public class  BoxDemo
{
    public static void main(String[] args) 
    {  
        Box emp1 = new Box();
        emp1.setWidth(5.0);
        emp1.setHeight(2.0);  
        emp1.setDepth(5.0);
        emp1.getVolume();
    }
}
