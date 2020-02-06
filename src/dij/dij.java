package dij;

import java.util.Arrays;

/**
 * @author: cdf
 * @create: 2020-02-06 15:33
 **/
public class dij {

	public static void main(String[] args) {
		char [] vertex=new char[]{'A','B','C','D','E','F','G'};
		final int N=65535;

		int [][] martrix=new int[vertex.length][vertex.length];
		martrix[0]=new int[]{N,5,7,N,N,N,2};
		martrix[1]=new int[]{5,N,N,9,N,N,3};
		martrix[2]=new int[]{7,N,N,N,8,N,N};
		martrix[3]=new int[]{N,9,N,N,N,4,N};
		martrix[4]=new int[]{N,N,8,N,N,5,4};
		martrix[5]=new int[]{N,N,N,4,5,N,6};
		martrix[6]=new int[]{2,3,N,N,4,6,N};

		Graph graph=new Graph(vertex,martrix);

		graph.showGraph();




	}

	static class Graph{
		private char [] vertex; //顶点数组
		private int [][] martrix; //邻接矩阵

		//构造器

		public Graph(char[] vertex, int[][] martrix) {
			this.vertex = vertex;
			this.martrix = martrix;
		}

		//显示图
		public void showGraph(){
			for(int [] link :martrix){
				System.out.println(Arrays.toString(link));
			}
		}
	}
}
