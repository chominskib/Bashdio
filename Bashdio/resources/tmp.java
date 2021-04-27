import java.lang.*;
import java.awt.*;
import java.io.*;
class tmp{
	static void sleep(){
		try {
			new Robot().delay(20);
		} catch (AWTException e) {

		}
	}
	public static void main(String[] args){
		System.out.println("var folders=[");
		int x=new File("music").listFiles().length, y=0;
		for (File Folder: new File("music").listFiles())
			{
			y++;
			if (x!=y)
				System.out.println("\""+Folder.getName()+"\", ");
			else
				System.out.println("\""+Folder.getName()+"\" ");
			}
		System.out.println("];");
		System.out.println("var clips=[");
		x=new File("music").listFiles().length; y=0;
		for (File Folder: new File("music").listFiles())
			{
			y++;
			System.out.println("[");
			String NAME="music/"+Folder.getName()+"/";
			int a=new File(NAME).listFiles().length, b=0;
			for (File F: new File(NAME).listFiles())
				{
				b++;
				if (a!=b)
					System.out.println("\""+NAME+F.getName()+"\",");
				else
					System.out.println("\""+NAME+F.getName()+"\"");
				}
			if (x!=y)
				System.out.println("],");
			else
				System.out.println("]");
			}
		System.out.println("];");
		/*
		for (File F: new File("edm").listFiles())
			{
			System.out.println("\"edm/"+F.getName()+"\", ");
			sleep();
			}
		System.out.println("];");
		System.out.println("var normal=[");
		for (File F: new File("music").listFiles())
			{
			System.out.println("\"music/"+F.getName()+"\", ");
			sleep();
			}
		System.out.println("];");
		*/
	}
}
