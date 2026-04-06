public class UC7 {
    public static void main(String[] args) {
        // Check whether arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use String.join() to efficiently concatenate all names with a comma-space delimiter
            System.out.println("Hello, " + String.join(", ", args) + "!");
        }
    }
}