package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class b11 {
    /* JADX INFO: renamed from: a */
    public static boolean m99800a(CharSequence charSequence, CharSequence charSequence2) {
        int iM99801b;
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
            if (cCharAt != cCharAt2 && ((iM99801b = m99801b(cCharAt)) >= 26 || iM99801b != m99801b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m99801b(char c) {
        return (char) ((c | ' ') - 97);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m99802c(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99803d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: e */
    public static String m99804e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m99803d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m99803d(c)) {
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

    /* JADX INFO: renamed from: f */
    public static char m99805f(char c) {
        return m99802c(c) ? (char) (c ^ ' ') : c;
    }

    /* JADX INFO: renamed from: g */
    public static String m99806g(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m99802c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m99802c(c)) {
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
}
