public class C_LoopAndString {
    /**
     * <p>Returns true if the string contains two consecutive character of
     * specified type.</p>
     *
     * <p>Example: "abbc" has two consecutive 'b'</p>
     *
     * @param s the given string
     * @param ch the given character
     * @return whether the string contains at least one consecutive pair of
     * the given character
     */
    public static boolean containsDoubleChar(String s, char ch) {
        for (int i=0 ; i<s.length()-1 ; i++ ){
            if ((int)s.charAt(i) ==(int)ch){
                if ((int) s.charAt(i+1) ==(int) ch){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * <p>Implement Caesar cipher encryption algorithm (tag: cryptography)
     * Google it for more information</p>
     * <p>Only encrypt alphabetical characters:
     * <b>"ab c" shift=3 => "de f"</b></p>
     *
     * @param s text
     * @param offset shift amount
     */
    public static String caesarEncrypt(String s, int offset) {

            int ascOfch
                    ;
            StringBuilder output = new StringBuilder();

            char changed;

            for (int i = 0; i < s.length(); i++) {
                ascOfch = s.charAt(i);

                if (ascOfch == 44) {
                    output.append(",");
                } else if (ascOfch == 32) {
                    output.append(" ");
                } else if (ascOfch == 46) {
                    output.append(".");
                } else if (ascOfch >= 97) {
                    ascOfch += offset;
                    while (ascOfch > 122) {
                        ascOfch -= 26;
                    }
                    while (ascOfch < 97) {
                        ascOfch += 26;
                    }
                    changed = (char) ascOfch;
                    output.append(changed);
                } else {
                    if (ascOfch <= 90) {
                        ascOfch += offset;
                        while (ascOfch > 90) {
                            ascOfch -= 26;
                        }
                        while (ascOfch < 65) {
                            ascOfch += 26;
                        }
                        changed = (char) ascOfch;
                        output.append(changed);
                    }
                }

            }
            return output.toString();
        }

    /**
     * <p>Implement Caesar cipher decryption algorithm (tag: cryptography)</p>
     * Google it for more information.</p>
     * <p>Ignore space: <b>"de f" shift=3 => "ab c"</b></p>
     * <p>You can use encryption method here.</p>
     *
     * @param s text
     * @param c shift amount
     */
    public static String caesarDecrypt(String s, int c) {

            int ascOfch;
            StringBuilder output = new StringBuilder();
            char chanGed;
            for (int i = 0; i < s.length(); i++) {


                ascOfch = s.charAt(i);

                if (ascOfch == 44) {
                    output.append(",");
                } else if (ascOfch == 32) {
                    output.append(" ");
                } else if (ascOfch == 46) {
                    output.append(".");
                } else if (ascOfch >= 97) {
                    ascOfch -= c;
                    while (ascOfch > 122) {
                        ascOfch -= 26;
                    }
                    while (ascOfch < 97) {
                        ascOfch += 26;
                    }
                    chanGed = (char) ascOfch;
                    output.append(chanGed);
                } else {
                    if (ascOfch <= 90) {
                        ascOfch -= c;
                        while (ascOfch > 90) {
                            ascOfch -= 26;
                        }
                        while (ascOfch < 65) {
                            ascOfch += 26;
                        }
                        chanGed = (char) ascOfch;
                        output.append(chanGed);
                    }
                }
            }
            return output.toString();
        }

    /*
    If you have implemented all the previous parts completely and correctly
    feel free and add other methods as much as you want. Each extra method
    can add up to 5 points.

    Each method must come with its own unit-test.
     */
}
