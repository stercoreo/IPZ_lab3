package work3;

/**
 * The GradientDecorator class is a decorator that adds a gradient effect
 * to a graphic element.
 */
public class GradientDecorator extends Decorator {
    private String gradientType;

    /**
     * Constructor to initialize the gradient decorator.
     *
     * @param element the graphic element to which the gradient will be applied
     * @param gradientType the type of gradient
     */
    public GradientDecorator(GraphicElement element, String gradientType) {
        super(element);
        this.gradientType = gradientType;
    }

    @Override
    public void draw(int x, int y) {
        super.draw(x, y);
        System.out.println("Applying gradient: " + gradientType);
    }
}
