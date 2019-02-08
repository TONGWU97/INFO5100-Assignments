package homework04;
/*
 * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
   For example: given input matrix = [ [1,2,3],
                                       [4,5,6],
                                       [7,8,9] ],
   rotate the input matrix in-place such that it becomes: [ [7,4,1],
                                                            [8,5,2],
                                                            [9,6,3] ],
 * */
public class Assignment_5 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotateMatrix(matrix);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void rotateMatrix(int[][] matrix){
		int n = matrix.length;
		for(int i = 0; i < (n+1)/2; i++){
			for(int j = 0; j < n/2; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
			}
		}
	}
}
