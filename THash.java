
public class THash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args[0].equals("e")){
            System.out.println(new encryptHash(args[1],args[2]));
        }
        else if (args[0].equals("d")){
            System.out.println(new decryptHash(args[1],args[2]));
        }
        else{
            System.out.println("Command Syntax: java THash e|d username message");
        }
        
    }
}
