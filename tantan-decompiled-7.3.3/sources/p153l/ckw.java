package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class ckw {

    /* JADX INFO: renamed from: a */
    private static String f82317a = null;

    /* JADX INFO: renamed from: b */
    private static String f82318b = null;

    /* JADX INFO: renamed from: c */
    private static String f82319c = "mk";

    /* JADX INFO: renamed from: d */
    private static String f82320d = "offline";

    /* JADX INFO: renamed from: e */
    private static String f82321e = "mkstorage";

    /* JADX INFO: renamed from: f */
    private static String f82322f = "log.mk";

    /* JADX INFO: renamed from: g */
    private static String f82323g = "snapshot";

    /* JADX INFO: renamed from: h */
    private static String f82324h = "cache/image";

    /* JADX INFO: renamed from: i */
    private static String f82325i = "mksnapshot";

    /* JADX INFO: renamed from: a */
    public static boolean m110392a(File file) {
        try {
            File file2 = new File(file, ".nomedia");
            if (file2.exists()) {
                return true;
            }
            file2.createNewFile();
            return true;
        } catch (Throwable th) {
            Log.e("MKFileConfigs", "", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m110393b() {
        File fileM110398g = m110398g();
        if (fileM110398g == null) {
            return null;
        }
        return fileM110398g.getParentFile();
    }

    /* JADX INFO: renamed from: c */
    private static File m110394c(String str) {
        try {
            m110403l();
            File file = new File(f82317a, str);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        } catch (Exception e) {
            Log.e("MKFileConfigs", "", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m110395d(Context context) {
        String str = f82321e;
        if (context != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getFilesDir().getAbsolutePath());
                String str2 = File.separator;
                sb.append(str2);
                sb.append(str);
                sb.append(str2);
                File file = new File(sb.toString());
                if (!file.exists()) {
                    file.mkdir();
                }
                if (file.exists()) {
                    return file;
                }
            } catch (Exception e) {
                Log.e("MKFileConfigs", "", e);
            }
        }
        return m110394c(str);
    }

    /* JADX INFO: renamed from: e */
    public static File m110396e(Context context, String str, String str2) {
        File fileM110395d = m110395d(context);
        if (fileM110395d == null) {
            return null;
        }
        File file = new File(fileM110395d, str);
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, str2);
    }

    /* JADX INFO: renamed from: f */
    public static File m110397f() {
        return new File(m110400i(), f82322f);
    }

    /* JADX INFO: renamed from: g */
    public static File m110398g() {
        try {
            m110403l();
        } catch (Exception e) {
            Log.e("MKFileConfigs", "", e);
        }
        try {
            return new File(f82317a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static File m110399h() {
        File fileM110394c = m110394c(f82325i);
        m110392a(fileM110394c);
        return fileM110394c;
    }

    /* JADX INFO: renamed from: i */
    public static File m110400i() {
        File fileM110394c = m110394c(f82320d);
        if (fileM110394c != null && fileM110394c.exists()) {
            m110392a(fileM110394c);
        }
        return fileM110394c;
    }

    /* JADX INFO: renamed from: j */
    public static File m110401j() {
        File fileM110394c = m110394c(f82323g);
        m110392a(fileM110394c);
        return fileM110394c;
    }

    /* JADX INFO: renamed from: k */
    public static File m110402k() {
        File fileM110394c = m110394c(f82324h);
        m110392a(fileM110394c);
        return fileM110394c;
    }

    /* JADX INFO: renamed from: l */
    private static synchronized void m110403l() throws Exception {
        try {
            String absolutePath = f82318b;
            if (TextUtils.isEmpty(f82317a)) {
                try {
                    if (TextUtils.isEmpty(absolutePath)) {
                        absolutePath = new File(lv0.m155971a().getFilesDir(), "MOMOCARD").getAbsolutePath();
                    }
                    f82317a = absolutePath + f82319c;
                    if (!absolutePath.endsWith("/")) {
                        f82317a = absolutePath + "/" + f82319c;
                    }
                    File file = new File(f82317a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    m110404m(absolutePath);
                } catch (Exception e) {
                    f82317a = null;
                    throw e;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m110405n() {
        f82317a = null;
    }

    /* JADX INFO: renamed from: o */
    public static void m110406o(String str) {
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("根目录不能为空");
        } else {
            f82319c = str;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m110407p(String str) {
        f82318b = str;
        Log.e("MKFileConfigs", "setMkSdcardPath=" + str);
        m110405n();
    }

    /* JADX INFO: renamed from: m */
    private static void m110404m(String str) {
    }
}
