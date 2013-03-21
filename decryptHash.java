
public class decryptHash {
    private String unHashed="";
    public decryptHash(String user, String hash){
        long userHash=1;
        for(int x=0; x<user.length(); x++){
            userHash*=user.codePointAt(x);
        }
        double unhash= (double)Double.parseDouble(hash)*userHash;
        while(unhash>1){
            unHashed=(char)(unhash%1000)+unHashed;
            unhash=unhash/1000;
        }        
    }
    public String toString(){
        return unHashed;
    }   
}
