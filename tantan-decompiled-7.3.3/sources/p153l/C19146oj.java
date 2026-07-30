package p153l;

import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.oj */
/* JADX INFO: loaded from: classes9.dex */
public class C19146oj {
    /* JADX INFO: renamed from: a */
    public static boolean m167805a(String str) {
        return m167807c(str) && Double.valueOf(str).doubleValue() <= 7.0d && Double.valueOf(str).doubleValue() >= 7.0d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m167806b() {
        return SharedLibraryLoader.m82637k().m82646q("b_account");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m167807c(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$").matcher(str).matches();
    }
}
