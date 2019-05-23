package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    String getString(String msg) {
        System.out.println(msg);
        return this.scanner.nextLine();
    }

    public boolean yesNo(String msg) {
        String input = this.getString(msg);
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public boolean yesNo() {
        String input = this.getString("Type yes/no: ");
        return input.equals("yes") || input.equals("y");
    }

    public int getInt(int min, int max) {
        int num = this.getInt();
        if (num >= min && num <= max) {
            return num;
        } else {
            System.out.println("Error outside of the boundaries");
            return this.getInt(min, max);
        }
    }

    public int getInt() {
        return Integer.parseInt(this.getString("Give me a number: "));
    }

    public double getDouble() {
        return Double.parseDouble(this.getString("Give me a decimal: "));
    }

    public static void main(String[] args) {
        Input input = new Input();
        input.getString("Potatoes can be able companions.");
    }
}
