
public class encryptHash {
    private double hashedMessage;
    public encryptHash(String user, String text){
        Long userHash=new Long(1);
        for(int x=0; x<user.length(); x++){
            userHash*=user.codePointAt(x);
        }
        long beforeHash=0;
        for(int x=0; x<text.length(); x++){
            beforeHash=beforeHash*1000+text.codePointAt(x);    
        }
        hashedMessage=(double)beforeHash/(double)userHash;
        
    }
    public double getHashedValue(){
        return hashedMessage;
    }
    public String toString(){
        return new Double(hashedMessage).toString();
    }
}
