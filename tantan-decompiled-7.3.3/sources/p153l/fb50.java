package p153l;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class fb50 {
    /* JADX INFO: renamed from: a */
    public static boolean m124883a(String str, String str2) {
        return str2 != null && str2.length() > 0 && Pattern.matches(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m124884b(String str) {
        if (!str.matches("^[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}([0-9Xx])$")) {
            return false;
        }
        int[] iArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] charArray = str.toCharArray();
        int i = 0;
        for (int i2 = 0; i2 < 17; i2++) {
            i += Integer.parseInt(String.valueOf(charArray[i2])) * iArr[i2];
        }
        char c = charArray[17];
        return ((c == 'X' || c == 'x') ? i + 10 : i + Integer.parseInt(String.valueOf(c))) % 11 == 1;
    }
}
