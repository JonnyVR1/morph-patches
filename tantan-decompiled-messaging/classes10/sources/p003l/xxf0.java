package p003l;

import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xxf0 {
    /* JADX INFO: renamed from: a */
    public static String m10994a() {
        String strM10995b = m10995b();
        return strM10995b != null ? strM10995b.concat("tantan.apk") : strM10995b;
    }

    /* JADX INFO: renamed from: b */
    public static String m10995b() {
        return m10997d("download_apk");
    }

    /* JADX INFO: renamed from: c */
    public static String m10996c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(rhi.n() ? CoreModule.b.getExternalCacheDir().getAbsolutePath() : CoreModule.b.getCacheDir().getAbsolutePath());
        String str2 = File.separator;
        stringBuffer.append(str2);
        stringBuffer.append(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m10997d(String str) {
        Exception e;
        String strM10996c;
        if (str == null) {
            return null;
        }
        try {
            strM10996c = m10996c(str);
            try {
                File file = new File(strM10996c);
                if (file.exists() || file.mkdirs()) {
                    return strM10996c;
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                CrashHelper.c(new Exception("StorageUtil getFolderPath exception:" + e.getMessage(), e));
                return strM10996c;
            }
        } catch (Exception e3) {
            e = e3;
            strM10996c = null;
        }
    }
}
