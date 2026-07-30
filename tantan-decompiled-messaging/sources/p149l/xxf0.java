package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class xxf0 {
    /* JADX INFO: renamed from: a */
    public static String m211477a() {
        String strM211478b = m211478b();
        return strM211478b != null ? strM211478b.concat("tantan.apk") : strM211478b;
    }

    /* JADX INFO: renamed from: b */
    public static String m211478b() {
        return m211480d("download_apk");
    }

    /* JADX INFO: renamed from: c */
    public static String m211479c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(rhi.m179370n() ? CoreModule.f17544b.getExternalCacheDir().getAbsolutePath() : CoreModule.f17544b.getCacheDir().getAbsolutePath());
        String str2 = File.separator;
        stringBuffer.append(str2);
        stringBuffer.append(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m211480d(String str) {
        Exception e;
        String strM211479c;
        if (str == null) {
            return null;
        }
        try {
            strM211479c = m211479c(str);
            try {
                File file = new File(strM211479c);
                if (file.exists() || file.mkdirs()) {
                    return strM211479c;
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                CrashHelper.m81296c(new Exception("StorageUtil getFolderPath exception:" + e.getMessage(), e));
                return strM211479c;
            }
        } catch (Exception e3) {
            e = e3;
            strM211479c = null;
        }
    }
}
