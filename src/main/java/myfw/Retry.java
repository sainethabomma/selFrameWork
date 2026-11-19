package myfw;

public class Retry {
	
	public void retryyy(int j) {
		
		for (int i = 0; i < j; i++) {
			System.out.println("Retied time"+i);
			
		}
		
	}
	public static void main(String[] args) {
		Retry r=new Retry();
		r.retryyy(5);
	}

}
