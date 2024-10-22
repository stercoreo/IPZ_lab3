package work3;

/**
 * The SimpleGraphicElement class implements the GraphicElement interface.
 * It is responsible for drawing a simple graphic element.
 */
public class SimpleGraphicElement implements GraphicElement {
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing basic graphic element at x=" + x + " y=" + y);
    }
}
