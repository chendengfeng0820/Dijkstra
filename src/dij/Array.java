package dij;

/**
 * @author: cdf
 * @create: 2020-02-06 15:48
 **/
public class Array {

	public static void main(String[] args) {

		int[] month=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

		for(int i=0;i<month.length;i++){
			System.out.println("第"+(i+1)+"月有"+month[i]+"天");
		}
	}
}
