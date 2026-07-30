package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class f6g0 {
    /* JADX INFO: renamed from: a */
    public static String m124270a() {
        String strM124271b = m124271b();
        return strM124271b != null ? strM124271b.concat("tantan.apk") : strM124271b;
    }

    /* JADX INFO: renamed from: b */
    public static String m124271b() {
        return m124273d("download_apk");
    }

    /* JADX INFO: renamed from: c */
    public static String m124272c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(oki.m168026n() ? CoreModule.f18263b.getExternalCacheDir().getAbsolutePath() : CoreModule.f18263b.getCacheDir().getAbsolutePath());
        String str2 = File.separator;
        stringBuffer.append(str2);
        stringBuffer.append(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m124273d(String str) {
        Exception e;
        String strM124272c;
        if (str == null) {
            return null;
        }
        try {
            strM124272c = m124272c(str);
            try {
                File file = new File(strM124272c);
                if (file.exists() || file.mkdirs()) {
                    return strM124272c;
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                CrashHelper.m82479c(new Exception("StorageUtil getFolderPath exception:" + e.getMessage(), e));
                return strM124272c;
            }
        } catch (Exception e3) {
            e = e3;
            strM124272c = null;
        }
    }
}
