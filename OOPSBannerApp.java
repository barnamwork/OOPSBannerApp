/**
 * OOPSBannerApp
 *
 * UC6: Prints "OOPS" as a banner by refactoring
 * character patterns into reusable helper methods.
 *
 * @author Barnam
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Get patterns for each character
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Create banner lines by composing character patterns
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]
            );
        }

        // Print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    private static String[] getOPattern() {
        return new String[]{
                "********",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "********"
        };
    }

    // Helper method for letter P
    private static String[] getPPattern() {
        return new String[]{
                "********",
                "*      *",
                "*      *",
                "********",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Helper method for letter S
    private static String[] getSPattern() {
        return new String[]{
                "********",
                "*       ",
                "*       ",
                "********",
                "       *",
                "       *",
                "********"
        };
    }
}
