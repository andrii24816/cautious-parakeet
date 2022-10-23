package lab0;

public class Variant5 {



    public int integerNumbersTask(int k, int k1) {
        return k % k1;
    }

    public boolean booleanNumbersTask(int k, int k1) {
        return (k >= 0 || k1 < (-2));
    }

    public int ifNumbersTask(int a, int b, int c){
        int result=0;
        if (a>0) {
            result++;
        }
        if (b>0) {
            result++;
        }
        if (c>0) {
            result++;
        }
        return result;
    }

    public double[] forNumbersTask(double price){
        double[] result = new double [10];
        for (int i = 0; i < 10; i++) {
            result[i]=(i+1)*price/10;
        }
        return result;
    }

public double caseNumbersTask(double a, double b, int c) {
     double result;
    switch (c) {
        case 1:
            result = a+b;
            break;
        case 2:
            result =a-b;
            break;
        case 3:
            result = a*b;
            break;
        case 4:
            result = a/b;
            break;
        default:
            result=0;
            break;
        }
        return result;
    }

    public static int whileNumbersTask(int p1) {
        int result = 0;
        while(p1 >= 2) { // условие входа в цикл
            result = result+1;
            p1=p1/2;
        }
        return result;
    }

    public int[] arrayNumbersTask(int N){
        int[] result = new int [N];
        result[0]=1;
        if (N>1) {
            result[1] = 1;
            for (int i = 2; i < N; i++) {
                result[i] = result[i - 2] + result[i - 1];
            }
        }
        return result;
    }

    public double[][] matrixNumbersTask(int M, int N, double D, int[] p2){
        double[][] result = new double [M][N];
        for (int i = 0; i < M; i++) {
            result[i][0]=p2[i];
            for (int j = 1; j < N; j++) {
                result[i][j] = result[i][j-1]+D;
            }
        }
        return result;
    }
/////////////////////////////////////


}
