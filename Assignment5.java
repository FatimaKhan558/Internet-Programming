class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String message) {
        super(message);
    }
}

class MyClass {
    public void myfunc(int x) throws MySpecialNumberException {
        if (x == 10) {
            throw new MySpecialNumberException("Special number 10 detected");
        } else if (x == 20) {
            throw new MySpecialNumberException("Special number 20 detected");
        } else if (x == 30) {
            throw new MySpecialNumberException("Special number 30 detected");
        }
        // Rest of your code here
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int x = 20; // Change the value to test different cases

        try {
            myClass.myfunc(x);
        } catch (MySpecialNumberException e) {
            System.err.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }
}
