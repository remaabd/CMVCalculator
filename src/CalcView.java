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
	public JButton Sqr =new JButton("sqr");
	
	CalcView(){
		JPanel panel =new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,300);
		
		panel.add(FirstNum);
		panel.add(SecondNum);
		panel.add(Result);
		panel.add(Addition);
		panel.add(Multiply);
		panel.add(Substract);
		panel.add(Division);
		panel.add(Sqr);
		
		this.add(panel);
		
	}
	public int getFirstNum(){
		return Integer.parseInt(FirstNum.getText());
	}
	public int getSecondNum(){
		return Integer.parseInt(SecondNum.getText());
	}
	public int getResult(){
		return Integer.parseInt(Result.getText());
	}
	public void setResult(int result){
		Result.setText(result+ "");
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
	public void addSqrListner(ActionListener listner){
		Sqr.addActionListener(listner);
	}
	public void DisplayErrorMesage (String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
