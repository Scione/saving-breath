package games.phenomena;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PointTest
{
    @Test
    public void testPointInitialization()
    {
        int x = 123;
        float y = 0.987f;
        Point point;

        point = new Point(x, y);

        Assertions.assertEquals(123, point.getX());
        Assertions.assertEquals(0.987f, point.getY());
    }

    @Test
    public void testPointAddition()
    {
        float additionalX = 0.123f;
        int additionalY = 987;
        Point point = new Point(123, 0.987f);

        point.addToX(additionalX);
        point.addToY(additionalY);

        Assertions.assertEquals(123.123f, point.getX());
        Assertions.assertEquals(987.987f, point.getY());
    }

    @Test
    public void testPointMultiplication()
    {
        int xMultiplier = 1000;
        float yMultiplier = 0.001f;
        Point point = new Point(123, 0.987f);

        point.multiplyX(xMultiplier);
        point.multiplyY(yMultiplier);

        Assertions.assertEquals(123000, point.getX());
        Assertions.assertEquals(0.000987f, point.getY());
    }
}