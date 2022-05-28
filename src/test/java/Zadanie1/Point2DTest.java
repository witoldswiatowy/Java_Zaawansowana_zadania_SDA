package Zadanie1;

import OOP.Zadanie1.Point2D;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Point2DTest {

    @Test
    void shouldCreateNewPointWhichNullValue() {
        //given
        float expectecResultX = 0.0f;
        float expectecResultY = 0.0f;
        //when
        Point2D point2D = new Point2D();
        //then
        assertThat(point2D.getX()).isEqualTo(expectecResultX);
        assertThat(point2D.getY()).isEqualTo(expectecResultY);
    }

    @Test
    void shouldCreateNewPointWhichValue() {
        //given
        float expectecResultX = 2.5f;
        float expectecResultY = 1.3f;
        //when
        Point2D point2D = new Point2D(2.5f, 1.3f);
        //then
        assertThat(point2D.getX()).isEqualTo(expectecResultX);
        assertThat(point2D.getY()).isEqualTo(expectecResultY);
    }

    @Test
    void shouldShowCorrectCreateStringVariabels() {
        //given
        Point2D point2D = new Point2D(2.5f, 1.3f);
        String expectedResult = "(2.5, 1.3)";
        //when
        String result = point2D.toString();
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldChangeParametrPoint(){
        //given
        Point2D point2D = new Point2D(2.5f, 1.3f);
        String expectedResult = "(3.5, 0.0)";
        //when
        point2D.setXY(3.5f, 0.0f);
        //then
        assertThat(point2D.toString()).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturn2ElementsArray(){
        //given
        Point2D point2D = new Point2D(2.5f, 1.3f);
        int expectedResult = 2;
        //when
        int result = point2D.getXY().length;
        //then
        assertThat(result).isEqualTo(expectedResult);
    }
    @Test
    void shouldReturnCorrectElementsInArray(){
        //given
        Point2D point2D = new Point2D(2.5f, 1.3f);
        float expectedResult1 = 2.5f;
        float expectedResult2 = 1.3f;
        //when
        float [] resultArray = point2D.getXY();
        //then
        assertThat(resultArray[0]).isEqualTo(expectedResult1);
        assertThat(resultArray[1]).isEqualTo(expectedResult2);
    }



}