public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
    }

    // Lazy initialization of the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Use the Singleton instance
        // Do something with the singleton...

        System.out.println("Code executed");
    }
}
