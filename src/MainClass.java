import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainClass extends Saver{

	static String username; 
	static String password ; //Deklarasi -- variabel kata tipe data String
	
	public static void main(String[] args){
		
		Saver saver = new MainClass();
		Scanner keyboard = new Scanner(System.in); //Deklarasi -- keyboard untuk inputan sebagai objek baru dari scanner
//        Console console = System.console();
		Checker tc ;

		
		System.out.print("Masukkan username : "); //Output -- petunjuk memasukan kata
	 	
		username = keyboard.nextLine();//Inisialiasi -- variabel kata dengan masukkan dari keyboard user 

		do{
		System.out.print("Masukkan password : "); //Output -- petunjuk memasukan kata

		password = keyboard.nextLine();//Inisialiasi -- variabel kata dengan masukkan dari keyboard user 
		tc = new Checker(password);
		}
        while(!tc.checkSecurity());
		try {
			saver.saving(username, cipher(password, 5));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 															//Call -- Pemanggilan method/fungsi cipher dengan parameter kata dan int 3
	 	
		
		
	 	
	}


}
