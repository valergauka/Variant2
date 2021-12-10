package lab1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class Variant2Test {
    @Test(dataProvider = "inputProvider")
    public void integer(double p1, double p2) {
        assertEquals(new Variant2().integer(p1), p2);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][]{{200, 0.2},{50,0.05}};
    }

    @Test(dataProvider = "inputProv")
    public void bolean(int p1, boolean p2) {
        assertEquals(new Variant2().booleane(p1), p2);
    }

    @DataProvider
    public Object[][] inputProv() {
        return new Object[][]{{5,false},{2,true}};
    }

    @Test(dataProvider = "inputIf")
    public void ife(int p1, int p2) {
        assertEquals(new Variant2().ife(p1), p2);
    }
    @DataProvider
    public Object[][] inputIf() {
        return new Object[][]{{5,6},{-2,-4}};
    }


    @Test(dataProvider = "inputCase")
    public void cases(int p1, String p2) {
        assertEquals(new Variant2().cases(p1),p2);
    }
    @DataProvider
    public Object[][] inputCase() {
        return new Object[][]{{1,"плохо"},{4,"хорошо"},{6,"ошибка"}};
    }

    @Test(dataProvider = "inputForparametr")
    public void forparametr(int p1, int p2 , int[] p3) {
        assertArrayEquals(new Variant2().forparametr(p1,p2),p3);
    }
    @DataProvider
    public Object[][] inputForparametr() {
        return new Object[][]{{4,9,new int[]{4,5,6,7,8,9,6}}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeForparametr() {
        new Variant2().forparametr(7, 3);
    }


    @Test(dataProvider = "inputWhile")
    public void whiles(int p1, int p2 ,int p3) {
        assertEquals(new Variant2().whiles(p1,p2),p3);
    }
    @DataProvider
    public Object[][] inputWhile() {
        return new Object[][]{{8,3,2},{10,6,1}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeWhile() {
        new Variant2().whiles(2, 8);
    }

    @Test(dataProvider = "inputMinmax")
    public void minmax(int p1, double[] p2 ,double[] p3,double p4) {
        assertEquals(new Variant2().minmax(p1,p2,p3),p4);
    }
    @DataProvider
    public Object[][] inputMinmax() {
        return new Object[][]{{1,new double[]{9,6}, new double[]{8,4},24}};
    }
    @Test(dataProvider = "inputArray")
    public void arrays(int p1,int[] p2) {
        assertArrayEquals(new Variant2().arrays(p1),p2);
    }
    @DataProvider
    public Object[][] inputArray() {
        return new Object[][]{{4,new int[]{2,4,8,16}}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeArray() {
        new Variant2().arrays(-4);
    }

    @Test(dataProvider = "inputMatrix")
    public void matrixs(int p1, int p2, int[][] output) {
        assertArrayEquals(output,new Variant2().matrixs(p1,p2));

    }

    @DataProvider
    public Object[][] inputMatrix() {
        int[][] output = {{5, 10, 15},
                {5, 10, 15},
                {5, 10, 15}};

        return new Object[][]{{3, 3,output}};

    }

}
