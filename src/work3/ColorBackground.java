package work3;

/**
 * The ColorBackground class is a decorator that adds a color background
 * to a graphic element.
 */
public class ColorBackground extends Decorator {
    private String color;

    /**
     * Constructor to initialize the color background decorator.
     *
     * @param element the graphic element to which the background will be applied
     * @param color the color of the background
     */
    public ColorBackground(GraphicElement element, String color) {
        super(element);
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        super.draw(x, y);
        System.out.println("Adding color background: " + color);
    }
}
