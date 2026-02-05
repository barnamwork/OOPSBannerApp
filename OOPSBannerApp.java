/**
 * OOPSBannerApp
 *
 * UC4: Prints "OOPS" as a banner using a String array
 * and a loop for better modularity and reusability.
 *
 * @author Barnam
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create a String array to store banner lines
        String[] bannerLines = new String[7];

        // Populate the array using String.join()
        bannerLines[0] = String.join(" ",
                "********", "********", "********", "********");

        bannerLines[1] = String.join(" ",
                "*      *", "*      *", "*      *", "*       ");

        bannerLines[2] = String.join(" ",
                "*      *", "*      *", "*      *", "*       ");

        bannerLines[3] = String.join(" ",
                "*      *", "*      *", "********", "********");

        bannerLines[4] = String.join(" ",
                "*      *", "*      *", "*       ", "       *");

        bannerLines[5] = String.join(" ",
                "*      *", "*      *", "*       ", "       *");

        bannerLines[6] = String.join(" ",
                "********", "********", "*       ", "********");

        // Print the banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
