public class Rotate {


    public int[][] rotateNxN(int matrix[][]){

        int rotatedMatrix[][] = new int[matrix.length][matrix.length];

        for(int i = 0; i<matrix.length ; i++){
            for (int j = 0; j < matrix.length; j++){
                rotatedMatrix[i][j] = matrix[j][matrix[j].length - i - 1];
            }
        }

        return rotatedMatrix;
    }
}
