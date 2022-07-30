import javax.swing.*;  
/**
 * main
 */
public class Main extends JFrame{
    
    public static void main(String[] args) {
        //MAIN FRAME
        JFrame frame = new JFrame("Main window");
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Tell us the word that you want to convert into QR Code: ");
        JTextField txt1 = new JTextField("TYPE IN HERE :)");              
        
        panel1.add(label1);
        
        panel1.add(txt1);

        frame.add(panel1);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        frame.setSize(800, 400);

        frame.setVisible(true);
    }
    
}