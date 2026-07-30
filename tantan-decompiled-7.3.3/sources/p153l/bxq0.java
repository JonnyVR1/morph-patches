package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.C15023q;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class bxq0 {

    /* JADX INFO: renamed from: a */
    private static final List<String> f78903a = Arrays.asList("001", "002", "003", "004", "005");

    /* JADX INFO: renamed from: b */
    private static Boolean f78904b = null;

    /* JADX INFO: renamed from: a */
    public static void m106900a(String str) {
        m106901b("Push-ConnectionQualityStatsHelper", str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m106902c(Context context) {
        if (f78904b == null) {
            try {
                if (!l4r0.m152825j(context)) {
                    f78904b = Boolean.FALSE;
                }
                String strM87938a = C15023q.m87938a(context);
                if (TextUtils.isEmpty(strM87938a) || strM87938a.length() < 3) {
                    f78904b = Boolean.FALSE;
                } else {
                    f78904b = Boolean.valueOf(f78903a.contains(strM87938a.substring(strM87938a.length() - 3)));
                }
                m106900a("Sampling statistical connection quality: " + f78904b);
            } catch (Throwable th) {
                f78904b = Boolean.FALSE;
                ouq0.m169377A("Push-ConnectionQualityStatsHelper", "Determine sampling switch error: " + th);
            }
        }
        return f78904b.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static void m106901b(String str, String str2) {
    }
}
