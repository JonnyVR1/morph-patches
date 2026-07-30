package p153l;

import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class kuq0 {

    /* JADX INFO: renamed from: a */
    private static long f128916a = -30000;

    /* JADX INFO: renamed from: b */
    private static File f128917b;

    /* JADX INFO: renamed from: a */
    public static String m151619a(long j, String str) {
        try {
            return r3r0.m179699y(new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m151620b() {
        File file = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                r3r0.m179692r(new File(file, list[i]));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m151621c(long j) throws Throwable {
        if (j - f128916a < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return;
        }
        f128916a = j;
        try {
            r3r0.m179684j(m151622d(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private static File m151622d() {
        if (f128917b == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f128917b = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + "/" + n0r0.m161021h());
        }
        return f128917b;
    }
}
