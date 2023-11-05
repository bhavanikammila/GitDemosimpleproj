package Practice;

public class Sample {

	public void addition(int input1, int input2) {
		int output=input1+input2;
		System.out.println("Sum is " +output);
	}
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.addition(30,40);
	}

}
