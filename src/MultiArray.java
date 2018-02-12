import java.util.Random;

public class MultiArray {
    private int[][] array;

    public MultiArray() {

    }

    public MultiArray(int n, int m) {

        array = new int[n][m];

        randomize();

        }

        public void randomize(){
            Random randomNumber = new Random();
                for(int i = 0; i < array.length; i++) {
                        for(int j = 0; j < array[1].length; j++) {
                                array[i][j] = randomNumber.nextInt(10);
                        }
                    }
            }

            public  int findMin() {
                int min = array[0][0];

                        for(int i = 0; i < array.length; i++) {
                        for(int j = 0; j < array[1].length; j++) {
                                if(array[i][j] < min) {
                                        min = array[i][j];
                                    }
                            }
                    }
                return min;
            }

            public  int findMax() {
                int max = array[0][0];

                        for(int i = 0; i < array.length; i++) {
                        for(int j = 0; j < array[1].length; j++) {
                                if(array[i][j] > max) {
                                        max = array[i][j];
                                    }
                            }
                    }
                return max;
            }

            public void print() {
                for(int i = 0; i < array.length; i++) {
                        for(int j = 0; j < array[1].length; j++) {
                                System.out.print(array[i][j]);
                            }
                        System.out.println("");
                    }
                System.out.println("");
            }
}