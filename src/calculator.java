import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Creating implements ActionListener{
    static double x=0,y=0,sum=0;
    static int operator=0;
    JTextField Jtext;
    JButton numbers1,numbers2,numbers3,numbers4,numbers5,numbers6,numbers7,numbers8,numbers9,numbers0,point,plus,minus,multiply,divide,equals,ac,del;
    Creating(){
        JFrame window = new JFrame("Сalculator");//Name app
        Jtext = new JTextField("");
        //numbers
        numbers1 = new JButton("1");
        numbers2 = new JButton("2");
        numbers3 = new JButton("3");
        numbers4 = new JButton("4");
        numbers5 = new JButton("5");
        numbers6 = new JButton("6");
        numbers7 = new JButton("7");
        numbers8 = new JButton("8");
        numbers9 = new JButton("9");
        numbers0 = new JButton("0");
        //commands
        plus = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("*");
        ac = new JButton("AC");
        JButton X2 = new JButton("x²");
        JButton X3 = new JButton("x³");
        point =new JButton(".");
        equals = new JButton("=");
        del = new JButton("←");
        //x: y: z: command
        plus.setBounds(170,60,50,50);
        multiply.setBounds(170,110,50,50);
        minus.setBounds(220,60,50,50);
        divide.setBounds(220,110,50,50);
        X2.setBounds(170,160,50,50);
        X3.setBounds(220,160,50,50);
        equals.setBounds(170,210,100,50);
        del.setBounds(110,210,50,50);
        point.setBounds(10,210,50,50);
        ac.setBounds(220,10,50,50);
        Jtext.setBounds(10,10,210,50);
        //x: y: z: numbers
        numbers1.setBounds(10,60,50,50);
        numbers2.setBounds(60,60,50,50);
        numbers3.setBounds(110,60,50,50);
        numbers4.setBounds(10,110,50,50);
        numbers5.setBounds(60,110,50,50);
        numbers6.setBounds(110,110,50,50);
        numbers7.setBounds(10,160,50,50);
        numbers8.setBounds(60,160,50,50);
        numbers9.setBounds(110,160,50,50);
        numbers0.setBounds(60,210,50,50);
        //active command
        plus.addActionListener(this);
        multiply.addActionListener(this);
        minus.addActionListener(this);
        divide.addActionListener(this);
        equals.addActionListener(this);
        X2.addActionListener(this);
        X3.addActionListener(this);
        point.addActionListener(this);
        ac.addActionListener(this);
        del.addActionListener(this);
        //active numbers
        numbers1.addActionListener(this);
        numbers2.addActionListener(this);
        numbers3.addActionListener(this);
        numbers4.addActionListener(this);
        numbers5.addActionListener(this);
        numbers6.addActionListener(this);
        numbers7.addActionListener(this);
        numbers8.addActionListener(this);
        numbers9.addActionListener(this);
        numbers0.addActionListener(this);
        //adding to screen(numbers)
        window.add(Jtext);
        window.add(numbers0);
        window.add(numbers1);
        window.add(numbers2);
        window.add(numbers3);
        window.add(numbers4);
        window.add(numbers5);
        window.add(numbers6);
        window.add(numbers7);
        window.add(numbers8);
        window.add(numbers9);
        //adding to screen(numbers)
        window.add(plus);
        window.add(minus);
        window.add(equals);
        window.add(divide);
        window.add(multiply);
        window.add(ac);
        window.add(X3);
        window.add(X2);
        window.add(point);
        window.add(del);
        window.setSize(280,300);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==numbers1)
            Jtext.setText(Jtext.getText().concat("1"));
        if(ae.getSource()==numbers2)
            Jtext.setText(Jtext.getText().concat("2"));
        if(ae.getSource()==numbers3)
            Jtext.setText(Jtext.getText().concat("3"));
        if(ae.getSource()==numbers4)
            Jtext.setText(Jtext.getText().concat("4"));
        if(ae.getSource()==numbers5)
            Jtext.setText(Jtext.getText().concat("5"));
        if(ae.getSource()==numbers6)
            Jtext.setText(Jtext.getText().concat("6"));
        if(ae.getSource()==numbers7)
            Jtext.setText(Jtext.getText().concat("7"));
        if(ae.getSource()==numbers8)
            Jtext.setText(Jtext.getText().concat("8"));
        if(ae.getSource()==numbers9)
            Jtext.setText(Jtext.getText().concat("9"));
        if(ae.getSource()==numbers0)
            Jtext.setText(Jtext.getText().concat("0"));
        if(ae.getSource()==point)
            Jtext.setText(Jtext.getText().concat("."));
        if(ae.getSource()== ac)
            Jtext.setText("");
        if(ae.getSource()==plus) {
            x=Double.parseDouble(Jtext.getText());
            operator=1;
            Jtext.setText("");
        }
        if(ae.getSource()==minus) {
            x=Double.parseDouble(Jtext.getText());
            operator=2;
            Jtext.setText("");
        }
        if(ae.getSource()==multiply) {
            x=Double.parseDouble(Jtext.getText());
            operator=3;
            Jtext.setText("");
        }
        if(ae.getSource()==divide) {
            x=Double.parseDouble(Jtext.getText());
            operator=4;
            Jtext.setText("");
        }
        if(ae.getActionCommand().equals("x²")){
            double y = Double.parseDouble(Jtext.getText());
            double sum = (int) Math.pow(y, 2);
            Jtext.setText(String.valueOf(sum));
        }
        if(ae.getActionCommand().equals("x³")){
            double y = Double.parseDouble(Jtext.getText());
            double sum = (int) Math.pow(y, 3);
            Jtext.setText(String.valueOf(sum));
        }
        if(ae.getSource()==equals) {
            y=Double.parseDouble(Jtext.getText());
            switch (operator) {
                case 1 -> sum = x + y;
                case 2 -> sum = x - y;
                case 3 -> sum = x * y;
                case 4 -> sum = x / y;
                default -> sum = 0;
            }
            Jtext.setText(""+sum);
        }
        if(ae.getSource()==del)
        {
            String s=Jtext.getText();
            Jtext.setText("");
            for(int i=0;i<s.length()-1;i++)
                Jtext.setText(Jtext.getText()+s.charAt(i));
        }
    }
    public static void main(String[] arg){
        SwingUtilities.invokeLater(Creating::new);
    }
}