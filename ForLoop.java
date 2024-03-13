import javax.swing.JOptionPane;

public class ForLoop {
    static int a;
    public static void getNumber() {
        JOptionPane op = new JOptionPane();
        a = Integer.parseInt(op.showInputDialog("Enter a Number: "));
    }
    public static void evenNumbers() {
        for (int i = 0; i <= a; i++) {
            if (i%2 == 0) {
                if (i == a-1 || i == a)
                    System.out.println(i);
                else
                    System.out.print(i +", ");
            }
        }
    }
    public static void main(String[] args) {
        getNumber();
        evenNumbers();
    }
}
