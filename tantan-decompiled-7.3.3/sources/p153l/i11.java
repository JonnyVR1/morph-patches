package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class i11 {
    /* JADX INFO: renamed from: a */
    public static boolean m138047a(CharSequence charSequence, CharSequence charSequence2) {
        int iM138048b;
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
            if (cCharAt != cCharAt2 && ((iM138048b = m138048b(cCharAt)) >= 26 || iM138048b != m138048b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m138048b(char c) {
        return (char) ((c | ' ') - 97);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m138049c(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* JADX INFO: renamed from: d */
    public static boolean m138050d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: e */
    public static String m138051e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m138050d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m138050d(c)) {
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
    public static char m138052f(char c) {
        return m138049c(c) ? (char) (c ^ ' ') : c;
    }

    /* JADX INFO: renamed from: g */
    public static String m138053g(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m138049c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m138049c(c)) {
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
