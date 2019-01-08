public class Checker {

 int pLength;
    final int MAX_STRENGTH = 10;
    int pStrength = 0;
    String pass;

    public Checker(String pwd){
        pass = pwd;
        pLength = pwd.length();

    }

    public boolean checkSecurity(){
        if(pass.isEmpty()){
            System.out.println("Password Anda kosong.");
            return false;
        }
        if(pLength >= 8){
            pStrength++;
            if(pLength >= 12){
                pStrength++;
                if(pLength >= 16){
                    pStrength++;
                }
            }
        }
        if(hasUpperCase(pass) && hasLowerCase(pass)){
            pStrength+=2;
        }
        if(containsNumbers(pass)){
            pStrength+=2;
        }
        if(hasNoRepeats(pass)){
            pStrength+=2;
        }
   

if(pStrength>4){
	return true;}
	else{
		System.out.println("Password lemah");
		return false;}

    }


    //Component Methods

    public boolean hasUpperCase(String str){
        for(int i = 0; i<pLength; i++){
            if(Character.isUpperCase(str.charAt(i))){
                return true;
            }
        }
        return false;

    }

    public boolean hasLowerCase(String str){
        for(int i  = 0; i<pLength; i++){
            if(Character.isLowerCase(ch)(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean containsNumbers(String str){
        for(int i = 0; i<pLength; i++){
            if(Character.isDigit(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean hasNoRepeats(String str){
        for(int i = 0; i<pLength; i++)
            if(containsChar(str, str.charAt(i))){
                return false;
            }
        return true;
    }


    public boolean containsChar(String s, char search) {
        if (s.length() == 0)
            return false;
        else
            return s.charAt(0) == search || containsChar(s.substring(1), search);
    }

}