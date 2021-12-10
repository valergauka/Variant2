package lab1;

public class Variant2 {
    public double integer(double m) {
        double result = m / 1000;
        return result;
    }

    public boolean booleane(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int ife(int a) {
        if (a > 0)
            a++;
        else
            a = a - 2;
        return a;
    }

    public String cases(int k) {

        switch (k) {
            case 1:
                return "плохо";
            case 2:
                return "неудовлетворительно";
            case 3:
                return "удовлетворительно";
            case 4:
                return "хорошо";
            case 5:
                return "отлично";
        }
        return "ошибка";
    }

    public int[] forparametr(int a, int b) {
        assert a < b:"a should be less than b";
        int n = b - a + 2;
        int[] result = new int[n];
        int c = 0;
        for (int i = a; i <= b; i++) {
            result[c++] = i;
        }
        result[c] = b - a + 1;

        return result;
    }

    public int whiles(int a, int b) {
        assert a > b:"a should be more than b";
        int num = 0;
        while (a - b >= 0) {
            a -= b;
            ++num;
        }
        return num;
    }

    public double minmax(int n, double[] a, double[] b) {
        double s, min = 0;
        for (int i = 1; i <=n; i++) {
            s = a[i] * b[i];
            if (i == 1) {
                min = s;
            }
        }
        return min;
    }

    public int[] arrays(int n){
        assert n > 0:"n should be more than 0";
        int[] a = new int[n];
        a[0]=2;
        for (int i = 1; i < n; ++i){
            a[i] = a[i - 1] * 2;
        }
        return a;
    }

    public int[][]  matrixs(int m, int n){
        int matrix[][] = new int[m][n];
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j) {
                matrix[i][j] = (j + 1) * 5;
            }
        }
        return matrix;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }
}
