package p153l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class t5r0 {

    /* JADX INFO: renamed from: a */
    private static Context f172225a;

    /* JADX INFO: renamed from: b */
    private static String f172226b;

    /* JADX INFO: renamed from: a */
    public static int m189417a() {
        try {
            Class<?> clsM189419c = m189419c(null, "miui.os.Build");
            if (clsM189419c.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return clsM189419c.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Context m189418b() {
        return f172225a;
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m189419c(Context context, String str) throws ClassNotFoundException {
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
            ouq0.m169393m(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m189420d() {
        try {
            String str = f172226b;
            if (str != null) {
                return str;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (m189417a() <= 0) {
                String strM189424h = m189424h();
                if (TextUtils.isEmpty(strM189424h)) {
                    strM189424h = m189426j();
                    if (TextUtils.isEmpty(strM189424h)) {
                        strM189424h = m189427k();
                        if (TextUtils.isEmpty(strM189424h)) {
                            str2 = p5r0.m170679a("ro.product.brand", "Android") + "_" + str2;
                        }
                    }
                    str2 = strM189424h;
                } else {
                    str2 = strM189424h;
                }
            }
            f172226b = str2;
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m189421e(Context context) {
        f172225a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m189422f() {
        return TextUtils.equals((String) otq0.m169169g("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m189423g(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m189424h() {
        String strM170679a = p5r0.m170679a("ro.build.version.emui", "");
        f172226b = strM170679a;
        return strM170679a;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m189425i() {
        try {
            return m189419c(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            ouq0.m169378B("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private static String m189426j() {
        String strM170679a = p5r0.m170679a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(strM170679a) && !strM170679a.startsWith("ColorOS_")) {
            f172226b = "ColorOS_".concat(strM170679a);
        }
        return f172226b;
    }

    /* JADX INFO: renamed from: k */
    private static String m189427k() {
        String strM170679a = p5r0.m170679a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(strM170679a) && !strM170679a.startsWith("FuntouchOS_")) {
            f172226b = "FuntouchOS_".concat(strM170679a);
        }
        return f172226b;
    }
}
