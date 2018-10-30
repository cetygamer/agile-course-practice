package ru.unn.agile.threeDimShapesArea.Model;

/**
 * Created by Maria Pronina.
 */
public class Hexagon implements Shape {
    private double a;
    private static final double HEXAGON_AREA_COEF = 3 * Math.sqrt(3) / 2;

    public Hexagon(final double sideSize) {
        if (sideSize <= 0) {
            throw new IllegalArgumentException(ShapesAreaConstants.ILLEGAL_ARGUMENTS_EXCEPTION_STR);
        }
        a = sideSize;
    }

    @Override
    public double getArea() {
        return HEXAGON_AREA_COEF * a * a;
    }
}
