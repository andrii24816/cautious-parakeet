package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant5;

public class Variant5Test {




    ////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void integerTest(int p1, int p2, int p3) {
        assertEquals(new Variant5().integerNumbersTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 100, 99, 1 }, { 12, 12, 0 }, { 139, 5, 4 } };
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant5().booleanNumbersTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 1, -3, true }, { 3, 14, true }, { -5, 4, false } };
    }
    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p3, int p4) {
        assertEquals(new Variant5().ifNumbersTask(p1, p2, p3), p4);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 1, -3, 2, 2}, { 3, 14, 3, 3 }, { -5, -44, 17, 1 } };
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(double p1, double[] p2) {
        assertEquals(new Variant5().forNumbersTask(p1), p2);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] {{ 10, new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}}};
    }
///////////////////////////
    @Test(dataProvider = "caseProvider")
    public void forTest(double p1, double p2, int p3, double p4) {
        assertEquals(new Variant5().caseNumbersTask(p1, p2, p3), p4);
    }

    @DataProvider
    public Object[][] caseProvider() {
        return new Object[][] { { 1, -3, 2, 4}, { 3, 14, 3, 42}, { -10, -5, 4, 2 } };
    }
    ////////////////////////////////////////////////
    @Test(dataProvider = "whileProvider")
    public void whileTest(int p1, int p2) {
        assertEquals(new Variant5().whileNumbersTask(p1), p2);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 8, 3 }, { 16, 4 }, { 2, 1} };
    }


    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int p1, int[] p2) {
        assertEquals(new Variant5().arrayNumbersTask(p1), p2);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] {{ 5, new int[]{1, 1, 2, 3, 5}}};
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int M, int N, double D, int[] p2, double[][] p3) {
        assertEquals(new Variant5().matrixNumbersTask(M,N,D,p2), p3);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        return new Object[][] {{ 2, 2, 6, new int[]{1, 8}, new double[][]{{1, 7}, {8, 14}}}};
    }

}