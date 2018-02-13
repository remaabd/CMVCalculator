import javax.swing.JOptionPane;

public class Calcmodel {

	static double  result,flag1,flag2,flag3,flag4=0;
	
	public static double add(double firstNum,double SecondNum){
		try{
		return result= firstNum+SecondNum;
		}
		catch(Exception exp){
			flag3=1;
			return -1;
		}
	}
	public static double sub(double firstNum,double SecondNum){
		try{
		return result= firstNum - SecondNum;
		}
		catch(Exception exp){
			flag3=1;
			return -1;
		}
	}
	public static double mul(double firstNum,double SecondNum){
		try{
		return result= firstNum * SecondNum;
		}
        catch( Exception exp){
			flag3=1;
			return -1;
		}
	}
	public static double div(double firstNum,double SecondNum){
		try{
			if(SecondNum==0){
				flag1=1;
				return -3;
			}
			else return result= firstNum/SecondNum;}
		catch(Exception exp){
			flag3=1;
			return -1;
		}
	}
	public static double mod(double a,double b){
		try{
			if(b==0){
				flag1=1;
				return -3;
			}
			else if(a-Math.floor(a)!=0){
				flag4=1;
				return -4;
			}
			else if(b-Math.floor(b)!=0){
				flag4=1;
				return -4;
			}
			if(b==0){
				flag1=1;
				return -3;
			}
			else return (result= a%b);}
		catch(Exception exp){
			flag3=1;
			return -1;
		}
	}
	public static  double sqr(double firstNum){
		try{
			if(firstNum<0){
				flag2=1;
				return -2;
			}
			else return result= (double) Math.sqrt(firstNum);
		}
        catch (Exception exp){
        	flag3=1;
			return -1;
		}
	}
   
}
