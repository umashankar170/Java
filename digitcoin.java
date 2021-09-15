import java.util.Scanner;
class digitcoin{
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Write some text:");
		String s=new String(sc.nextLine());
		int len=s.length();
		int dgc=0;
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			dgc++;
		}
		System.out.print("totala digits"+dgc);
	}

}