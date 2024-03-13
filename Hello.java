import javax.swing.*;

public class Hello {
    static int a;
    static int sq;
    public static void main(String[] args) {
        JOptionPane op = new JOptionPane();
        String s = op.showInputDialog("Enter a Number");
        a = Integer.parseInt(s);
        sq = a * a; 
        op.showMessageDialog(null, "Welcome to Swing Programming\n" + "Square= " + sq);
    }
}