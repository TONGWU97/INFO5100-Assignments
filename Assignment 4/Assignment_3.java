package homework04;
/*
 * Given an array nums, write a function to move all 0¡¯s to the end of it 
 * while maintaining the relative order of the non-zero elements.
   For example: [0, 1, 0, 3, 12]
   return: [1, 3, 12, 0, 0]
 * */
public class Assignment_3 {
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		int index = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != 0){
				arr[index] = arr[i];
				index++;
			}
		}
		for(int i = index; i < arr.length; i++){
			arr[i] = 0;
		}
		System.out.print("[");
		for(int i = 0; i < arr.length-1; i++){
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
	}
		
}
