import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HackedLvl extends JFrame{
    static JFrame frame=new JFrame("FRAME");
    private final static String SECRET = "hat";
    private static int tries = 3; 
    private final static String MSG = "Hello world! This is the beginning of the end.";
    private static boolean ciph = true;
    public static void main(String [] args)
    {
        routine();//method that sets up each frame
        frameTitle(); //initial frame method
    } 
    static class Title implements ActionListener{
        public void actionPerformed (ActionEvent e){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            frameChoice();
        }
    }
    static class No implements ActionListener{
        public void actionPerformed (ActionEvent e){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            frameNo();
        }
    }
    static class Yes implements ActionListener{
        public void actionPerformed (ActionEvent e){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            frameLVL1();
        }
    }
    static class Next implements ActionListener{
        public void actionPerformed (ActionEvent e){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            //add call to the next frame to be displayed
            forbidMsg();
        }
    }
    static class CIPHER implements ActionListener{
        public void actionPerformed (ActionEvent e){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            frameWKey();
        }
    }
    static class Ready implements ActionListener{
        public void actionPerformed (ActionEvent e){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            ChkMsg();
        }
    }

    public static void routine(){
        frame.setVisible(true);
        frame.setSize(650,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void frameTitle(){
        JLabel HeaderTitle =new JLabel("THE HACK CHALLENGES", JLabel.CENTER);
        HeaderTitle.setFont(new Font("SpaceMono", Font.PLAIN, 32));//labels serve as text boxes
        HeaderTitle.setForeground(new Color(37, 226, 45));

        JPanel title =new JPanel(); //title is a panel
        frame.add(title); //frame has title panel
        title.add(HeaderTitle);
        title.setBackground(new Color(12, 8, 31));

        title.setLayout(null);
        title.setLayout(new GridBagLayout());

        JButton play = new JButton("PLAY NOW");
        play.setForeground(new Color(37, 226, 45)); //text color
        play.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        play.setBackground(new Color(13, 66, 70));//box color
        play.setBounds(133,212,299,47);//x, y, w, h

        play.setBorder(null);

        title.add(play);
        play.addActionListener(new Title());
    }

    public static void frameChoice(){

        JLabel Hacked =new JLabel("YOU HAVE BEEN HACKED", JLabel.CENTER);
        Hacked.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Hacked.setForeground(new Color(37, 226, 45));
        Hacked.setHorizontalAlignment(JLabel.LEFT);
        Hacked.setVerticalAlignment(JLabel.TOP);

        JLabel Que =new JLabel("SHALL WE PLAY A GAME?", JLabel.CENTER);
        Que.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Que.setForeground(new Color(37, 226, 45));
        Que.setHorizontalAlignment(JLabel.LEFT);
        Que.setVerticalAlignment(JLabel.CENTER);

        JLabel Options =new JLabel("HERE ARE YOUR OPTIONS:", JLabel.CENTER);
        Options.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Options.setForeground(new Color(37, 226, 45));
        Options.setHorizontalAlignment(JLabel.LEFT);
        Options.setVerticalAlignment(JLabel.BOTTOM);

        JPanel title =new JPanel(); //title is a panel
        frame.add(title); //frame has title panel

        title.add(Hacked);
        title.add(Que);
        title.add(Options);
        title.setBackground(new Color(12, 8, 31));

        JButton yes = new JButton("YES");
        yes.setForeground(new Color(37, 226, 45)); //text color
        yes.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        yes.setBackground(new Color(13, 66, 70));//box color
        yes.setHorizontalAlignment(JLabel.LEFT);
        yes.setVerticalAlignment(JLabel.BOTTOM);

        JButton no = new JButton("NO");
        no.setForeground(new Color(37, 226, 45)); //text color
        no.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        no.setBackground(new Color(13, 66, 70));//box color
        no.setHorizontalAlignment(JLabel.LEFT);
        no.setVerticalAlignment(JLabel.BOTTOM);

        yes.setBorder(null);
        title.add(yes);

        no.setBorder(null);
        title.add(no);

        yes.addActionListener(new Yes());
        no.addActionListener(new No());
    }

    /*
     * have to properly name labels... basically three lines
     */
    public static void frameNo(){
        JLabel Hacked = new JLabel("* * * * * * SELF DESTRUCT * * * * * *", JLabel.CENTER);
        Hacked.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Hacked.setForeground(new Color(37, 226, 45));
        Hacked.setHorizontalAlignment(JLabel.LEFT);
        Hacked.setVerticalAlignment(JLabel.TOP);

        JLabel Que = new JLabel("* * * * * * * SECONDS 3 * * * * * * *", JLabel.CENTER);
        Que.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Que.setForeground(new Color(37, 226, 45));
        Que.setHorizontalAlignment(JLabel.LEFT);
        Que.setVerticalAlignment(JLabel.CENTER);

        JLabel Options = new JLabel("SHALL WE PLAY A GAME?", JLabel.CENTER);
        Options.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Options.setForeground(new Color(37, 226, 45));
        Options.setHorizontalAlignment(JLabel.LEFT);
        Options.setVerticalAlignment(JLabel.BOTTOM);

        JPanel title =new JPanel(); //title is a panel
        frame.add(title); //frame has title panel

        title.add(Hacked);
        title.add(Que);
        title.add(Options);
        title.setBackground(new Color(12, 8, 31));

        JButton yes = new JButton("YES");
        yes.setForeground(new Color(37, 226, 45)); //text color
        yes.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        yes.setBackground(new Color(13, 66, 70));//box color
        yes.setHorizontalAlignment(JLabel.LEFT);
        yes.setVerticalAlignment(JLabel.BOTTOM);

        yes.setBorder(null);
        title.add(yes);

        yes.addActionListener(new Yes());
    }

    public static void frameLVL1(){
        JLabel name = new JLabel("LEVEL: DECRYPTION", JLabel.CENTER);
        name.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        name.setForeground(new Color(37, 226, 45));
        name.setHorizontalAlignment(JLabel.LEFT);
        name.setVerticalAlignment(JLabel.TOP);

        JPanel title = new JPanel(); //title is a panel
        frame.add(title); //frame has title panel

        title.setLayout(new GridBagLayout());

        title.add(name);
        title.setBackground(new Color(12, 8, 31));

        //temporary button since I'm still figuring out timer transition
        JButton next = new JButton("NEXT");
        next.setForeground(new Color(37, 226, 45)); //text color
        next.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        next.setBackground(new Color(13, 66, 70));//box color
        next.setHorizontalAlignment(JLabel.LEFT);
        next.setVerticalAlignment(JLabel.BOTTOM);

        next.setBorder(null);
        title.add(next);

        next.addActionListener(new Next());
    }

    public static void forbidMsg(){
        String a;
        do{
            a = getAns();
            if (a == SECRET ){ //this should not work. but whyyyy
                tries = 0;
                //display right frame
                frame.dispose();
                frame = new JFrame("FRAME");
                routine();
                frameRight();
            }else{
                tries--;
                //display wrong frame
                frame.dispose();
                frame = new JFrame("FRAME");
                routine();
                frameWrong();
            }
        }while (!a.toLowerCase().equals(SECRET) && tries >0);

    }

    public static void frameRight(){

        JPanel title = new JPanel(); //title is a panel
        frame.add(title); //frame has title panel

        title.setLayout(new GridBagLayout());
        title.setBackground(Color.green);

        JButton next = new JButton("NEXT");
        next.setForeground(new Color(37, 226, 45)); //text color
        next.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        next.setBackground(new Color(13, 66, 70));//box color
        next.setHorizontalAlignment(JLabel.LEFT);
        next.setVerticalAlignment(JLabel.BOTTOM);

        next.setBorder(null);
        title.add(next);

        next.addActionListener(new CIPHER());
        System.out.println(true);
    }

    public static void frameWrong(){

        JPanel title = new JPanel(); //title is a panel
        frame.add(title); //frame has title panel

        title.setLayout(new GridBagLayout());
        title.setBackground(Color.orange);

        JButton next = new JButton("CIPHER");
        next.setForeground(new Color(37, 226, 45)); //text color
        next.setFont(new Font("SpaceMono", Font.PLAIN, 24)); 
        next.setBackground(new Color(13, 66, 70));//box color
        next.setHorizontalAlignment(JLabel.LEFT);
        next.setVerticalAlignment(JLabel.BOTTOM);

        next.setBorder(null);
        title.add(next);

        next.addActionListener(new CIPHER());
        ciph = false;
    }

    private static String getAns(){
        String instructions = 
            "To break this puzzle, you need a key. " + "\n" 
            +"The key is a single word answer. "+ "\n"
            + "Here is my question: "+ "\n"
            + "What I am wearing? " + "\n"
            + "I wear many different colors of the same thing, " + "\n"
            + "depending on my intentions, so others easily label me." + "\n"
            +"I'll admit, sometimes I wear too many of them. " + "\n"
            + "Anyways, get this right, and maybe I'll put a feather in yours. "+"\n"
            +"And, of course, still keep all of your precious personal information."  
        ;
        JLabel c = new JLabel(instructions);
        c.setFont(new Font("DialogInput", Font.PLAIN, 14));
        //"SpaceMono"
        //c.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        //the white instructions. 

        String ans = JOptionPane.showInputDialog(null, instructions + "\n" + "Type Key: ");
        JLabel att = new JLabel(tries + " attempts remaining.");
        JLabel key = new JLabel("Key: "+ ans);
        key.setForeground(Color.white);
        key.setFont(new Font("DialogInput", Font.PLAIN, 14));
        //input box && answer portion
        return ans;
    }

    public static void frameWKey(){
        JLabel Hacked = new JLabel("Key = " + SECRET);
        Hacked.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Hacked.setForeground(new Color(37, 226, 45));
        Hacked.setHorizontalAlignment(JLabel.LEFT);
        Hacked.setVerticalAlignment(JLabel.TOP);

        EncryptedMsg n = new EncryptedMsg(MSG, "hat");
        String res = n.calculateMsg();

        JLabel Que = new JLabel("Encrypted Msg = " + res, JLabel.CENTER);
        Que.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Que.setForeground(new Color(37, 226, 45));
        Que.setHorizontalAlignment(JLabel.LEFT);
        Que.setVerticalAlignment(JLabel.CENTER);

        JLabel Op1 = new JLabel("A  B  C  D  E  F  G  H  I  J  K  L  M", JLabel.CENTER);
        Op1.setVerticalAlignment(JLabel.BOTTOM);
        Op1.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Op1.setForeground(new Color(37, 226, 45));
        Op1.setHorizontalAlignment(JLabel.LEFT);

        JLabel Op2 = new JLabel("00 01 02 03 04 05 06 07 08 09 10 11 12", JLabel.CENTER);
        Op2.setVerticalAlignment(JLabel.BOTTOM);
        Op2.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Op2.setForeground(new Color(37, 226, 45));
        Op2.setHorizontalAlignment(JLabel.LEFT);

        JLabel Op3 = new JLabel("N  O  P  Q  R  S  T  U  V  W  X  Y  Z", JLabel.CENTER);
        Op3.setVerticalAlignment(JLabel.BOTTOM);
        Op3.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Op3.setForeground(new Color(37, 226, 45));
        Op3.setHorizontalAlignment(JLabel.LEFT);

        JLabel Op4 = new JLabel("13 14 15 16 17 18 19 20 21 22 23 24 25", JLabel.CENTER);
        Op4.setVerticalAlignment(JLabel.BOTTOM);
        Op4.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        Op4.setForeground(new Color(37, 226, 45));
        Op4.setHorizontalAlignment(JLabel.LEFT);

        JPanel title =new JPanel(); //title is a panel
        frame.add(title); //frame has title panel

        title.add(Hacked);
        title.add(Que);
        title.add(Op1);
        title.add(Op2);
        title.add(Op3);
        title.add(Op4);
        title.setBackground(new Color(12, 8, 31));

        JButton yes = new JButton("Ready?");
        yes.setForeground(new Color(37, 226, 45)); //text color
        yes.setFont(new Font("SpaceMono", Font.PLAIN, 24));
        yes.setBackground(new Color(13, 66, 70));//box color
        yes.setHorizontalAlignment(JLabel.LEFT);
        yes.setVerticalAlignment(JLabel.BOTTOM);

        yes.setBorder(null);
        title.add(yes);

        yes.addActionListener(new Ready());
    }

    public static void ChkMsg(){
        String ans = JOptionPane.showInputDialog(null, "Type : ");

        if (ans.equals(MSG)){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            frameWon(ans);
        }
        if (!ans.equals(MSG)){
            frame.dispose();
            frame = new JFrame("FRAME");
            routine();
            frameLost(ans);
        }

    }

    public static void frameWon(String ans){
        JPanel title =new JPanel(); //title is a panel
        frame.add(title); //frame has title panel
        JLabel bool;

        bool = new JLabel("Correct answer! You have won the game!");
        bool.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        bool.setForeground(new Color(37, 226, 45));
        bool.setHorizontalAlignment(JLabel.LEFT);
        bool.setVerticalAlignment(JLabel.TOP);   


        title.add(bool);

    }

    public static void frameLost(String ans){
        JPanel title =new JPanel(); //title is a panel
        frame.add(title); //frame has title panel
        JLabel bool;

        bool = new JLabel("Incorrect. The hacker has ransomed your data.");
        bool.setFont(new Font("SpaceMono", Font.PLAIN, 32));
        bool.setForeground(new Color(37, 226, 45));
        bool.setHorizontalAlignment(JLabel.LEFT);
        bool.setVerticalAlignment(JLabel.TOP); 

        title.add(bool);
    }
}