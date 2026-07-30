package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class wnw0 {
    /* JADX INFO: renamed from: a */
    public static String m207228a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m207232e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m207232e(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static String m207229b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m207231d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m207231d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m207230c(CharSequence charSequence, CharSequence charSequence2) {
        int iM207233f;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iM207233f = m207233f(cCharAt)) >= 26 || iM207233f != m207233f(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m207231d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* JADX INFO: renamed from: e */
    public static boolean m207232e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: f */
    public static int m207233f(char c) {
        return (char) ((c | ' ') - 97);
    }
}
