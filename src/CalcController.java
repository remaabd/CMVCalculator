import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
   private Calcmodel model=new Calcmodel();
   private CalcView view=new CalcView();
   
   CalcController(Calcmodel model,CalcView view){
	   this.model=model;
	   this.view=view;
	   
	   this.view.addAdditionListner(new AdditionListner());
	   this.view.addSubstractionListner(new SubListner());
	   this.view.addMultiplyListner(new MulListner());
	   this.view.addDivisionListner(new DivListner());
	   this.view.addSqrListner(new SqrListner());
	   
   }
   class AdditionListner implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int firstNum,secondNum =0;
		try{
			firstNum= view.getFirstNum();
			secondNum= view.getSecondNum();
			
			model.add(firstNum, secondNum);
			view.setResult(model.getResult());
		}
		
		catch(Exception ex){
			view.DisplayErrorMesage(" you have to enter 2 integers");
		}
	}
	   
   }
   class SubListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNum,secondNum =0;
			try{
				firstNum= view.getFirstNum();
				secondNum= view.getSecondNum();
				
				model.sub(firstNum, secondNum);
				view.setResult(model.getResult());
			}
			
			catch(Exception ex){
				view.DisplayErrorMesage(" you have to enter 2 integers");
			}
		}
		   
	   }
   class MulListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNum,secondNum =0;
			try{
				firstNum= view.getFirstNum();
				secondNum= view.getSecondNum();
				
				model.mul(firstNum, secondNum);
				view.setResult(model.getResult());
			}
			
			catch(Exception ex){
				view.DisplayErrorMesage(" you have to enter 2 integers");
			}
		}
		   
	   }
   class DivListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNum,secondNum =0;
			try{
				firstNum= view.getFirstNum();
				secondNum= view.getSecondNum();
				
				model.div(firstNum, secondNum);
				view.setResult(model.getResult());
			}
			
			catch(Exception ex){
				view.DisplayErrorMesage(" you have to enter 2 non zero integers");
			}
		}
		   
	   }
   class SqrListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNum=0;
			try{
				firstNum= view.getFirstNum();
				
				model.sqr(firstNum);
				view.setResult(model.getResult());
			}
			
			catch(Exception ex){
				view.DisplayErrorMesage(" you have to enter an integer value");
			}
		}
		   
	   }
}
