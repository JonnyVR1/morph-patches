package p149l;

import android.text.TextUtils;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class ghg0 {
    /* JADX INFO: renamed from: a */
    public static String m126182a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                sb.append(URLEncoder.encode(cCharAt + ""));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
