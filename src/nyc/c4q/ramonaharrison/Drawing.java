package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Drawing.java
 */
public class Drawing {

    private static final String[] lines = {
            "  |",
            "\n \\",
            "0",
            "/",
            "\n  |",
            "\n/",
            " \\"
    };

    public Drawing() {
    }

    public static String get(int misses) {
        String drawing = "";
        for (int i = 0; i <= misses; i++) {
            drawing += lines[i];
        }
        return drawing;
    }
}