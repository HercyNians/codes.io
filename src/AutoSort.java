import java.util.Scanner;
public class AutoSort {


	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("请设置数组元素的上限__ (不小于2，不大于100)");
		int length = myScanner.nextInt(); 

		int[] array = new int[length]; 

		if(length>=2 && length<=100){

			for(int i = 0; i < array.length; i++){

				System.out.println("请输入第"+(i+1)+"个元素的值");
				array[i]= myScanner.nextInt();
			}
		}else{
			System.out.println("请输入正确数值");
			return; 
		
		}
		int temp = 0; 
		
		for(int i = 0; i < array.length-1 ; i++){ 

			for(int j = 0; j < array.length-1 ; j++) {

			if(array[j] > array[j+1]) {

				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}

		}

		}
		System.out.println("----------排序后的数组为----------");
		for(int a =0 ; a < array.length; a++){
			System.out.print(array[a]+" ");
		}

	}
}