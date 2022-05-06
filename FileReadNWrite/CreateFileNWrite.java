package FileReadNWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//file storage==>C:\Users\Lenovo\workspace\FileIO
public class CreateFileNWrite {
public static void main(String[] args)throws IOException {
	File f =new File("java.txt");
	String mgs="JAVA is an object oriented language";
byte buffer[]=mgs.getBytes();
	FileOutputStream fos= new FileOutputStream(f);
	fos.write(buffer);
	fos.close();
}
}
