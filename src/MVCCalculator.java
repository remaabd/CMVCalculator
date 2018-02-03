
public class MVCCalculator {

	public static void main(String[] args) {
		
		Calcmodel model =new Calcmodel();
		CalcView view =new CalcView();
		CalcController contoller =new CalcController(model,view);
		view.setVisible(true);

	}

}
