public class test{
	public static void main(String[] args){
		int count = 0;
		for(int i = 1; i < 5000; i++){
			if(i%5 == 0 && i%10 != 0){
				count++;
			}
		}
		System.out.println(count);
	}
}
