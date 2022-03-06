class TwelveDays {

    private static final String NUMBERS[] = {
            "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };

    private static final String VERSE_SUBSTRINGS[] = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };


    String verse(int verseNumber) {
        StringBuilder verseString = new StringBuilder("On the " + NUMBERS[verseNumber - 1] + " day of Christmas my true love gave to me: ");
        if (verseNumber == 1) {
            return verseString + VERSE_SUBSTRINGS[verseNumber - 1] + ".\n";
        }
        String connector = ", ";
        for (int i = verseNumber - 1; i >= 0; i--) {
            if (i == 0) {
                connector = ", and ";
            }
            if (i == verseNumber - 1) {
                verseString.append(VERSE_SUBSTRINGS[i]);
                continue;
            }
            verseString.append(connector).append(VERSE_SUBSTRINGS[i]);

        }
        return verseString + ".\n";
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder output = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            output.append(this.verse(i));
            if (i != endVerse) {
                output.append('\n');
            }
        }
        return output.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
