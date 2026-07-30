package p149l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class bne0 {

    /* JADX INFO: renamed from: a */
    public static int f76394a = 273;

    /* JADX INFO: renamed from: b */
    public static String f76395b;

    /* JADX INFO: renamed from: c */
    public static String f76396c;

    /* JADX INFO: renamed from: a */
    public static boolean m102772a(String str) throws Throwable {
        String str2 = f76395b;
        if (str2 != null) {
            return str2.equals(str);
        }
        String strM102774c = m102774c("ro.miui.ui.version.name");
        f76396c = strM102774c;
        if (TextUtils.isEmpty(strM102774c)) {
            String strM102774c2 = m102774c("ro.build.version.emui");
            f76396c = strM102774c2;
            if (TextUtils.isEmpty(strM102774c2)) {
                String strM102774c3 = m102774c("ro.build.version.opporom");
                f76396c = strM102774c3;
                if (TextUtils.isEmpty(strM102774c3)) {
                    String strM102774c4 = m102774c("ro.vivo.os.version");
                    f76396c = strM102774c4;
                    if (TextUtils.isEmpty(strM102774c4)) {
                        String str3 = Build.DISPLAY;
                        f76396c = str3;
                        if (str3.toUpperCase().contains(RomUtil.ROM_FLYME)) {
                            f76395b = RomUtil.ROM_FLYME;
                        } else {
                            f76396c = "unknown";
                            f76395b = Build.MANUFACTURER.toUpperCase();
                        }
                    } else {
                        f76395b = RomUtil.ROM_VIVO;
                    }
                } else {
                    f76395b = RomUtil.ROM_OPPO;
                }
            } else {
                f76395b = RomUtil.ROM_EMUI;
            }
        } else {
            f76395b = RomUtil.ROM_MIUI;
        }
        return f76395b.equals(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m102773b() throws Throwable {
        if (f76395b == null) {
            m102772a("");
        }
        return f76395b;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static String m102774c(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                        return line;
                    } catch (IOException e) {
                        CrashHelper.m81296c(e);
                        return line;
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (!"samsung".equalsIgnoreCase(Build.BRAND) || Build.VERSION.SDK_INT < 29) {
                        CrashHelper.m81297d(e, 50);
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            CrashHelper.m81296c(e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                        CrashHelper.m81296c(e4);
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m102775d() throws Throwable {
        if (f76396c == null) {
            m102772a("");
        }
        return f76396c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m102776e() {
        Locale locale = Locale.getDefault();
        return locale != null && "zh".equals(locale.getLanguage()) && "CN".equals(locale.getCountry());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m102777f() {
        return m102772a(RomUtil.ROM_EMUI);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m102778g() {
        return m102772a(RomUtil.ROM_FLYME);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m102779h(Context context, Intent intent) {
        return (context == null || intent == null || o460.m162553f(context, intent, 65536).size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m102780i() {
        return "GiONEE".equalsIgnoreCase(Build.BRAND);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m102781j() {
        return m102772a(RomUtil.ROM_MIUI);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m102782k() {
        return "oneplus".equalsIgnoreCase(Build.BRAND);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m102783l() {
        return m102772a(RomUtil.ROM_OPPO);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m102784m() {
        return m102772a(RomUtil.ROM_VIVO);
    }

    /* JADX INFO: renamed from: n */
    public static void m102785n(Activity activity, String str) {
        if (m102786o(activity, str)) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + activity.getPackageName()));
        activity.startActivityForResult(intent, f76394a);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m102786o(Activity activity, String str) {
        if (m102781j()) {
            return m102791t(activity);
        }
        if (m102777f()) {
            return m102788q(activity);
        }
        if (m102778g()) {
            return m102787p(activity, "com.meizu.safe");
        }
        if (m102783l()) {
            return m102790s(activity);
        }
        m102784m();
        if (m102780i()) {
            return m102789r(activity, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m102787p(Activity activity, String str) {
        Intent intentM162551d = o460.m162551d(activity, str);
        return intentM162551d != null && m102792u(activity, intentM162551d);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m102788q(Activity activity) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        return m102792u(activity, intent);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m102789r(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.permission.PermissionAppDetail"));
        intent.putExtra("packagename", activity.getPackageName());
        intent.putExtra("title", str);
        return m102792u(activity, intent);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m102790s(Activity activity) {
        Intent intentM162551d = o460.m162551d(activity, "com.oppo.safe");
        if (intentM162551d != null && m102792u(activity, intentM162551d)) {
            return true;
        }
        Intent intentM162551d2 = o460.m162551d(activity, "com.color.safecenter");
        if (intentM162551d2 != null && m102792u(activity, intentM162551d2)) {
            return true;
        }
        Intent intentM162551d3 = o460.m162551d(activity, "com.coloros.safecenter");
        return intentM162551d3 != null && m102792u(activity, intentM162551d3);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m102791t(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("miui.intent.action.APP_PERM_EDITOR");
        intent.putExtra("extra_pkgname", activity.getPackageName());
        return m102792u(activity, intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity")) || m102792u(activity, intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m102792u(Activity activity, Intent intent) {
        if (o460.m162553f(activity, intent, 65536).size() > 0) {
            intent.setFlags(268435456);
            activity.startActivityForResult(intent, f76394a);
            return true;
        }
        if (!edk0.f90613c) {
            return false;
        }
        Objects.toString(intent);
        return false;
    }
}
