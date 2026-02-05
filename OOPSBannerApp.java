/**
 * OOPSBannerApp
 *
 * UC5: Prints "OOPS" as a banner using inline
 * String array initialization with String.join().
 *
 * @author Barnam
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration and initialization of banner lines
        String[] bannerLines = {
                String.join(" ", "********", "********", "********", "********"),
                String.join(" ", "*      *", "*      *", "*      *", "*       "),
                String.join(" ", "*      *", "*      *", "*      *", "*       "),
                String.join(" ", "*      *", "*      *", "********", "********"),
                String.join(" ", "*      *", "*      *", "*       ", "       *"),
                String.join(" ", "*      *", "*      *", "*       ", "       *"),
                String.join(" ", "********", "********", "*       ", "********")
        };

        // Print banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
