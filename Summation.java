
public class Summation implements Runnable{
	public static void main(String[] args) {}
	
private int upper;
private Sum sumValue;
public Summation(int upper, Sum sumValue){
	this.upper = upper;
	this.sumValue = sumValue;
}
public void run() {
	// Caluculating ∑i2 
	int sum = 0;
	for(int i=0; i<= upper; i++) {
		int temp = 0;
	temp = i*i;
		sum += temp;
	} 

  /* Caluculating ∑i3
	int sum = 0;
	for(int i=0; i<= upper; i++) {
		int temp = 0;
	temp = i*i*i;
		sum += temp;
	} */
		
	sumValue.setSum(sum);
}
}
