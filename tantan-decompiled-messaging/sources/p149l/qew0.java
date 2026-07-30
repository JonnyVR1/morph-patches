package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class qew0 {
    /* JADX INFO: renamed from: a */
    public static String m174257a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m174261e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m174261e(c)) {
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
    public static String m174258b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m174260d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m174260d(c)) {
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
    public static boolean m174259c(CharSequence charSequence, CharSequence charSequence2) {
        int iM174262f;
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
            if (cCharAt != cCharAt2 && ((iM174262f = m174262f(cCharAt)) >= 26 || iM174262f != m174262f(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m174260d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* JADX INFO: renamed from: e */
    public static boolean m174261e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: f */
    public static int m174262f(char c) {
        return (char) ((c | ' ') - 97);
    }
}
