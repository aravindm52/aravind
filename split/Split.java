public class Main {
    public static void main(String[] args) {
        String text = "apple,banana,orange";
        String[] fruits = text.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
