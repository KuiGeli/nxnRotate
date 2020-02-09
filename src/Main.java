public class Main {


    public static void main(String[] args) {
        Print print = new Print();
        Rotate rotate = new Rotate();
        int matrix[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

//        print.matrixPrint(matrix);
        print.matrixPrint(rotate.rotateNxN(matrix));

    }
}
