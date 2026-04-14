import java.io.*;
import java.util.Scanner;

public class File {

    static String replaceString(String source, String target, String replacement) {
        if (source == null || target.isEmpty()) {
            return "0";
        }

        if (!source.contains(target)) {
            return "0"; // seat not found or already booked
        }

        return source.replace(target, replacement);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Seats.txt"));

        StringBuilder str = new StringBuilder();
        int ch;

        while ((ch = reader.read()) != -1) {
            str.append((char) ch);
        }

        reader.close();

        System.out.println("Current Seats:\n" + str);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seat number you want to book: ");
        String seatNumber = sc.nextLine();

        String replaced = replaceString(str.toString(), seatNumber, "XX");

        if (replaced.equals("0")) {
            System.out.println("Seat not available or already booked!");
        } else {
            // overwrite file instead of append
            FileWriter fw = new FileWriter("Seats.txt");
            fw.write(replaced);
            fw.close();

            System.out.println("Seat booked successfully!");
            System.out.println("Updated Seats:\n" + replaced);
        }

        sc.close();
    }
}