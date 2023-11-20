
// Step 5: Implement a class named Sphere
class Sphere implements AreaMeasurable {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
}