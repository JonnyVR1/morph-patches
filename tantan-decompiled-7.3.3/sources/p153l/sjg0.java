package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class sjg0 {
    /* JADX INFO: renamed from: a */
    public static String m186097a(String str) {
        Character.UnicodeBlock unicodeBlockOf;
        char[] charArray = str.toCharArray();
        char[] cArrCopyOf = charArray.length <= 255 ? charArray : Arrays.copyOf(charArray, 255);
        if (charArray.length > 255) {
            for (int i = 252; i < 255; i++) {
                cArrCopyOf[i] = '.';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : cArrCopyOf) {
            if (Character.isISOControl(c) || (unicodeBlockOf = Character.UnicodeBlock.of(c)) == null || unicodeBlockOf == Character.UnicodeBlock.SPECIALS) {
                sb.append('?');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
