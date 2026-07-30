package p153l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class j5r0 {

    /* JADX INFO: renamed from: a */
    private static String f118495a;

    /* JADX INFO: renamed from: b */
    private static File f118496b;

    /* JADX INFO: renamed from: c */
    private static File f118497c;

    /* JADX INFO: renamed from: A */
    public static File m143553A(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "logcat.txt");
    }

    /* JADX INFO: renamed from: B */
    public static File m143554B(Context context) {
        return new File(m143557E(context), "apmlite/alogCrash");
    }

    /* JADX INFO: renamed from: C */
    public static File m143555C(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "fds.txt");
    }

    /* JADX INFO: renamed from: D */
    public static File m143556D(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "threads.txt");
    }

    /* JADX INFO: renamed from: E */
    public static String m143557E(Context context) {
        if (TextUtils.isEmpty(f118495a)) {
            try {
                f118495a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f118495a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f118495a;
    }

    /* JADX INFO: renamed from: F */
    public static File m143558F(Context context) {
        return new File(m143557E(context) + "/apmlite/CustomFile/" + n0r0.m161021h());
    }

    /* JADX INFO: renamed from: G */
    public static File m143559G(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "meminfo.txt");
    }

    /* JADX INFO: renamed from: H */
    public static File m143560H(Context context) {
        return new File(m143557E(context), "apmlite/CustomFile");
    }

    /* JADX INFO: renamed from: I */
    public static File m143561I(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "pthreads.txt");
    }

    /* JADX INFO: renamed from: J */
    public static File m143562J(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "rountines.txt");
    }

    /* JADX INFO: renamed from: K */
    public static File m143563K(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "leakd_threads.txt");
    }

    /* JADX INFO: renamed from: L */
    public static File m143564L(File file) {
        return new File(file, "abortmsg.txt");
    }

    /* JADX INFO: renamed from: a */
    public static File m143565a() {
        File file = f118496b;
        return file == null ? m143579o(n0r0.m161022i()) : file;
    }

    /* JADX INFO: renamed from: b */
    public static File m143566b(Context context) {
        return new File(m143557E(context), "apmlite/CrashLogJava");
    }

    /* JADX INFO: renamed from: c */
    public static File m143567c(Context context, String str) {
        return new File(m143557E(context) + "/apmlite/CrashCommonLog/" + str);
    }

    /* JADX INFO: renamed from: d */
    public static File m143568d(File file) {
        return new File(file, "flog.txt");
    }

    /* JADX INFO: renamed from: e */
    public static File m143569e(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* JADX INFO: renamed from: f */
    public static File m143570f(String str) {
        return new File(m143567c(n0r0.m161022i(), str), "fds.txt");
    }

    /* JADX INFO: renamed from: g */
    public static File m143571g(Context context) {
        return new File(m143557E(context), "apmlite/CrashLogSimple");
    }

    /* JADX INFO: renamed from: h */
    public static File m143572h(Context context, String str) {
        return new File(m143557E(context) + "/apmlite/CustomFile/" + str);
    }

    /* JADX INFO: renamed from: i */
    public static File m143573i(File file) {
        return new File(file, "tombstone.txt");
    }

    /* JADX INFO: renamed from: j */
    public static File m143574j(String str) {
        return new File(m143567c(n0r0.m161022i(), str), "threads.txt");
    }

    /* JADX INFO: renamed from: k */
    public static String m143575k() {
        return "anr_" + n0r0.m161020g();
    }

    /* JADX INFO: renamed from: l */
    public static File m143576l(Context context) {
        return new File(m143557E(context), "apmlite/RuntimeContext");
    }

    /* JADX INFO: renamed from: m */
    public static File m143577m(File file) {
        return new File(file, "header.bin");
    }

    /* JADX INFO: renamed from: n */
    public static File m143578n(String str) {
        return new File(m143567c(n0r0.m161022i(), str), "meminfo.txt");
    }

    /* JADX INFO: renamed from: o */
    public static File m143579o(Context context) {
        if (f118496b == null) {
            if (context == null) {
                context = n0r0.m161022i();
            }
            f118496b = new File(m143557E(context), "apmlite/CrashLogNative");
        }
        return f118496b;
    }

    /* JADX INFO: renamed from: p */
    public static File m143580p(File file) {
        return new File(m143567c(n0r0.m161022i(), file.getName()), "maps.txt");
    }

    /* JADX INFO: renamed from: q */
    public static File m143581q(String str) {
        return new File(m143567c(n0r0.m161022i(), str), "pthreads.txt");
    }

    /* JADX INFO: renamed from: r */
    public static File m143582r(Context context) {
        if (f118497c == null) {
            f118497c = new File(m143557E(context) + "/apmlite/CrashCommonLog/" + n0r0.m161021h());
        }
        return f118497c;
    }

    /* JADX INFO: renamed from: s */
    public static File m143583s(File file) {
        return new File(file, "callback.json");
    }

    /* JADX INFO: renamed from: t */
    public static File m143584t(String str) {
        return new File(m143567c(n0r0.m161022i(), str), "rountines.txt");
    }

    /* JADX INFO: renamed from: u */
    public static File m143585u(Context context) {
        return new File(m143557E(context), "apmlite/CrashCommonLog");
    }

    /* JADX INFO: renamed from: v */
    public static File m143586v(File file) {
        return new File(file, "upload.json");
    }

    /* JADX INFO: renamed from: w */
    public static File m143587w(String str) {
        return new File(m143567c(n0r0.m161022i(), str), "leakd_threads.txt");
    }

    /* JADX INFO: renamed from: x */
    public static File m143588x(Context context) {
        return new File(m143557E(context), "apmlite/issueCrashTimes");
    }

    /* JADX INFO: renamed from: y */
    public static File m143589y(File file) {
        return new File(file, "javastack.txt");
    }

    /* JADX INFO: renamed from: z */
    public static File m143590z(Context context) {
        return new File(m143557E(context) + "/apmlite/issueCrashTimes/current.times");
    }
}
