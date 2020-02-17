package ru.geekbrains.java3;

public class Main {

    public static void main(String[] args) {
        int  n = 5;
        int v = 1;
        int[][] arr = new int[n][n];

        int startI = 0, startJ = 0; //индексы начала заполнения строк и столбцов
        int endI = n- 1, endJ = n - 1; // индексы конца заполнения строк и столбцов

        for(int k = 1; k < 2*n ; k ++){ // количесвто "векторов" заполнения

            switch (k%4){ //вычисляем направление движения
                case(1) : // слева направо
                    for(int j = startJ; j<= endJ; j++){
                        arr[startI][j] = v;
                        v ++;
                    }
                    startI ++;
                    break;
                case(2): //сверху вниз
                    for(int i = startI; i<= endI; i++){
                        arr[i][endJ] = v;
                        v ++;
                    }
                    endJ --;
                    break;
                case(3): //справа налево
                    for(int j = endJ; j>= startJ; j--){
                        arr[endI][j] = v;
                        v ++;
                    }
                    endI --;
                    break;
                case(0): //снизу вверх
                    for(int i = endI; i>= startI; i--){
                        arr[i][startJ] = v;
                        v ++;
                    }
                    startJ ++;
                    break;

            }


        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }

    }
}
