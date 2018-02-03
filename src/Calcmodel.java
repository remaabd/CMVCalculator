
public class Calcmodel {

	private int  result;
	
	public void add(int firstNum,int SecondNum){
		result= firstNum+SecondNum;
	}
	public void sub(int firstNum,int SecondNum){
		result= firstNum - SecondNum;
	}
	public void mul(int firstNum,int SecondNum){
		result= firstNum * SecondNum;
	}
	public void div(int firstNum,int SecondNum){
		result= firstNum/SecondNum;
	}
	public void sqr(int firstNum){
		result= (int) Math.sqrt(firstNum);
	}
    public int getResult(){
	   return result;
   }
}
