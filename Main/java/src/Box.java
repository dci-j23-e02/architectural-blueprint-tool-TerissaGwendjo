
// Step 6: Implement a class named Box
class Box implements AreaMeasurable {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * (length * width + length * height + width * height);
    }
}