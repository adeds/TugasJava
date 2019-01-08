import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Saver extends EncrypThor {

	public void saving(String name, String password) throws FileNotFoundException{
	
	PrintWriter out = new PrintWriter(name+".txt");
	out.println(password);
	System.out.print("tersimpan di folder projek.");
	out.close();
}
}
