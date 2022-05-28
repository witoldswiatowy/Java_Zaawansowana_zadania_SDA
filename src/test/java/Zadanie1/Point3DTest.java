package Zadanie1;

import OOP.Zadanie1.Point3D;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Point3DTest {

    @Test
    void shouldCreateNewPointWhichNullValue() {
        //given
        float expectecResultX = 0.0f;
        float expectecResultY = 0.0f;
        float expectecResultZ = 0.0f;
        //when
        Point3D point3D = new Point3D();
        //then
        assertThat(point3D.getX()).isEqualTo(expectecResultX);
        assertThat(point3D.getY()).isEqualTo(expectecResultY);
        assertThat(point3D.getZ()).isEqualTo(expectecResultZ);
    }

    @Test
    void shouldCreateNewPointWhichValue() {
        //given
        float expectecResultX = 2.5f;
        float expectecResultY = 1.3f;
        float expectecResultZ = 5.3f;
        //when
        Point3D point3D = new Point3D(2.5f, 1.3f, 5.3f);
        //then
        assertThat(point3D.getX()).isEqualTo(expectecResultX);
        assertThat(point3D.getY()).isEqualTo(expectecResultY);
        assertThat(point3D.getZ()).isEqualTo(expectecResultZ);
    }

    @Test
    void shouldShowCorrectCreateStringVariabels() {
        //given
        Point3D point3D = new Point3D(2.5f, 1.3f, 5.3f);
        String expectedResult = "(2.5, 1.3, 5.3)";
        //when
        String result = point3D.toString();
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldChangeParametrPoint(){
        //given
        Point3D point3D = new Point3D(2.5f, 1.3f, 5.3f);
        String expectedResult = "(3.5, 0.0, 45.12)";
        //when
        point3D.setXYZ(3.5f, 0.0f, 45.12f);
        //then
        assertThat(point3D.toString()).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturn3ElementsArray(){
        //given
        Point3D point3D = new Point3D(2.5f, 1.3f,5.3f);
        int expectedResult = 3;
        //when
        int result = point3D.getXYZ().length;
        //then
        assertThat(result).isEqualTo(expectedResult);
    }
    @Test
    void shouldReturnCorrectElementsInArray(){
        //given
        Point3D point3D = new Point3D(2.5f, 1.3f, 5.3f);
        float expectedResult1 = 2.5f;
        float expectedResult2 = 1.3f;
        float expectedResult3 = 5.3f;
        //when
        float [] resultArray = point3D.getXYZ();
        //then
        assertThat(resultArray[0]).isEqualTo(expectedResult1);
        assertThat(resultArray[1]).isEqualTo(expectedResult2);
        assertThat(resultArray[2]).isEqualTo(expectedResult3);
    }

}