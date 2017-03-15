import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Hinrichter
{
    public static void main(String[] args){Hinrichter hin = new Hinrichter();}
    public Hinrichter()
    {
        JFrame f = new JFrame("to execute --> hinrichten, exekutieren");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(false);
        f.setResizable(false);
        /*
        ImageIcon img = new ImageIcon("./scr/BrutalExecution.gif");
        JLabel l = new JLabel(img);
        l.setVisible(true);
        f.add(l);*/
        
        //ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/src/'BrutalExecution.gif")));
        try{f.add(new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/src/BrutalExecution.gif")))));}
        catch(Exception e){System.exit(1);}
        
        /*
        try{f.add(new JLabel(new ImageIcon("./src/BrutalExecution.gif")));}
        catch(Exception e){f.add(new JLabel("Failed To Load Image\n"+e.getMessage()));}
        */
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
