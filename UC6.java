public class UC6 {
    public static void main(String[] args) {
        // Check whether arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Iterate through args using an enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Check length to avoid errors, then remove trailing comma and space
            if (nameBuilder.length() > 0) {
                String formattedNames = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello, " + formattedNames + "!");
            }
        }
    }
}