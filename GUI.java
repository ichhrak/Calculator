/**********************Q2-Devoir2 ITI1521....*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class GUI extends JFrame implements ActionListener { 

Calculator  cal;

static boolean count=false;
static JTextField input;
String tmp="";
String first="";


GUI(Calculator p) 
{
  super("Calculator");
  this.cal = p;
  JButton bout0,bout1,bout2,bout3,bout4,bout5,bout6,bout7,bout8,bout9,bout10,bout11,bout12,bout13,bout14,bout15,bout16,bout17,bout18,bout19;
  JPanel pa=new JPanel();
  pa.setLayout(new GridLayout(4,4));
      bout0=new JButton("0");
      pa.add(bout0);
      bout0.addActionListener(this);

      bout1=new JButton("1");
      pa.add(bout1);
      bout1.addActionListener(this);

      bout2=new JButton("2");
      pa.add(bout2);
      bout2.addActionListener(this);

      bout3=new JButton("3");
      pa.add(bout3);
      bout3.addActionListener(this);

      bout15=new JButton("C");
      pa.add(bout15);
      bout15.addActionListener(this);

      bout4=new JButton("4");
      pa.add(bout4);
      bout4.addActionListener(this);

      bout5=new JButton("5");
      pa.add(bout5);
      bout5.addActionListener(this);

      bout6=new JButton("6");
      pa.add(bout6);
      bout6.addActionListener(this);

      bout7=new JButton("7");
      pa.add(bout7);
      bout7.addActionListener(this);

      bout16=new JButton("!");
      pa.add(bout16);
      bout16.addActionListener(this);

      bout8=new JButton("8");
      pa.add(bout8);
      bout8.addActionListener(this);

      bout9=new JButton("9");
      pa.add(bout9);
      bout9.addActionListener(this);

      bout10=new JButton("+");
      pa.add(bout10);
      bout10.addActionListener(this);
 
      bout11=new JButton("-");
      pa.add(bout11);
      bout11.addActionListener(this);
 
      bout12=new JButton("*");
      pa.add(bout12);
      bout12.addActionListener(this);

      bout18=new JButton("pow");
      pa.add(bout18);
      bout18.addActionListener(this);

      bout17=new JButton("sqrt");
      pa.add(bout17);
      bout17.addActionListener(this);

      bout19=new JButton("ln");
      pa.add(bout19);
      bout19.addActionListener(this);

      bout14=new JButton("=");
      pa.add(bout14);
      bout14.addActionListener(this);
 
      bout13=new JButton("/");
      pa.add(bout13);
      bout13.addActionListener(this);
      input=new JTextField(25);
      this.add(pa,BorderLayout.CENTER);
      this.add(input,BorderLayout.NORTH);
      this.setVisible(true);
      this.setSize(400,400);
      this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}


public void actionPerformed(ActionEvent e) {
   String str = e.getActionCommand(); 
   tmp+=str;
   input.setText(tmp);
   if(str.matches("-?\\d+") && !count)
   {
   	first=str;
   	cal.addfirst(Double.parseDouble(first));
   		count=true;
   }
   else if(str.matches("-?\\d+") && count)
   {
   	first+=str;
   	cal.addfirst(Double.parseDouble(first));
   }
   else
   {
   	count=false;
   	 switch(str)
  {
  	case "+":
  	cal.add();
  	break;
  	case "-":
  	cal.subtract();
  	break;
  	case "*":
  	cal.multiply();
  	break;
  	case "/":
  	cal.divide();
  	break;
  	case "!":
  	cal.factorial();
  	break;
  	case "pow":
  	cal.pow();
  	break;
  	case "sqrt":
  	cal.rootSquare();
  	break;
  	case "=":
  	cal.compute();
  	input.setText(tmp+String.valueOf(cal.display()));
  	break;
  	case "ln":
  	cal.nepLog();
  	break;
  	case "C":
  	cal.clear();
  	input.setText("");
  	tmp="";
  	break;
  	default:
  	break;

  }
   }
}



public static void main(String arg[]) {

  GUI gui;

  gui = new GUI(new Calculator());

  gui.setVisible(true);

}
}


