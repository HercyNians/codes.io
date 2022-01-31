public class ArrayExercise{
	public static void main(String[] args){
		int i=0 ;
		int[] num = {4,-1,9,10,23,15,17,15,22,3,54,97,66,103,542,1,9,6,7,88};
		int max = num[0];
		for( ; i < num.length ; i++){
			if(max <= num[i]){
				max = num[i];
			}
		}
		System.out.println(max);
	}
}
class ArrayExercise02{

	public static void main(String[] args) {
		//设计一个能够把数组反转的程序
		//使用逆序赋值法
		int[] array = {11,22,33,44,55,66,77,88,99};//定义数组初始化
		int[] array2 = new int[array.length];//创建一个新的数据空间

		for(int a=0; a<array.length; ++a){//将数组初始化拷贝至新数据空间
			array2[a]=array[a];
		}
		for(int i=0; i<array.length; ++i){//在新数据空间内进行数组反转
			array[i]=array2[array.length-(i+1)];
			System.out.println("array="+array[i]);//输出反转后的数组
		}
	}
}