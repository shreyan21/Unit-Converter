package UnitConverter;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main {

   public static void main(String[] args){
        JFrame frame=new JFrame("Unit Converter");

        Image img=Toolkit.getDefaultToolkit().getImage("D:\\downloads\\pngwing.png");
        frame.setIconImage(img);
        JPanel panel =new JPanel(null);
        panel.setBackground(Color.GREEN);
        String []s={"m","cm","km","in","feet"};
        JComboBox<String>box1=new JComboBox<String>(s);
       JComboBox<String>box2=new JComboBox<String>(s);

        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        t1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
       t2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));


        t2.setEditable(false);
        JButton button1 =new JButton("Convert");
        JButton button2=new JButton("Reset");
        box1.setBounds(140,40,50,25);
        box2.setBounds(360,40,50,25);
        frame.setContentPane(panel);
        panel.add(t1);
        panel.add(t2);
        panel.add(box1);
        panel.add(box2);
        panel.add(button1);
        panel.add(button2);
        t1.setBounds(40,40,100,25);
        t2.setBounds(260,40,100,25);
        button1.setBounds(80,110,80,25);
        button2.setBounds(290,110,80,25);
       frame.setSize(470,230);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().length()==0){
                    return;
                }
                int x=Integer.parseInt(t1.getText());
                if(box1.getSelectedItem()=="m"){
                    if(box2.getSelectedItem()=="cm"){
                        t2.setText(""+x*100);
                    }
                    else if(box2.getSelectedItem()=="km"){
                        t2.setText(""+x/1000.0f);
                    }
                    else if(box2.getSelectedItem()=="m"){
                        t2.setText(""+x);
                    }
                    else if(box2.getSelectedItem()=="in"){
                        t2.setText(""+x*39.37f);
                    }
                    else{
                        t2.setText(""+x*3.28f);
                    }
                }
                else if(box1.getSelectedItem()=="cm"){
                    if(box2.getSelectedItem()=="km"){
                        t2.setText(""+x/1000.0f);
                    }
                    else if(box2.getSelectedItem()=="m"){
                        t2.setText(""+x/100.0f);
                    }
                    else if(box2.getSelectedItem()=="in"){
                        t2.setText(""+x*0.3937f);
                    }
                    else if(box2.getSelectedItem()=="feet"){
                        t2.setText(""+x*0.0328f);
                    }
                    else {
                        t2.setText(""+x);
                    }
                }
                else if(box1.getSelectedItem()=="km"){
                    if(box2.getSelectedItem()=="km"){
                        t2.setText(""+x);
                    }

                    else if(box2.getSelectedItem()=="m"){
                        t2.setText(""+1000*x);
                    }
                    else if(box2.getSelectedItem()=="in"){
                        t2.setText(""+x*39370.08f);
                    }
                    else if(box2.getSelectedItem()=="feet"){
                        t2.setText(""+x*3280.84f);
                    }
                    else {
                        t2.setText(""+x*100000);
                    }
                }
                else if(box1.getSelectedItem()=="in"){
                    if(box2.getSelectedItem()=="cm"){
                        t2.setText(""+x*2.54f);
                    }
                    else if(box2.getSelectedItem()=="m"){
                        t2.setText(""+x*0.0254f);
                    }
                    else if(box2.getSelectedItem()=="in"){
                        t2.setText(""+x);
                    }
                    else if(box2.getSelectedItem()=="feet"){
                        t2.setText(""+x*0.0833f);
                    }
                    else {
                        t2.setText(""+x*0.000025f);
                    }
                }
                else {
                     if(box2.getSelectedItem()=="m"){
                        t2.setText(""+x*0.3048f);
                    }
                    else if(box2.getSelectedItem()=="in"){
                        t2.setText(""+x*12);
                    }
                    else if(box2.getSelectedItem()=="feet"){
                        t2.setText(""+x);
                    }
                    else if(box2.getSelectedItem()=="cm"){
                        t2.setText(""+x*30.48f);
                     }
                    else{
                          t2.setText(""+0.000305f*x);
                     }
                }
            }
        });

   }

}
