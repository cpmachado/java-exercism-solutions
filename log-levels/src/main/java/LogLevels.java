public class LogLevels {

    public static String message(String logLine) {
        int beginIndex = logLine.indexOf(' ') + 1;
        return logLine.substring(beginIndex).trim();
    }

    public static String logLevel(String logLine) {
        int beginIndex = logLine.indexOf('[') + 1;
        int endIndex = logLine.indexOf(']');
        return logLine.substring(beginIndex, endIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
