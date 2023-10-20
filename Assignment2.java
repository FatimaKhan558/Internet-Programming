import java.time.LocalDateTime;

// IShape interface with a draw method
interface IShape {
    void draw();
}

// Abstract Shape class with common attributes and methods
abstract class Shape implements IShape {
    private String name;
    private LocalDateTime creationDateTime;

    public Shape() {
        this.creationDateTime = LocalDateTime.now();
    }

    public Shape(String name) {
        this.name = name;
        this.creationDateTime = LocalDateTime.now();
    }

    // Getters and Setters for name and creationDateTime
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a generic shape with name: " + getName());
    }

    // Abstract method to be implemented by derived classes
    abstract double getArea();

    @Override
    public String toString() {
        return "Shape [name=" + name + ", creationDateTime=" + creationDateTime + "]";
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with name: " + getName());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with name: " + getName());
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with name: " + getName());
    }
}

class Node {
    Shape data;
    Node next;

    public Node(Shape shape) {
        this.data = shape;
        this.next = null;
    }
}

class ShapeLinkedList {
    private Node head;

    public ShapeLinkedList() {
        head = null;
    }

    public void insert(Shape shape) {
        Node newNode = new Node(shape);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current.data.draw(); // Call the draw method to visualize the shape
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeLinkedList shapeList = new ShapeLinkedList();

        // Create 100 different shapes and add them to the linked list
        for (int i = 1; i <= 100; i++) {
            Shape shape;
            if (i % 3 == 0) {
                shape = new Square("Square" + i, i);
            } else if (i % 3 == 1) {
                shape = new Rectangle("Rectangle" + i, i, i * 2);
            } else {
                shape = new Triangle("Triangle" + i, i, i * 2);
            }
            shapeList.insert(shape);
        }

        shapeList.display();
    }
}
