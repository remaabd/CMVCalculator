package mysrc;
import java.awt.Point;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JFrame{
   
	public JTextField FirstNum=new JTextField(10);
	public JTextField SecondNum=new JTextField(10);
	public JTextField Result=new JTextField(10);
	public JButton Addition =new JButton("+");
	public JButton Substract =new JButton("-");
	public JButton Multiply =new JButton("*");
	public JButton Division =new JButton("/");
	public JButton mod =new JButton("%");
	public JButton Sqr =new JButton("sqr");
	
	CalcView(){
		JPanel panel =new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,120);
		this.FirstNum.setText("");this.SecondNum.setText("");
		panel.add(FirstNum);
		panel.add(SecondNum);
		panel.add(Result);
		panel.add(Addition);
		panel.add(Multiply);
		panel.add(Substract);
		panel.add(Division);
		panel.add(mod);
		panel.add(Sqr);
		
		this.add(panel);
		this.setLocation(new Point(470,250));
		
	}
	public double getFirstNum(){
		try{
		return Double.parseDouble(FirstNum.getText());
		}
		catch(Exception exp){
			Calcmodel.flag3=1;
		return 0;
		}
	}
	public double getSecondNum(){
		try{
		return Double.parseDouble(SecondNum.getText());
		}
		catch(Exception exp){
			Calcmodel.flag3=1;
		return 0;
		}
	}
	public double getResult(){
		return Double.parseDouble(Result.getText());
	}
	public void setResult(String res){
		Result.setText(res);
	}
	public void addAdditionListner(ActionListener listner){
		Addition.addActionListener(listner);
	}
	public void addSubstractionListner(ActionListener listner){
		Substract.addActionListener(listner);
	}
	public void addMultiplyListner(ActionListener listner){
		Multiply.addActionListener(listner);
	}
	public void addDivisionListner(ActionListener listner){
		Division.addActionListener(listner);
	}
	public void addMODListner(ActionListener listner){
		mod.addActionListener(listner);
	}
	public void addSqrListner(ActionListener listner){
		Sqr.addActionListener(listner);
	}
	public void DisplayErrorMesage (String errorMessage){
	//	JOptionPane.showMessageDialog(this, errorMessage);
	}
}
