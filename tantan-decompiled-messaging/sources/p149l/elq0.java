package p149l;

import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class elq0 {

    /* JADX INFO: renamed from: a */
    private static long f92136a = -30000;

    /* JADX INFO: renamed from: b */
    private static File f92137b;

    /* JADX INFO: renamed from: a */
    public static String m117151a(long j, String str) {
        try {
            return luq0.m151811y(new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m117152b() {
        File file = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                luq0.m151804r(new File(file, list[i]));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m117153c(long j) throws Throwable {
        if (j - f92136a < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return;
        }
        f92136a = j;
        try {
            luq0.m151796j(m117154d(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private static File m117154d() {
        if (f92137b == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f92137b = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + "/" + hrq0.m132699h());
        }
        return f92137b;
    }
}
