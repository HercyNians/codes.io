public class YHTriangle {

	public static void main(String[] args) {
		
		//设计一个能打印出杨辉三角的程序
		int end = 10;//设定层数
		int[][] array = new int[end][ ];//创建一个动态二维数组

		for(int i = 0; i < array.length; i++){

			array[i]=new int[i+1];//每层数字数==层数

			for(int j  = 0; j < array[i].length; j++){
				if(j==0 || j==i){
					array[i][j]=1;//每层的第1个数和最后一个数都为1
					System.out.print(array[i][j]+"\t");
				}else{
					array[i][j] = array[i-1][j] + array[i-1][j-1];
				//其他数的值为上一层同一列的数(i-1,j)和上一层上一列的数(i-1,j-1)的和
					System.out.print(array[i][j]+"\t");
				}
			}
			System.out.print("\n");
		}
	}
}