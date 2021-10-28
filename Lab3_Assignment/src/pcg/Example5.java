package pcg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int lines=0, chars=0, words=0;
			int code=0;
			System.out.println("Enter the file name:");
			String str = sc.nextLine();
			FileInputStream fis = new FileInputStream(str);
			while(fis.available()!=0)
			{
				code = fis.read();
				if(code!=10)
					chars++;
				if(code==32)
					words++;
				if(code==13) {
					lines++;
					words++;
				}
			}

			System.out.println("Number of lines:"+(lines+1));
			System.out.println("Number of words:"+(words+1));
			System.out.println("Number of characters:"+chars);
			fis.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Cannot find the file..");
		}
		catch(IOException io) {
			System.out.println("Cannot read file...");
		}
	}
}

	