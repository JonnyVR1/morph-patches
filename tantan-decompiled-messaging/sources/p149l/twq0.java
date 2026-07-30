package p149l;

import android.os.Build;
import android.text.TextUtils;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class twq0 {

    /* JADX INFO: renamed from: a */
    private static final CharSequence f172417a = "sony";

    /* JADX INFO: renamed from: b */
    private static final CharSequence f172418b = "amigo";

    /* JADX INFO: renamed from: c */
    private static final CharSequence f172419c = "funtouch";

    /* JADX INFO: renamed from: a */
    public static String m190869a() {
        if (loq0.m150793f()) {
            return m190879k();
        }
        if (loq0.m150795h()) {
            return m190881m();
        }
        if (m190882n()) {
            return m190883o();
        }
        String strM190880l = m190880l();
        if (!TextUtils.isEmpty(strM190880l)) {
            return strM190880l;
        }
        if (m190874f()) {
            return m190873e();
        }
        if (m190875g()) {
            return m190876h();
        }
        if (m190872d()) {
            return m190871c();
        }
        String strM190877i = m190877i();
        return !TextUtils.isEmpty(strM190877i) ? strM190877i : Build.DISPLAY;
    }

    /* JADX INFO: renamed from: b */
    private static String m190870b(String str) {
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            Process processExec = Runtime.getRuntime().exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader2.readLine();
                processExec.destroy();
                gvq0.m128290a(bufferedReader2);
                return line;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                gvq0.m128290a(bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m190871c() {
        return m190870b("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m190872d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    /* JADX INFO: renamed from: e */
    public static String m190873e() {
        return m190870b("ro.vivo.os.build.display.id") + "_" + m190870b("ro.vivo.product.version");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m190874f() {
        String strM190870b = m190870b("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strM190870b) && strM190870b.toLowerCase(Locale.getDefault()).contains(f172419c);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m190875g() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains(f172418b);
    }

    /* JADX INFO: renamed from: h */
    public static String m190876h() {
        return Build.DISPLAY + "_" + m190870b("ro.gn.sv.version");
    }

    /* JADX INFO: renamed from: i */
    public static String m190877i() {
        if (!m190878j()) {
            return "";
        }
        return "eui_" + m190870b("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m190878j() {
        return !TextUtils.isEmpty(m190870b("ro.letv.release.version"));
    }

    /* JADX INFO: renamed from: k */
    public static String m190879k() {
        if (!loq0.m150793f()) {
            return "";
        }
        return "miui_" + m190870b("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: l */
    public static String m190880l() {
        String strM150788a = loq0.m150788a();
        if (strM150788a == null || !strM150788a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return strM150788a + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: m */
    public static String m190881m() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m190882n() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains(HardwareEarMonitorUtils.MANUFACTURER_OPPO);
    }

    /* JADX INFO: renamed from: o */
    public static String m190883o() {
        if (!m190882n()) {
            return "";
        }
        return "coloros_" + m190870b("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }
}
