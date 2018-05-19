import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame2 extends JFrame{
    private JButton jb1 =new JButton("----->");
    private JButton jb2 =new JButton("<------");
    private JButton jb3 =new JButton("Exit");
    private JLabel jl1 =new JLabel("*-*");
    private TextField tf =new TextField();
    private int a =0;
    private double b = 0;
    public MainFrame2(){
        init();
    }
    public void init(){
        this.setBounds(100,100,600,600);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.jb1.setBounds(50,50,100,100);
        this.jb2.setBounds(150,50,100,100);
        this.jb3.setBounds(250,50,100,100);
        this.jl1.setBounds(a,150,100,100);
        this.tf.setBounds(50,250,100,30);
        add(jb1);
        add(jb2);
        add(jb3);
        add(jl1);
        add(tf);
        this.setVisible(true);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=a+Integer.parseInt(tf.getText());
                jl1.setBounds(a,150,100,100);
                switch (a%40){
                    case 0 :
                        jl1.setText("*-*");
                        break;
                    case 10:
                        jl1.setText("+-+");
                        break;
                    case 20:
                        jl1.setText("@-@");
                        break;
                    case 30:
                        jl1.setText("#-#");
                        break;
                }
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=a-Integer.parseInt(tf.getText());
                jl1.setBounds(a,150,100,100);
                switch (a%40) {
                    case 0:
                        jl1.setText("*-*");
                        break;
                    case 10:
                        jl1.setText("+-+");
                        break;
                    case 20:
                        jl1.setText("@-@");
                        break;
                    case 30:
                        jl1.setText("#-#");
                        break;
                }
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
}}
