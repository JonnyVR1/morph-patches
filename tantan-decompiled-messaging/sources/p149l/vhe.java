package p149l;

import com.p046p1.mobile.putong.core.data.PaymentOrderStatus;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class vhe {

    /* JADX INFO: renamed from: a */
    private static String f181496a;

    /* JADX INFO: renamed from: b */
    private static String f181497b;

    /* JADX INFO: renamed from: c */
    private static String f181498c;

    /* JADX INFO: renamed from: d */
    private static String f181499d;

    /* JADX INFO: renamed from: a */
    public static boolean m198442a(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!m198442a(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: b */
    public static File m198443b(whe wheVar) {
        return new File(m198452k(), wheVar.m203126b() + "_apply");
    }

    /* JADX INFO: renamed from: c */
    public static File m198444c(whe wheVar) {
        return new File(m198455n(), wheVar.m203126b());
    }

    /* JADX INFO: renamed from: d */
    public static File m198445d(whe wheVar) {
        return new File(m198452k(), wheVar.m203126b() + "_tmp");
    }

    /* JADX INFO: renamed from: e */
    public static File m198446e(whe wheVar) {
        return yhe.m214810m(wheVar.m203128d()) ? m198444c(wheVar) : m198451j(wheVar);
    }

    /* JADX INFO: renamed from: f */
    public static String m198447f() {
        if (f181496a == null) {
            f181496a = ivc0.f115118g.getDir("mm_source", 0).getAbsolutePath();
        }
        return f181496a;
    }

    /* JADX INFO: renamed from: g */
    public static String m198448g() {
        File externalFilesDir = ivc0.f115118g.getExternalFilesDir("cvcenter");
        if (externalFilesDir == null) {
            externalFilesDir = new File(ivc0.f115118g.getFilesDir(), "cvcenter");
        }
        return externalFilesDir.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m198449h() {
        if (f181499d == null) {
            File file = new File(m198448g(), ".mm_sdk_source");
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            if (!file.isDirectory()) {
                return file.getAbsolutePath();
            }
            f181499d = file.getAbsolutePath();
        }
        return f181499d;
    }

    /* JADX INFO: renamed from: i */
    public static File m198450i(whe wheVar) {
        return new File(m198449h(), wheVar.m203126b());
    }

    /* JADX INFO: renamed from: j */
    public static File m198451j(whe wheVar) {
        return new File(m198447f(), wheVar.m203126b());
    }

    /* JADX INFO: renamed from: k */
    private static String m198452k() {
        if (f181497b == null) {
            File file = new File(m198447f(), PaymentOrderStatus.processing);
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            f181497b = file.getAbsolutePath();
        }
        return f181497b;
    }

    /* JADX INFO: renamed from: l */
    public static File m198453l() {
        return new File(m198452k());
    }

    /* JADX INFO: renamed from: m */
    public static File m198454m(whe wheVar) {
        return new File(m198452k(), wheVar.m203126b());
    }

    /* JADX INFO: renamed from: n */
    private static String m198455n() {
        if (f181498c == null) {
            File file = new File(m198447f(), "zip");
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            f181498c = file.getAbsolutePath();
        }
        return f181498c;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m198456o(whe wheVar) {
        File fileM198451j = m198451j(wheVar);
        return fileM198451j.exists() && fileM198451j.length() > 0;
    }
}
