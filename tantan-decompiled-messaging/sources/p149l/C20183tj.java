package p149l;

import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.tj */
/* JADX INFO: loaded from: classes9.dex */
public class C20183tj {
    /* JADX INFO: renamed from: a */
    public static boolean m189233a(String str) {
        return m189235c(str) && Double.valueOf(str).doubleValue() <= 7.0d && Double.valueOf(str).doubleValue() >= 7.0d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m189234b() {
        return SharedLibraryLoader.m81454k().m81463q("b_account");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m189235c(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$").matcher(str).matches();
    }
}
