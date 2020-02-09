public class Print {


    public void matrixPrint(int matrix[][]){
        for (int row[] : matrix){
            for (int i : row){
                System.out.print(i + " ");
            }
            System.out.println( );
        }
    }


}
