package p149l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class dwq0 {

    /* JADX INFO: renamed from: a */
    private static String f88201a;

    /* JADX INFO: renamed from: b */
    private static File f88202b;

    /* JADX INFO: renamed from: c */
    private static File f88203c;

    /* JADX INFO: renamed from: A */
    public static File m113901A(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "logcat.txt");
    }

    /* JADX INFO: renamed from: B */
    public static File m113902B(Context context) {
        return new File(m113905E(context), "apmlite/alogCrash");
    }

    /* JADX INFO: renamed from: C */
    public static File m113903C(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "fds.txt");
    }

    /* JADX INFO: renamed from: D */
    public static File m113904D(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "threads.txt");
    }

    /* JADX INFO: renamed from: E */
    public static String m113905E(Context context) {
        if (TextUtils.isEmpty(f88201a)) {
            try {
                f88201a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f88201a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f88201a;
    }

    /* JADX INFO: renamed from: F */
    public static File m113906F(Context context) {
        return new File(m113905E(context) + "/apmlite/CustomFile/" + hrq0.m132699h());
    }

    /* JADX INFO: renamed from: G */
    public static File m113907G(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "meminfo.txt");
    }

    /* JADX INFO: renamed from: H */
    public static File m113908H(Context context) {
        return new File(m113905E(context), "apmlite/CustomFile");
    }

    /* JADX INFO: renamed from: I */
    public static File m113909I(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "pthreads.txt");
    }

    /* JADX INFO: renamed from: J */
    public static File m113910J(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "rountines.txt");
    }

    /* JADX INFO: renamed from: K */
    public static File m113911K(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "leakd_threads.txt");
    }

    /* JADX INFO: renamed from: L */
    public static File m113912L(File file) {
        return new File(file, "abortmsg.txt");
    }

    /* JADX INFO: renamed from: a */
    public static File m113913a() {
        File file = f88202b;
        return file == null ? m113927o(hrq0.m132700i()) : file;
    }

    /* JADX INFO: renamed from: b */
    public static File m113914b(Context context) {
        return new File(m113905E(context), "apmlite/CrashLogJava");
    }

    /* JADX INFO: renamed from: c */
    public static File m113915c(Context context, String str) {
        return new File(m113905E(context) + "/apmlite/CrashCommonLog/" + str);
    }

    /* JADX INFO: renamed from: d */
    public static File m113916d(File file) {
        return new File(file, "flog.txt");
    }

    /* JADX INFO: renamed from: e */
    public static File m113917e(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* JADX INFO: renamed from: f */
    public static File m113918f(String str) {
        return new File(m113915c(hrq0.m132700i(), str), "fds.txt");
    }

    /* JADX INFO: renamed from: g */
    public static File m113919g(Context context) {
        return new File(m113905E(context), "apmlite/CrashLogSimple");
    }

    /* JADX INFO: renamed from: h */
    public static File m113920h(Context context, String str) {
        return new File(m113905E(context) + "/apmlite/CustomFile/" + str);
    }

    /* JADX INFO: renamed from: i */
    public static File m113921i(File file) {
        return new File(file, "tombstone.txt");
    }

    /* JADX INFO: renamed from: j */
    public static File m113922j(String str) {
        return new File(m113915c(hrq0.m132700i(), str), "threads.txt");
    }

    /* JADX INFO: renamed from: k */
    public static String m113923k() {
        return "anr_" + hrq0.m132698g();
    }

    /* JADX INFO: renamed from: l */
    public static File m113924l(Context context) {
        return new File(m113905E(context), "apmlite/RuntimeContext");
    }

    /* JADX INFO: renamed from: m */
    public static File m113925m(File file) {
        return new File(file, "header.bin");
    }

    /* JADX INFO: renamed from: n */
    public static File m113926n(String str) {
        return new File(m113915c(hrq0.m132700i(), str), "meminfo.txt");
    }

    /* JADX INFO: renamed from: o */
    public static File m113927o(Context context) {
        if (f88202b == null) {
            if (context == null) {
                context = hrq0.m132700i();
            }
            f88202b = new File(m113905E(context), "apmlite/CrashLogNative");
        }
        return f88202b;
    }

    /* JADX INFO: renamed from: p */
    public static File m113928p(File file) {
        return new File(m113915c(hrq0.m132700i(), file.getName()), "maps.txt");
    }

    /* JADX INFO: renamed from: q */
    public static File m113929q(String str) {
        return new File(m113915c(hrq0.m132700i(), str), "pthreads.txt");
    }

    /* JADX INFO: renamed from: r */
    public static File m113930r(Context context) {
        if (f88203c == null) {
            f88203c = new File(m113905E(context) + "/apmlite/CrashCommonLog/" + hrq0.m132699h());
        }
        return f88203c;
    }

    /* JADX INFO: renamed from: s */
    public static File m113931s(File file) {
        return new File(file, "callback.json");
    }

    /* JADX INFO: renamed from: t */
    public static File m113932t(String str) {
        return new File(m113915c(hrq0.m132700i(), str), "rountines.txt");
    }

    /* JADX INFO: renamed from: u */
    public static File m113933u(Context context) {
        return new File(m113905E(context), "apmlite/CrashCommonLog");
    }

    /* JADX INFO: renamed from: v */
    public static File m113934v(File file) {
        return new File(file, "upload.json");
    }

    /* JADX INFO: renamed from: w */
    public static File m113935w(String str) {
        return new File(m113915c(hrq0.m132700i(), str), "leakd_threads.txt");
    }

    /* JADX INFO: renamed from: x */
    public static File m113936x(Context context) {
        return new File(m113905E(context), "apmlite/issueCrashTimes");
    }

    /* JADX INFO: renamed from: y */
    public static File m113937y(File file) {
        return new File(file, "javastack.txt");
    }

    /* JADX INFO: renamed from: z */
    public static File m113938z(Context context) {
        return new File(m113905E(context) + "/apmlite/issueCrashTimes/current.times");
    }
}
