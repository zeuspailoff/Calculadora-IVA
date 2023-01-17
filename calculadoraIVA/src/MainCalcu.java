import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCalcu {
    private JTextPane preciopane;
    private JTextPane ivapane;
    private JTextPane totalpane;
    private JButton calculatebutton;
    private JPanel taxpanel;


    public MainCalcu() {
        calculatebutton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent ee){
                try {
                    double p = Double.parseDouble(preciopane.getText());
                    double t = Double.parseDouble(ivapane.getText());

                    double resultado = p + (p / 100 * t);
                    totalpane.setText(Double.toString(resultado));
                }catch (Exception e){
                    System.out.println("no puedes poner letras"+ e.getClass());
                }
            }

        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(new MainCalcu().taxpanel);
        frame.setVisible(true);

    }
}
