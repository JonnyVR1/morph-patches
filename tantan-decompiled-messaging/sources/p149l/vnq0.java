package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.C14875q;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vnq0 {

    /* JADX INFO: renamed from: a */
    private static final List<String> f182268a = Arrays.asList("001", "002", "003", "004", "005");

    /* JADX INFO: renamed from: b */
    private static Boolean f182269b = null;

    /* JADX INFO: renamed from: a */
    public static void m199049a(String str) {
        m199050b("Push-ConnectionQualityStatsHelper", str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m199051c(Context context) {
        if (f182269b == null) {
            try {
                if (!fvq0.m123356j(context)) {
                    f182269b = Boolean.FALSE;
                }
                String strM86767a = C14875q.m86767a(context);
                if (TextUtils.isEmpty(strM86767a) || strM86767a.length() < 3) {
                    f182269b = Boolean.FALSE;
                } else {
                    f182269b = Boolean.valueOf(f182268a.contains(strM86767a.substring(strM86767a.length() - 3)));
                }
                m199049a("Sampling statistical connection quality: " + f182269b);
            } catch (Throwable th) {
                f182269b = Boolean.FALSE;
                ilq0.m137024A("Push-ConnectionQualityStatsHelper", "Determine sampling switch error: " + th);
            }
        }
        return f182269b.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static void m199050b(String str, String str2) {
    }
}
