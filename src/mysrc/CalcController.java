package mysrc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalcController {
   private Calcmodel model=new Calcmodel();
   private CalcView view=new CalcView();
   String res;
  
   CalcController(Calcmodel model,CalcView view){
	   this.model=model;
	   this.view=view;
	  
	   this.view.addAdditionListner(new AdditionListner());
	   this.view.addSubstractionListner(new SubListner());
	   this.view.addMultiplyListner(new MulListner());
	   this.view.addDivisionListner(new DivListner());
	   this.view.addMODListner(new ModListner());
	   this.view.addSqrListner(new SqrListner());
	   
   }
   class AdditionListner implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		double firstNum,secondNum,result =0;
		model.flag1=0;model.flag2=0;model.flag3=0;model.flag4=0;
			firstNum= view.getFirstNum();
			secondNum= view.getSecondNum();
			
			result=model.add(firstNum, secondNum);
			if(model.flag3==1)
			{   // view.DisplayErrorMesage(" you have to enter double values");
			     view.FirstNum.setText(""); view.SecondNum.setText(""); 
			 }
			else {  res=String.format("%.3f", result);
			view.setResult(res);
		}
		
	}
	   
   }
   class SubListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double firstNum,secondNum,result =0;
			model.flag1=0;model.flag2=0;model.flag3=0;model.flag4=0;
				firstNum= view.getFirstNum();
				secondNum= view.getSecondNum();
				
				result=model.sub(firstNum, secondNum);
				if(model.flag3==1)
				{    //view.DisplayErrorMesage(" you have to enter double values");
				     view.FirstNum.setText(""); view.SecondNum.setText(""); 
				 }
				else {  res=String.format("%.3f", result);
				view.setResult(res);
			}
			
		}
		   
	   }
   class MulListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double firstNum,secondNum ,result=0;
			model.flag1=0;model.flag2=0;model.flag3=0;model.flag4=0;
				firstNum= view.getFirstNum();
				secondNum= view.getSecondNum();
				
				result=model.mul(firstNum, secondNum);
				if(model.flag3==1)
				{   // view.DisplayErrorMesage(" you have to enter double values");
				     view.FirstNum.setText(""); view.SecondNum.setText(""); 
				 }
				else {  res=String.format("%.3f", result);
				view.setResult(res);
			}
			
		}
		   
	   }
   class DivListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double firstNum,secondNum,result =0;
			model.flag1=0;model.flag2=0;model.flag3=0;model.flag4=0;
				firstNum= view.getFirstNum();
				secondNum= view.getSecondNum();
				
				result=model.div(firstNum, secondNum);
				
				if(model.flag3==1)
				{    //view.DisplayErrorMesage(" you have to enter double values");
				     view.FirstNum.setText(""); view.SecondNum.setText(""); 
				 }
				else if(model.flag1==1)
				{
					//view.DisplayErrorMesage(" you can not divide on a zero number, please try again");
				    view.FirstNum.setText(""); view.SecondNum.setText(""); 
				}
				else {  res=String.format("%.3f", result);
				view.setResult(res);
			}
				}

		}
   class ModListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double firstNum,secondNum,result =0;
			model.flag1=0;model.flag2=0;model.flag3=0;model.flag4=0;
				firstNum= view.getFirstNum();
				secondNum= view.getSecondNum();
				
				result=model.mod(firstNum, secondNum);
				
				if(model.flag3==1 || model.flag4==1)
				{    //view.DisplayErrorMesage(" you have to enter integer values");
				     view.FirstNum.setText(""); view.SecondNum.setText(""); 
				 }
				else if(model.flag1==1)
				{
					//view.DisplayErrorMesage(" you can not have amodule on a zero number, please try again");
				    view.FirstNum.setText(""); view.SecondNum.setText(""); 
				}
				else {  res=String.format("%.3f", result);
					view.setResult(res);
				}
				}

		}  
	   
   class SqrListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double firstNum,result=0;
			view.SecondNum.setText(""); 
			model.flag1=0;model.flag2=0;model.flag3=0;model.flag4=0;
				firstNum= view.getFirstNum();
			
				result=model.sqr(firstNum);
				if(model.flag3==1||model.flag2==1)
				{//view.DisplayErrorMesage(" you have to enter a non zero double value");
				view.FirstNum.setText(""); view.SecondNum.setText(""); }
				
				else {  res=String.format("%.3f", result);
				view.setResult(res);
			}
				
				
		}
		   
	   }
}
