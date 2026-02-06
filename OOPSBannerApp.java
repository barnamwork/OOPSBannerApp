import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 *
 * UC8: Renders "OOPS" banner using HashMap for
 * character pattern storage and a rendering function.
 *
 * @author Barnam
 * @version 8.0
 */
public class OOPSBannerApp {

    /* ================= Utility Static Methods ================= */

    /**
     * Builds and returns a map of character patterns.
     *
     * @return Map of character to its banner pattern
     */
    private static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "********",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "********"
        });

        patternMap.put('P', new String[]{
                "********",
                "*      *",
                "*      *",
                "********",
                "*       ",
                "*       ",
                "*       "
        });

        patternMap.put('S', new String[]{
                "********",
                "*       ",
                "*       ",
                "********",
                "       *",
                "       *",
                "********"
        });

        return patternMap;
    }

    /**
     * Renders a banner message using stored character patterns.
     *
     * @param message    the word to render
     * @param patternMap map containing character patterns
     */
    private static void renderBanner(String message,
                                     Map<Character, String[]> patternMap) {

        // Each banner is 7 lines tall
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                lineBuilder.append(pattern[row]).append(" ");
            }

            System.out.println(lineBuilder.toString().trim());
        }
    }

    /* ================= Main Method ================= */

    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> characterPatterns =
                buildCharacterPatternMap();

        renderBanner(message, characterPatterns);
    }
}
