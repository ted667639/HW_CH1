
public class p15 {

	public static void main(String[] args){
		Car car1;
		car1=new Car();

		int number=1234;
		double gas=20.5;
		car1.setNum(number, gas);
	}
}
/*class Car
{
	int num;
	double gas;
	void setNum(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�N�T�o�q�]��"+gas);
	}
	void setGas(double g)
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}*/