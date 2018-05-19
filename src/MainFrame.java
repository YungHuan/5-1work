import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jb1 =new JButton("=");
    private JButton jb2 =new JButton("Exit");
    private JLabel jl1 =new JLabel("華氏溫");
    private JLabel jl2 =new JLabel("攝氏溫");
    private JLabel jl3 =new JLabel("");
    private TextField tf =new TextField();
    private int a =0;
    private double b = 0;
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(100,100,600,600);
        this.setLayout(null);
        this.jl1.setBounds(50,50,100,30);
        this.tf.setBounds(150,50,100,30);
        this.jb1.setBounds(250,50,100,30);
        this.jl2.setBounds(350,50,100,30);
        this.jl3.setBounds(450,50,100,30);
        this.jb2.setBounds(50,150,100,100);
        this.add(jb1);
        this.add(jb2);
        this.add(jl1);
        this.add(jl2);
        this.add(jl3);
        this.add(tf);
        this.setVisible(true);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Integer.parseInt(tf.getText());
                b=(a-32)*5/9;
                jl3.setText(Double.toString(b));

            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
