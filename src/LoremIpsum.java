//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class LoremIpsum {
    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
    private String[] loremIpsumWords = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.".split("\\s");

    public LoremIpsum() {
    }

    public String getWords() {
        return this.getWords(50);
    }

    public String getWords(int amount) {
        return this.getWords(amount, 0);
    }

    public String getWords(int amount, int startIndex) {
        if (startIndex >= 0 && startIndex <= 49) {
            int word = startIndex;
            StringBuilder lorem = new StringBuilder();

            for(int i = 0; i < amount; ++i) {
                if (word == 50) {
                    word = 0;
                }

                lorem.append(this.loremIpsumWords[word]);
                if (i < amount - 1) {
                    lorem.append(' ');
                }

                ++word;
            }

            return lorem.toString();
        } else {
            throw new IndexOutOfBoundsException("startIndex must be >= 0 and < 50");
        }
    }

    public String getParagraphs() {
        return this.getParagraphs(2);
    }

    public String getParagraphs(int amount) {
        StringBuilder lorem = new StringBuilder();

        for(int i = 0; i < amount; ++i) {
            lorem.append("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
            if (i < amount - 1) {
                lorem.append("\n\n");
            }
        }

        return lorem.toString();
    }
}
