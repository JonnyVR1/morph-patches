package p153l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class ive0 {

    /* JADX INFO: renamed from: a */
    public static int f117051a = 273;

    /* JADX INFO: renamed from: b */
    public static String f117052b;

    /* JADX INFO: renamed from: c */
    public static String f117053c;

    /* JADX INFO: renamed from: a */
    public static boolean m142287a(String str) throws Throwable {
        String str2 = f117052b;
        if (str2 != null) {
            return str2.equals(str);
        }
        String strM142289c = m142289c("ro.miui.ui.version.name");
        f117053c = strM142289c;
        if (TextUtils.isEmpty(strM142289c)) {
            String strM142289c2 = m142289c("ro.build.version.emui");
            f117053c = strM142289c2;
            if (TextUtils.isEmpty(strM142289c2)) {
                String strM142289c3 = m142289c("ro.build.version.opporom");
                f117053c = strM142289c3;
                if (TextUtils.isEmpty(strM142289c3)) {
                    String strM142289c4 = m142289c("ro.vivo.os.version");
                    f117053c = strM142289c4;
                    if (TextUtils.isEmpty(strM142289c4)) {
                        String str3 = Build.DISPLAY;
                        f117053c = str3;
                        if (str3.toUpperCase().contains(RomUtil.ROM_FLYME)) {
                            f117052b = RomUtil.ROM_FLYME;
                        } else {
                            f117053c = "unknown";
                            f117052b = Build.MANUFACTURER.toUpperCase();
                        }
                    } else {
                        f117052b = RomUtil.ROM_VIVO;
                    }
                } else {
                    f117052b = RomUtil.ROM_OPPO;
                }
            } else {
                f117052b = RomUtil.ROM_EMUI;
            }
        } else {
            f117052b = RomUtil.ROM_MIUI;
        }
        return f117052b.equals(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m142288b() throws Throwable {
        if (f117052b == null) {
            m142287a("");
        }
        return f117052b;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static String m142289c(String str) throws Throwable {
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
                        CrashHelper.m82479c(e);
                        return line;
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (!"samsung".equalsIgnoreCase(Build.BRAND) || Build.VERSION.SDK_INT < 29) {
                        CrashHelper.m82480d(e, 50);
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            CrashHelper.m82479c(e3);
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
                        CrashHelper.m82479c(e4);
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
    public static String m142290d() throws Throwable {
        if (f117053c == null) {
            m142287a("");
        }
        return f117053c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m142291e() {
        Locale locale = Locale.getDefault();
        return locale != null && "zh".equals(locale.getLanguage()) && "CN".equals(locale.getCountry());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m142292f() {
        return m142287a(RomUtil.ROM_EMUI);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m142293g() {
        return m142287a(RomUtil.ROM_FLYME);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m142294h(Context context, Intent intent) {
        return (context == null || intent == null || uc60.m195383f(context, intent, 65536).size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m142295i() {
        return "GiONEE".equalsIgnoreCase(Build.BRAND);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m142296j() {
        return m142287a(RomUtil.ROM_MIUI);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m142297k() {
        return "oneplus".equalsIgnoreCase(Build.BRAND);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m142298l() {
        return m142287a(RomUtil.ROM_OPPO);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m142299m() {
        return m142287a(RomUtil.ROM_VIVO);
    }

    /* JADX INFO: renamed from: n */
    public static void m142300n(Activity activity, String str) {
        if (m142301o(activity, str)) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + activity.getPackageName()));
        activity.startActivityForResult(intent, f117051a);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m142301o(Activity activity, String str) {
        if (m142296j()) {
            return m142306t(activity);
        }
        if (m142292f()) {
            return m142303q(activity);
        }
        if (m142293g()) {
            return m142302p(activity, "com.meizu.safe");
        }
        if (m142298l()) {
            return m142305s(activity);
        }
        m142299m();
        if (m142295i()) {
            return m142304r(activity, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m142302p(Activity activity, String str) {
        Intent intentM195381d = uc60.m195381d(activity, str);
        return intentM195381d != null && m142307u(activity, intentM195381d);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m142303q(Activity activity) {
        Intent intent = new Intent();
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        return m142307u(activity, intent);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m142304r(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.permission.PermissionAppDetail"));
        intent.putExtra("packagename", activity.getPackageName());
        intent.putExtra("title", str);
        return m142307u(activity, intent);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m142305s(Activity activity) {
        Intent intentM195381d = uc60.m195381d(activity, "com.oppo.safe");
        if (intentM195381d != null && m142307u(activity, intentM195381d)) {
            return true;
        }
        Intent intentM195381d2 = uc60.m195381d(activity, "com.color.safecenter");
        if (intentM195381d2 != null && m142307u(activity, intentM195381d2)) {
            return true;
        }
        Intent intentM195381d3 = uc60.m195381d(activity, "com.coloros.safecenter");
        return intentM195381d3 != null && m142307u(activity, intentM195381d3);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m142306t(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("miui.intent.action.APP_PERM_EDITOR");
        intent.putExtra("extra_pkgname", activity.getPackageName());
        return m142307u(activity, intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity")) || m142307u(activity, intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity"));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m142307u(Activity activity, Intent intent) {
        if (uc60.m195383f(activity, intent, 65536).size() > 0) {
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            activity.startActivityForResult(intent, f117051a);
            return true;
        }
        if (!kmk0.f127510c) {
            return false;
        }
        Objects.toString(intent);
        return false;
    }
}
