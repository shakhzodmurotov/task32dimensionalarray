public class Main {
    public static void main(String[] args)
    {
        int [][] matrix = new int[10][10];
        int sumdiogonal = 0 ;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j< 10; j++){
                if(i==j){
                    matrix[i][j] = i;
                    sumdiogonal += matrix[i][j];
                }
                else {
                    matrix[i][j] = 0;
                }
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Sum of the diogonal" + sumdiogonal);
    }
}