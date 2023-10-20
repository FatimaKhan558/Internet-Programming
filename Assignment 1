import java.time.LocalDateTime;

class Square {
    private double sideLength;
    private LocalDateTime creationDateTime;

    // Parameterized Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.creationDateTime = LocalDateTime.now();
    }

    // Non-Parameterized Constructor
    public Square() {
        this.sideLength = 1.0; // Default side length
        this.creationDateTime = LocalDateTime.now();
    }

    // Getter for sideLength
    public double getSideLength() {
        return sideLength;
    }

    // Setter for sideLength
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to calculate area of the square
    public double getArea() {
        return sideLength * sideLength;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + ", area=" + getArea() + ", creationDateTime=" + creationDateTime + "]";
    }
}

class Node {
    Square data;
    Node next;

    public Node(Square square) {
        this.data = square;
        this.next = null;
    }
}

class SquareLinkedList {
    private Node head;

    public SquareLinkedList() {
        head = null;
    }

    public void insert(Square square) {
        Node newNode = new Node(square);
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
        SquareLinkedList squareList = new SquareLinkedList();

        Square square1 = new Square(5.0);
        Square square2 = new Square(7.0);
        Square square3 = new Square(); // Default side length

        squareList.insert(square1);
        squareList.insert(square2);
        squareList.insert(square3);

        squareList.display();
    }
}
