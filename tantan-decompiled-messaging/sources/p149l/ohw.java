package p149l;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.log.Log4Android;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ohw {

    /* JADX INFO: renamed from: a */
    private static String f144054a = null;

    /* JADX INFO: renamed from: b */
    private static String f144055b = null;

    /* JADX INFO: renamed from: c */
    private static String f144056c = "mk";

    /* JADX INFO: renamed from: d */
    private static String f144057d = "offline";

    /* JADX INFO: renamed from: e */
    private static String f144058e = "backup";

    /* JADX INFO: renamed from: f */
    private static String f144059f = "download";

    /* JADX INFO: renamed from: g */
    private static String f144060g = "mkstorage";

    /* JADX INFO: renamed from: h */
    private static String f144061h = "log.mk";

    /* JADX INFO: renamed from: i */
    private static String f144062i = "snapshot";

    /* JADX INFO: renamed from: j */
    private static String f144063j = "cache";

    /* JADX INFO: renamed from: k */
    private static String f144064k = "cache/image";

    /* JADX INFO: renamed from: l */
    private static String f144065l = "mksnapshot";

    /* JADX INFO: renamed from: m */
    public static String f144066m = "unzip_tmp_";

    /* JADX INFO: renamed from: n */
    private static String f144067n = null;

    /* JADX INFO: renamed from: o */
    private static String f144068o = "camera";

    /* JADX INFO: renamed from: p */
    private static String f144069p = "mulog";

    /* JADX INFO: renamed from: a */
    public static boolean m164463a(File file) {
        try {
            File file2 = new File(file, ".nomedia");
            if (file2.exists()) {
                return true;
            }
            file2.createNewFile();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m164464b() {
        File fileM164470h = m164470h();
        if (fileM164470h == null) {
            return null;
        }
        return fileM164470h.getParentFile();
    }

    /* JADX INFO: renamed from: c */
    public static File m164465c() {
        File fileM164466d = m164466d(f144063j);
        m164463a(fileM164466d);
        return fileM164466d;
    }

    /* JADX INFO: renamed from: d */
    private static File m164466d(String str) {
        try {
            m164478p();
            File file = new File(f144054a, str);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static File m164467e(Context context) {
        String str = TextUtils.isEmpty(f144067n) ? f144060g : f144067n;
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
                e.printStackTrace();
            }
        }
        return m164466d(str);
    }

    /* JADX INFO: renamed from: f */
    public static File m164468f(Context context, String str, String str2) {
        File fileM164467e = m164467e(context);
        if (fileM164467e == null) {
            return null;
        }
        File file = new File(fileM164467e, str);
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, str2);
    }

    /* JADX INFO: renamed from: g */
    public static File m164469g() {
        return new File(m164475m(), f144061h);
    }

    /* JADX INFO: renamed from: h */
    public static File m164470h() {
        try {
            m164478p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return new File(f144054a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static File m164471i() {
        File fileM164466d = m164466d(f144065l);
        m164463a(fileM164466d);
        return fileM164466d;
    }

    /* JADX INFO: renamed from: j */
    public static File m164472j() {
        try {
            m164478p();
            File file = new File(f144069p);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static File m164473k() throws IOException {
        return m164466d(f144058e);
    }

    /* JADX INFO: renamed from: l */
    public static File m164474l() {
        return m164466d(f144059f);
    }

    /* JADX INFO: renamed from: m */
    public static File m164475m() {
        File fileM164466d = m164466d(f144057d);
        if (fileM164466d != null && fileM164466d.exists()) {
            m164463a(fileM164466d);
        }
        return fileM164466d;
    }

    /* JADX INFO: renamed from: n */
    public static File m164476n() {
        File fileM164466d = m164466d(f144062i);
        m164463a(fileM164466d);
        return fileM164466d;
    }

    /* JADX INFO: renamed from: o */
    public static File m164477o() {
        File fileM164466d = m164466d(f144064k);
        m164463a(fileM164466d);
        return fileM164466d;
    }

    /* JADX INFO: renamed from: p */
    private static synchronized void m164478p() throws Exception {
        try {
            String absolutePath = f144055b;
            if (TextUtils.isEmpty(f144054a)) {
                try {
                    if (TextUtils.isEmpty(absolutePath)) {
                        m164480r(absolutePath);
                        absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    }
                    f144054a = absolutePath + f144056c;
                    if (absolutePath.endsWith("/")) {
                        f144068o = absolutePath + f144068o;
                        f144069p = absolutePath + f144069p;
                    } else {
                        f144054a = absolutePath + "/" + f144056c;
                        f144068o = absolutePath + "/" + f144068o;
                        f144069p = absolutePath + "/" + f144069p;
                    }
                    File file = new File(f144054a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    m164479q(absolutePath);
                } catch (Exception e) {
                    f144054a = null;
                    throw e;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m164479q(String str) {
        MDLog.m7389d("MKFileConfigs", " \nsdcard root: " + str + "\nmkHomePath: " + f144054a + "\nmkHomeDir: " + f144056c + "\nappCameraDir: " + f144068o + "\nappMuLogDir: " + f144069p + SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: r */
    private static void m164480r(String str) {
        try {
            MDLog.m7391e("MKFileConfigs", "logNoSDCardPath=" + str);
            qnw.m175704a("tantan").m128649e("mk_path").m128650f(str).m128645a(onw.m165233c(System.currentTimeMillis())).m128645a(onw.m165231a(String.valueOf(igj0.m136050a()))).m128646b(onw.m165240j(Log.getStackTraceString(new Exception()))).m128647c();
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKFileConfigs", th);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m164481s(String str) {
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("相册目录不能为空");
        } else {
            f144068o = str;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m164482t(String str) {
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("根目录不能为空");
        } else {
            f144056c = str;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m164483u(String str) {
        f144067n = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m164484v(String str) {
        f144055b = str;
        MDLog.m7391e("MKFileConfigs", "setMkSdcardPath=" + str);
        f144054a = null;
    }
}
