package p153l;

import com.p051p1.mobile.putong.core.data.PaymentOrderStatus;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class zie {

    /* JADX INFO: renamed from: a */
    private static String f204504a;

    /* JADX INFO: renamed from: b */
    private static String f204505b;

    /* JADX INFO: renamed from: c */
    private static String f204506c;

    /* JADX INFO: renamed from: d */
    private static String f204507d;

    /* JADX INFO: renamed from: a */
    public static boolean m219728a(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!m219728a(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: b */
    public static File m219729b(aje ajeVar) {
        return new File(m219738k(), ajeVar.m98367b() + "_apply");
    }

    /* JADX INFO: renamed from: c */
    public static File m219730c(aje ajeVar) {
        return new File(m219741n(), ajeVar.m98367b());
    }

    /* JADX INFO: renamed from: d */
    public static File m219731d(aje ajeVar) {
        return new File(m219738k(), ajeVar.m98367b() + "_tmp");
    }

    /* JADX INFO: renamed from: e */
    public static File m219732e(aje ajeVar) {
        return cje.m110125m(ajeVar.m98369d()) ? m219730c(ajeVar) : m219737j(ajeVar);
    }

    /* JADX INFO: renamed from: f */
    public static String m219733f() {
        if (f204504a == null) {
            f204504a = l3d0.f129865g.getDir("mm_source", 0).getAbsolutePath();
        }
        return f204504a;
    }

    /* JADX INFO: renamed from: g */
    public static String m219734g() {
        File externalFilesDir = l3d0.f129865g.getExternalFilesDir("cvcenter");
        if (externalFilesDir == null) {
            externalFilesDir = new File(l3d0.f129865g.getFilesDir(), "cvcenter");
        }
        return externalFilesDir.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m219735h() {
        if (f204507d == null) {
            File file = new File(m219734g(), ".mm_sdk_source");
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            if (!file.isDirectory()) {
                return file.getAbsolutePath();
            }
            f204507d = file.getAbsolutePath();
        }
        return f204507d;
    }

    /* JADX INFO: renamed from: i */
    public static File m219736i(aje ajeVar) {
        return new File(m219735h(), ajeVar.m98367b());
    }

    /* JADX INFO: renamed from: j */
    public static File m219737j(aje ajeVar) {
        return new File(m219733f(), ajeVar.m98367b());
    }

    /* JADX INFO: renamed from: k */
    private static String m219738k() {
        if (f204505b == null) {
            File file = new File(m219733f(), PaymentOrderStatus.processing);
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            f204505b = file.getAbsolutePath();
        }
        return f204505b;
    }

    /* JADX INFO: renamed from: l */
    public static File m219739l() {
        return new File(m219738k());
    }

    /* JADX INFO: renamed from: m */
    public static File m219740m(aje ajeVar) {
        return new File(m219738k(), ajeVar.m98367b());
    }

    /* JADX INFO: renamed from: n */
    private static String m219741n() {
        if (f204506c == null) {
            File file = new File(m219733f(), "zip");
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            f204506c = file.getAbsolutePath();
        }
        return f204506c;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m219742o(aje ajeVar) {
        File fileM219737j = m219737j(ajeVar);
        return fileM219737j.exists() && fileM219737j.length() > 0;
    }
}
