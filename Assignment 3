import java.time.LocalDateTime;

class Shape {
    private static int nextID = 1; // Shared variable to generate auto IDs
    private int shapeID;
    private String name;
    private LocalDateTime creationDateTime;

    public Shape() {
        this.shapeID = nextID++;
        this.creationDateTime = LocalDateTime.now();
    }

    public Shape(String name) {
        this();
        this.name = name;
    }

    // Getters and Setters
    public int getShapeID() {
        return shapeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Shape [shapeID=" + shapeID + ", name=" + name + ", creationDateTime=" + creationDateTime + "]";
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    double getArea() {
        return sideLength * sideLength;
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

    double getArea() {
        return length * width;
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

    double getArea() {
        return 0.5 * base * height;
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
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeLinkedList shapeList = new ShapeLinkedList();

        // Create and add different shapes to the linked list
        Square square1 = new Square("Square 1", 5.0);
        Square square2 = new Square("Square 2", 7.0);
        Rectangle rectangle1 = new Rectangle("Rectangle 1", 8.0, 6.0);
        Triangle triangle1 = new Triangle("Triangle 1", 4.0, 5.0);

        shapeList.insert(square1);
        shapeList.insert(square2);
        shapeList.insert(rectangle1);
        shapeList.insert(triangle1);

        shapeList.display();
    }
}
