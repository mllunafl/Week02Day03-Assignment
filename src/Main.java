public class Main {

    public static void main(String[] args) {
        String original = "Java developers are the coolest people";
        System.out.println("this is the original string: " + original);
        if (original.contains("Java developers")) {
            System.out.println("SUCCESS: does contains");
        } else {
            System.out.println("ERROR: contains should");
        }
        if (original.contains("XYZ")) {
            System.out.println("ERROR: should not contains");
        } else {
            System.out.println("SUCCESS: does not cotains");
        }

        if (original.endsWith("people")) {
            System.out.println("SUCCESS: does endsWith");
        } else {
            System.out.println("ERROR: shouldn't endsWith");
        }
        if (original.endsWith("Java")) {
            System.out.println("ERROR: should not endsWith");
        } else {
            System.out.println("SUCCESS: does not endsWith");
        }

        String ignoreCase = "java Developers ARE THE Coolest People";

        if (original.equalsIgnoreCase(ignoreCase)) {
            System.out.println("SUCCESS: should equalsIgnoreCase");
        } else {
            System.out.println("ERROR: should equalsIgnoreCase");
        }
        if (original.equalsIgnoreCase("java Developers ARE THE Coolest People")) {
            System.out.println("SUCCESS: should equal");
        } else {
            System.out.println("ERROR: should equal");
        }
        if (original.equalsIgnoreCase("java")) {
            System.out.println("ERROR: should not equalsIgnoreCase");
        } else {
            System.out.println("SUCCESS: should not equalsIgnoreCase");
        }

        if (original.lastIndexOf("Java") == 0) {
            System.out.println("SUCCESS: should lastIndexOf");
        } else {
            System.out.println("ERROR: should not lastIndexof");
        }
        if (original.lastIndexOf("Hello") != 0) {
            System.out.println("SUCCESS: lastIndexof false");
        } else {
            System.out.println("ERROR: should lastIndexof false");
        }

        String notOriginal = original.replace('J', 'K');
        System.out.println("this replaced J with K: " + notOriginal);
        String notOriginal2 = original.replace('X', 'K');
        System.out.println("this tried to replace X with K, there is no X: " + notOriginal2);
        if (notOriginal != original) {
            System.out.println("SUCCESS: should not be equal");
        } else {
            System.out.println("ERROR: should not be equal");
        }
        if (notOriginal == original) {
            System.out.println("ERROR: should not be equal");
        } else {
            System.out.println("SUCCESS: should not be equal");
        }
        if (notOriginal2 != original) {
            System.out.println("ERROR: should be equal");
        } else {
            System.out.println("SUCCESS: should be equal");
        }
        if (notOriginal2 == original) {
            System.out.println("SUCCESS: should be equal");
        } else {
            System.out.println("ERROR: should be equal");
        }

        String uppperCase = "JAVA DEVELOPERS ARE THE COOLEST ARE THE COOLEST";
        System.out.println("this is uppercase: " + uppperCase);
        String lowerCase = uppperCase.toLowerCase();
        System.out.println("this is lowercase: " + lowerCase);
        if (lowerCase == uppperCase) {
            System.out.println("ERROR: should not be equal");
        } else {
            System.out.println("SUCCESS: should not be equal");
        }
        if (lowerCase != uppperCase) {
            System.out.println("SUCCESS: should not be equal");
        } else {
            System.out.println("ERROR: should not be equal");
        }

        String literalSpan = "This is a very long sentence " +
                "and it should span multiple lines as opposed of " +
                "just going on forever and ever and ever and ever on t" +
                "he same line";
        System.out.println(literalSpan);


        if (isBlank("") == true) {
            System.out.println("SUCCESS is empty");
        } else {
            System.out.println("ERROR is empty");
        }
        if (isBlank(" ") == true) {
            System.out.println("ERROR is blank");
        } else {
            System.out.println("SUCCESS is blank");
        }
        if (isBlank(null) == true) {
            System.out.println("SUCCESS is null");
        } else {
            System.out.println("ERROR is null");
        }
        if (isBlank(original) == true) {
            System.out.println("ERROR is not blank, empty, or null");
        } else {
            System.out.println("SUCCESS is not blank, empty, or null");
        }
        System.out.println();
        System.out.println("Begins Methods Assignment");
        Varargs.setThings();
        Varargs.setThings("Jen");
        Varargs.setThings("Jack ", "Jill ");

    }

    public static boolean isBlank(String string) {
        if (string == null)
            return true;
        for (int i = 0; i < string.length(); ++i) {
            if (!Character.isWhitespace(string.indexOf(i))) {
                return false;
            }
        }
        return true;
    }
}

