public class UC5 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder namesList = new StringBuilder();

            int count = 0;
            for (String name : args) {
                namesList.append(name);

                count++;
                if (count < args.length) {
                    namesList.append(", ");
                }
            }

            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}