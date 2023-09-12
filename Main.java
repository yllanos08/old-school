import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener
{
  //FRAME LABELS
  private JFrame frame;
  private JLabel ppl;
  private JLabel bill;
  private JLabel tip;
  private JLabel output;

  //TEXT FIELD
  private JTextField tf_ppl;
  private JTextField tf_bill;
  private JTextField tf_tip;

  //BUTTONS
  private JButton btn_calc;
  private JButton btn_clear;

  //TEXT AREA
  private JTextArea ta;
  private JScrollPane scroll;

  public Main()
  {
    frame = new JFrame("TIP CALCULATOR");
    frame.setSize(700,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    setupGUI();
    frame.setVisible(true);
  }

  private void setupGUI()
  {
    ppl = new JLabel("# of people: ");
    frame.getContentPane().add(ppl);
    ppl.setBounds(3,5,150,20);

    bill = new JLabel("total bill: ");
    frame.getContentPane().add(bill);
    bill.setBounds(4,30,150,20);

    tip = new JLabel("tip percent: ");
    frame.getContentPane().add(tip);
    tip.setBounds(4,55,150,20);

    output = new JLabel("output: ");
    frame.getContentPane().add(output);
    output.setBounds(4,105,150,20);

    tf_ppl = new JTextField(10);
    frame.getContentPane().add(tf_ppl);
    tf_ppl.setBounds(100,5,150,20);

    tf_bill = new JTextField(10);
    frame.getContentPane().add(tf_bill);
    tf_bill.setBounds(100,30,150,20);

    tf_tip = new JTextField(10);
    frame.getContentPane().add(tf_tip);
    tf_tip.setBounds(100,55,150,20);

    btn_calc = new JButton("calculate");
    btn_calc.addActionListener(this);
    frame.getContentPane().add(btn_calc);
    btn_calc.setBounds(300,15,150,20);

    btn_clear = new JButton("clear");
    btn_clear.addActionListener(this);
    frame.getContentPane().add(btn_clear);
    btn_clear.setBounds(300,45,150,20);

    ta = new JTextArea("",5,20);
    ta.setEditable(false);
    scroll = new JScrollPane(ta);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    frame.getContentPane().add(scroll);
    scroll.setBounds(5,125,600,300);
  }


  public void actionPerformed(ActionEvent e)
  {
    String p = tf_ppl.getText();
    String b = tf_bill.getText();
    String t = tf_tip.getText();

    int ppl = Integer.parseInt(p);
    int bill = Integer.parseInt(b);
    int tip = Integer.parseInt(t);

    if( e.getSource() == btn_calc)
    {
      double tip_amt = (bill*tip)/100;
      double total = tip_amt + bill;
      double share = total/ppl;
      share = (share*100)/100;


      ta.append("tip amount = $" + tip_amt + "\n" + "total with tip amount = $" + total + "\n" + "each person's share = $" + share + "\n");
    }

    else if (e.getSource() == btn_clear)
    {
      tf_ppl.setText("");
      tf_bill.setText("");
      tf_tip.setText("");
      ta.setText("");     
    }
  }

  public static void main(String[] args)
  {
    new Main();
  }
}