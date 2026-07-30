package p006l;

import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.tj */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1311tj {
    /* JADX INFO: renamed from: a */
    public static boolean m24698a(String str) {
        return m24700c(str) && Double.valueOf(str).doubleValue() <= 7.0d && Double.valueOf(str).doubleValue() >= 7.0d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m24699b() {
        return SharedLibraryLoader.k().q("b_account");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24700c(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$").matcher(str).matches();
    }
}
