package work3;

/**
 * The abstract Decorator class implements the GraphicElement interface
 * and provides a base implementation for decorators.
 */
public abstract class Decorator implements GraphicElement {
    protected GraphicElement element;

    /**
     * Constructor to initialize the decorator.
     *
     * @param element the graphic element to which decoration will be applied
     */
    public Decorator(GraphicElement element) {
        this.element = element;
    }

    @Override
    public void draw(int x, int y) {
        element.draw(x, y);
    }
}
