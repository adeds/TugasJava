
public class EncrypThor {
	
	
	public static String cipher(String str, int i) { //Deklarsi -- fungsi method cipher
		//Str = kata, i = jumlah penggeseran index kata
    char ch = str.charAt(0); 	//Deklarasi -- variabel ch sebagai Char
    							//Inisialisasi -- ch adalah karakter str pada index ke-0, (huruf pertama)
    StringBuffer output = new StringBuffer();	//Deklarasi -- output untuk modifikasi kata sebagai objek dari StringBuffer
    ch = (char) (ch + i);		//Operasi -- penggeseran index ch
    							//dilakukan dengan 	penambahan (penggeseran) sejumlah i pada index kode ASCII ch
    output.append(ch);			//Inisialisai -- output yang sebelumnya  ditambah (append) dengan variabel ch yang telah digeser

    if (str.length() > 1) { //Decision -- pengecekan apabila panjang str lebih dari 2 maka,
        output.append(cipher(str.substring(1), i)); //Inisialisasi -- output sebelumnya lalu ditambah (append) dengan ,
        											// Call -- pemanggilan method cipher (recursive case) dengan parameter str dimulai dari index 1 (pemotongan 1 huruf awal) dan int i 
    }

    return output.toString();						// Return -- pengembalian output yang telah selesei dikonversi menjadi String (Base Case)
}
}
