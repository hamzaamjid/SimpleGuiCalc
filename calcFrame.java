package calculatorPackage;
import java.awt.Color;
import java.awt.FlowLayout;
import java.math.BigInteger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


import javax.swing.JFrame;



public class calcFrame extends JFrame implements ActionListener {
	
	public static final int WIDTH = 300; 
	public static final int HEIGHT = 320;
	private static JTextField ioField;
	String creator = "";
	BigInteger dig1 = null;
	BigInteger result = new BigInteger("0");
	BigInteger dig2 = null;
	

	
public calcFrame() {
	super();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(WIDTH,HEIGHT);
	setTitle("GUI CALCULATOR");
	JPanel textPanel = new JPanel( );

    textPanel.setLayout(new FlowLayout( ));
    ioField = new JTextField(" ", 150);
    add(ioField);
    
    
    getContentPane().setBackground( Color.GRAY );
    // buttons
	JButton zero = new JButton("0");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine= new JButton("9");
	JButton erase = new JButton("Delete");
	JButton clear = new JButton("Clear");
	JButton division = new JButton("/");
	JButton multiplication = new JButton("*");
	JButton subtraction = new JButton("-");
	JButton addition = new JButton("+");
	JButton equal = new JButton("=");
	JButton decimal = new JButton(".");
	JButton dummy1 = new JButton(" ");
	JButton dummy2 = new JButton(" ");
	JButton dummy3 = new JButton(" ");
	JButton dummy4 = new JButton(" ");	
	setLayout(new FlowLayout());
    
	
	
	add(zero);
	add(one);
	add(two);
	add(three);
	add(four);
	add(five);
	add(six);
	add(seven);
	add(eight);
	add(nine);
	add(erase);
	add(decimal);
	add(clear);
	add(division);
	add(multiplication);
	add(subtraction);
	add(addition);
	add(equal);
	add(dummy1);
	add(dummy2);
	add(dummy3);
	add(dummy4);
	
	// action listeners
	
	clear.addActionListener(this);
	one.addActionListener(this);
	two.addActionListener(this);
	three.addActionListener(this);
	four.addActionListener(this);
	five.addActionListener(this);
	six.addActionListener(this);
	seven.addActionListener(this);
	eight.addActionListener(this);
	nine.addActionListener(this);
	zero.addActionListener(this);
	decimal.addActionListener(this);
	equal.addActionListener(this);
	erase.addActionListener(this);
	addition.addActionListener(this);
	subtraction.addActionListener(this);
	multiplication.addActionListener(this);
	division.addActionListener(this);
	
	
	 
}
	

// On exceptions 

public void actionPerformed(ActionEvent e)
{
    try
    {
        assumingCorrectNumberFormats(e);
    }
    catch (NumberFormatException er)
    {
        ioField.setText("Please retype the number");
    }
}


private void assumingCorrectNumberFormats(ActionEvent e) {
	// TODO Auto-generated method stub
	String frame = ioField.getText();
	String x = e.getActionCommand();
	
	if (x.equals("+")) {
		dig1 = result;
		dig2 = new BigInteger(ioField.getText());
		result = calcFrame.answer(dig1,dig2,creator);
		creator = "+";
		ioField.setText("");
		
		
	}
	else if (x.equals("Delete")){
		frame = frame.substring(0,frame.length()-1);
		ioField.setText(frame);
	}
	else if (x.equals("Clear")){
		dig1 = new BigInteger("0");
		result = new BigInteger("0");
		dig2 = new BigInteger("0");
		creator = "";
        ioField.setText("");
	}
	else if (x.equals("1")){
		frame = frame.concat("1");
		ioField.setText(frame);
	}

	else if (x.equals("2")){
			frame = frame.concat("2");
			ioField.setText(frame);
	
	}
	else if (x.equals("3")){
		frame = frame.concat("3");
		ioField.setText(frame);
		
	}
	else if (x.equals("4")){
		frame = frame.concat("4");
		ioField.setText(frame);
		}
	else if (x.equals("5")){
		frame = frame.concat("5");
		ioField.setText(frame);
		}
	else if (x.equals("6")){
		frame = frame.concat("6");
		ioField.setText(frame);
		}
	else if (x.equals("7")){
		ioField.setText(ioField.getText()+"7");
		}
	else if (x.equals("8")){
			frame = frame.concat("8");
			ioField.setText(frame);
		}
	else if (x.equals("9")){
			frame = frame.concat("9");
			ioField.setText(frame);
		}
	else if (x.equals("0")){
			frame = frame.concat("0");
			ioField.setText(frame);
		}
	else if (x.equals("-")){ 
		dig1 = result;
		dig2 = new BigInteger(ioField.getText());
		result = calcFrame.answer(dig1,dig2,creator);
		creator = "-";
		ioField.setText("");
		
	}
	else if (x.equals("/")){ 
		dig1 = result;
		dig2 = new BigInteger(ioField.getText());
		result = calcFrame.answer(dig1,dig2,creator);
		creator = "/";
		ioField.setText("");
		
	}
	
	else if (x.equals("*")){
		dig1 = result;
		dig2 = new BigInteger(ioField.getText());
		result = calcFrame.answer(dig1,dig2,creator);
		creator = "*";
		ioField.setText("");
	
	}
	else if (x.equals("=")){
		dig1 = result;
		dig2 = new BigInteger(ioField.getText());
		result = calcFrame.answer(dig1, dig2, creator);
		creator = "";
		ioField.setText(result.toString());
		
	
	
	
	}
	else
        ioField.setText("Oops. Something Went Wrong!.");
}
	
	






private static BigInteger answer(BigInteger dig1x, BigInteger dig2x, String creatorx) {
	// TODO Auto-generated method stub
	BigInteger answer = new BigInteger("0");
	if (creatorx.equals("+")){
		answer = dig1x.add(dig2x);
	}
	else if (creatorx.equals("-")){
		answer = dig1x.subtract(dig2x);
		
	}
	else if(creatorx.equals("*")){
		answer = dig1x.multiply(dig2x);
			
		
	}
	else if (creatorx.equals("/")){
			try {
				answer = dig1x.divide(dig2x);}
			catch (Exception e)
	        {
	            ioField.setText("Oops. Enter the number again.");
	        }answer = dig1x.divide(dig2x);
	
	}
	else 
		answer = dig2x; 
	return answer;
}
}
