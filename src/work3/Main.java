package work3;

/**
 * The Main class demonstrates the functionality of graphic elements
 * and decorators.
 */
public class Main {
    /**
     * The main method to run the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a simple graphic element
        GraphicElement simpleElement = new SimpleGraphicElement();

        // Add a color background
        GraphicElement coloredElement = new ColorBackground(simpleElement, "Red");

        // Add a gradient to the colored element
        GraphicElement gradientElement = new GradientDecorator(coloredElement, "Linear");

        // Call the draw method to demonstrate the effects
        gradientElement.draw(10, 20);
    }
}
