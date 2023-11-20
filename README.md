# Architectural Blueprint Tool

### Level of Difficulty: Intermediate
### Title: Architectural Blueprint Tool
### Overview: 
In this assignment, you will be creating a simple architectural blueprint tool that calculates the area of various shapes and structures. This tool will be useful for architects and engineers who need to quickly calculate the area of different structures in their designs.

**Step Guidance:**
1. Create an interface named `AreaMeasurable` with a method named `getArea()`.
2. Implement a class named `Circle` that implements `AreaMeasurable`. The class should have a constructor that takes the radius as an argument and a `getArea()` method that calculates the area of the circle.
3. Implement a class named `Rectangle` that implements `AreaMeasurable`. The class should have a constructor that takes the length and width as arguments and a `getArea()` method that calculates the area of the rectangle.
4. Implement a class named `Square` that extends `Rectangle`. The class should have a constructor that takes the side length as an argument.
5. Implement a class named `Sphere` that implements `AreaMeasurable`. The class should have a constructor that takes the radius as an argument and a `getArea()` method that calculates the surface area of the sphere.
6. Implement a class named `Box` that implements `AreaMeasurable`. The class should have a constructor that takes the length, width, and height as arguments and a `getArea()` method that calculates the total surface area of the box.
7. Implement a class named `Cube` that extends `Box`. The class should have a constructor that takes the side length as an argument.
8. Implement a class named `Main` with a `main()` method and `nextRandomDouble()` and `calculateSum()` methods. The `main()` method should create an ArrayList of `AreaMeasurable` and populate that list with random instances of your `AreaMeasurable` classes. Each `AreaMeasurable` should be created with random dimensions using the `nextRandomDouble()` method. Finally, call the `calculateSum()` method and print the result.

**Examples:**
*Input:* 
Create a circle with radius 0.5
*Output:* 
Area of circle: 0.7853981633974483

*Input:* 
Create a rectangle with length 1.0 and width 0.5
*Output:* 
Area of rectangle: 0.5

**Notes:** 
- Use the formula for the area of a circle, rectangle, sphere, and box to implement the `getArea()` method in each class.
- Use the `java.util.Random` class to generate random numbers for the dimensions of the shapes.

**Bonus:** 
- Add a method to each class that calculates the perimeter or circumference of the shape.
- Add a method to the `Sphere` and `Box` classes that calculates the volume.
