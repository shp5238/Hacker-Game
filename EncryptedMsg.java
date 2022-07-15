import java.util.ArrayList;
import java.util.Scanner;

public class EncryptedMsg
{
    private String msg;
    private String key;
    private String eMsg;
    
    public EncryptedMsg(){
        msg = "";
        key = "";
    }

    public EncryptedMsg(String message, String k){
        msg = message.toUpperCase();
        key = k.toUpperCase();
    }
    
    public String calculateMsg(){
        String res = "";
        String k = generateKey();
        for (int i = 0; i < msg.length(); i ++){
            int x = (msg.charAt(i) + k.charAt(i)) % 26;
            x += 'A';
            res += (char)(x);
        }
        return res;
    }

    private String generateKey(){
        String s = key;
        int x = msg.length();
        for (int i = 0; ; i++){
            if (x == i){
                i = 0;
            }
            if (s.length() == msg.length()){
                break;
            }
            s += s.charAt(i);
        }
        return s;
        //generates the key; 
    }
    
    public boolean canCalcMsg(){
        if (key.length() > 1){
            return true;
        }
        return false;
    }

    private void setKey(){
        if (!canCalcMsg()){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter new key:");
            String v = s.nextLine();
            key = v;
            //have to recalculate encrypted code!!!
        }
    }

}
