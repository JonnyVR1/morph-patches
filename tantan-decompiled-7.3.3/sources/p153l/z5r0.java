package p153l;

import android.os.Build;
import android.text.TextUtils;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class z5r0 {

    /* JADX INFO: renamed from: a */
    private static final CharSequence f203080a = "sony";

    /* JADX INFO: renamed from: b */
    private static final CharSequence f203081b = "amigo";

    /* JADX INFO: renamed from: c */
    private static final CharSequence f203082c = "funtouch";

    /* JADX INFO: renamed from: a */
    public static String m218725a() {
        if (rxq0.m183560f()) {
            return m218735k();
        }
        if (rxq0.m183562h()) {
            return m218737m();
        }
        if (m218738n()) {
            return m218739o();
        }
        String strM218736l = m218736l();
        if (!TextUtils.isEmpty(strM218736l)) {
            return strM218736l;
        }
        if (m218730f()) {
            return m218729e();
        }
        if (m218731g()) {
            return m218732h();
        }
        if (m218728d()) {
            return m218727c();
        }
        String strM218733i = m218733i();
        return !TextUtils.isEmpty(strM218733i) ? strM218733i : Build.DISPLAY;
    }

    /* JADX INFO: renamed from: b */
    private static String m218726b(String str) {
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            Process processExec = Runtime.getRuntime().exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader2.readLine();
                processExec.destroy();
                m4r0.m157051a(bufferedReader2);
                return line;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                m4r0.m157051a(bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m218727c() {
        return m218726b("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m218728d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    /* JADX INFO: renamed from: e */
    public static String m218729e() {
        return m218726b("ro.vivo.os.build.display.id") + "_" + m218726b("ro.vivo.product.version");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m218730f() {
        String strM218726b = m218726b("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strM218726b) && strM218726b.toLowerCase(Locale.getDefault()).contains(f203082c);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m218731g() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains(f203081b);
    }

    /* JADX INFO: renamed from: h */
    public static String m218732h() {
        return Build.DISPLAY + "_" + m218726b("ro.gn.sv.version");
    }

    /* JADX INFO: renamed from: i */
    public static String m218733i() {
        if (!m218734j()) {
            return "";
        }
        return "eui_" + m218726b("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m218734j() {
        return !TextUtils.isEmpty(m218726b("ro.letv.release.version"));
    }

    /* JADX INFO: renamed from: k */
    public static String m218735k() {
        if (!rxq0.m183560f()) {
            return "";
        }
        return "miui_" + m218726b("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: l */
    public static String m218736l() {
        String strM183555a = rxq0.m183555a();
        if (strM183555a == null || !strM183555a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return strM183555a + "_" + Build.DISPLAY;
    }

    /* JADX INFO: renamed from: m */
    public static String m218737m() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m218738n() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains(HardwareEarMonitorUtils.MANUFACTURER_OPPO);
    }

    /* JADX INFO: renamed from: o */
    public static String m218739o() {
        if (!m218738n()) {
            return "";
        }
        return "coloros_" + m218726b("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }
}
