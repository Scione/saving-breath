package games.phenomena;

public class Point
{
    private float x, y;

    public Point(float xPosition, float yPosition)
    {
        x = xPosition;
        y = yPosition;
    }

    public float getX()
    {
        return x;
    }

    public void setX(float newX)
    {
        x = newX;
    }

    public void addToX(float additionalX)
    {
        x += additionalX;
    }

    public void multiplyX(float xMultiplier)
    {
        x *= xMultiplier;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float newY)
    {
        y = newY;
    }

    public void addToY(float additionalY)
    {
        y += additionalY;
    }

    public void multiplyY(float yMultiplier)
    {
        y *= yMultiplier;
    }
}