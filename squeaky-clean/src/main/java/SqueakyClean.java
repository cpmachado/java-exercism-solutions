class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder res = new StringBuilder();
        char prev = ' ';
        for (char c : identifier.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                res.append('_');
            } else {
                switch (c) {
                    case '0':
                        c = 'o';
                        break;
                    case '1':
                        c = 'l';
                        break;
                    case '3':
                        c = 'e';
                        break;
                    case '4':
                        c = 'a';
                        break;
                    case '7':
                        c = 't';
                        break;
                    default:
                        break;
                }
                if (Character.isLetter(c)) {
                    if (prev == '-') {
                        c = Character.toUpperCase(c);
                    }
                    res.append(c);
                }


            }
            prev = c;
        }
        return res.toString();
    }
}
