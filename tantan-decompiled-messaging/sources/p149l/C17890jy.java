package p149l;

import com.p046p1.mobile.putong.data.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.jy */
/* JADX INFO: loaded from: classes9.dex */
public class C17890jy extends i0g0 {
    /* JADX INFO: renamed from: n0 */
    public static String m143836n0(double d) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date((long) d));
    }

    /* JADX INFO: renamed from: o0 */
    public static String m143837o0(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String strValueOf = String.valueOf(str.charAt(i));
            if (User.NAME_PATTERN().matcher(strValueOf).matches()) {
                sb.append(strValueOf);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p0 */
    public static String m143838p0(String str) {
        if (str.length() <= 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        int iMin = Math.min(str.length() - 4, 4);
        for (int i = 0; i < iMin; i++) {
            sb2.append("*");
        }
        return sb.replace(Math.max(0, str.length() - 8), str.length() - 4, sb2.toString()).toString();
    }
}
