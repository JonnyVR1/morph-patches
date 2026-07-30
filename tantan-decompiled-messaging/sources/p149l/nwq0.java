package p149l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class nwq0 {

    /* JADX INFO: renamed from: a */
    private static Context f140965a;

    /* JADX INFO: renamed from: b */
    private static String f140966b;

    /* JADX INFO: renamed from: a */
    public static int m161878a() {
        try {
            Class<?> clsM161880c = m161880c(null, "miui.os.Build");
            if (clsM161880c.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return clsM161880c.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Context m161879b() {
        return f140965a;
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m161880c(Context context, String str) throws ClassNotFoundException {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z = context != null;
        if (z && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            ilq0.m137040m(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m161881d() {
        try {
            String str = f140966b;
            if (str != null) {
                return str;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (m161878a() <= 0) {
                String strM161885h = m161885h();
                if (TextUtils.isEmpty(strM161885h)) {
                    strM161885h = m161887j();
                    if (TextUtils.isEmpty(strM161885h)) {
                        strM161885h = m161888k();
                        if (TextUtils.isEmpty(strM161885h)) {
                            str2 = jwq0.m143665a("ro.product.brand", "Android") + "_" + str2;
                        }
                    }
                    str2 = strM161885h;
                } else {
                    str2 = strM161885h;
                }
            }
            f140966b = str2;
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m161882e(Context context) {
        f140965a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m161883f() {
        return TextUtils.equals((String) ikq0.m136884g("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m161884g(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m161885h() {
        String strM143665a = jwq0.m143665a("ro.build.version.emui", "");
        f140966b = strM143665a;
        return strM143665a;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m161886i() {
        try {
            return m161880c(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            ilq0.m137025B("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private static String m161887j() {
        String strM143665a = jwq0.m143665a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(strM143665a) && !strM143665a.startsWith("ColorOS_")) {
            f140966b = "ColorOS_".concat(strM143665a);
        }
        return f140966b;
    }

    /* JADX INFO: renamed from: k */
    private static String m161888k() {
        String strM143665a = jwq0.m143665a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(strM143665a) && !strM143665a.startsWith("FuntouchOS_")) {
            f140966b = "FuntouchOS_".concat(strM143665a);
        }
        return f140966b;
    }
}
