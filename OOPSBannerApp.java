/**
 * OOPSBannerApp
 *
 * UC7: Renders "OOPS" banner using a CharacterPatternMap
 * inner static class to encapsulate character patterns.
 *
 * @author Barnam
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Static Inner Class to encapsulate a character
     * and its corresponding banner pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character the character (O, P, S)
         * @param pattern   the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern.
         *
         * @return String array representing banner lines
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /* ================= Utility Static Methods ================= */

    /**
     * Returns all supported character patterns.
     *
     * @return array of CharacterPatternMap objects
     */
    private static CharacterPatternMap[] getCharacterPatterns() {
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', new String[]{
                        "********",
                        "*      *",
                        "*      *",
                        "*      *",
                        "*      *",
                        "*      *",
                        "********"
                }),
                new CharacterPatternMap('P', new String[]{
                        "********",
                        "*      *",
                        "*      *",
                        "********",
                        "*       ",
                        "*       ",
                        "*       "
                }),
                new CharacterPatternMap('S', new String[]{
                        "********",
                        "*       ",
                        "*       ",
                        "********",
                        "       *",
                        "       *",
                        "********"
                })
        };
    }

    /**
     * Retrieves the banner pattern for a given character.
     *
     * @param ch character to lookup
     * @return banner pattern for the character
     */
    private static String[] getPatternForCharacter(char ch) {
        for (CharacterPatternMap map : getCharacterPatterns()) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    /* ================= Main Method ================= */

    public static void main(String[] args) {

        String word = "OOPS";
        String[] bannerLines = new String[7];

        // Initialize StringBuilder for each banner row
        StringBuilder[] builders = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            builders[i] = new StringBuilder();
        }

        // Build banner row by row
        for (char ch : word.toCharArray()) {
            String[] pattern = getPatternForCharacter(ch);

            for (int i = 0; i < 7; i++) {
                builders[i].append(pattern[i]).append(" ");
            }
        }

        // Convert StringBuilders to final banner lines
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = builders[i].toString().trim();
        }

        // Print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
