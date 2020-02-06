package dij;

import java.util.Random;

/**
 * @author: cdf
 * @create: 2020-02-06 15:55
 **/
public class RandomTest {

	public static void main(String[] args) {

		Random random=new Random();

		int [] a=new int[random.nextInt(10)];



		for(int i=0;i<a.length;i++){
			a[i]=random.nextInt(100);
			System.out.println("a["+i+"] ="+a[i]);
		}


	}
}
