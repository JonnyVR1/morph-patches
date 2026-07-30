package p153l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public final class v350 {
    /* JADX INFO: renamed from: a */
    public static boolean m199187a() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{113, 53, 100, 100})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{113, 53, 100, 100}));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m199188b() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{114, 42, 112, 116, 42, 53, 120, 39, 99, 124})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{114, 42, 112, 116, 42, 53, 120, 39, 99, 124}));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m199189c(Context context) {
        try {
            context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69}), 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m199190d() {
        return m199204r(qmw.m177151a(new byte[]{66, 9, 31, 88, 5, 11, 30, 11, 80, 89, 20, 0, 81, 5, 69, 66, 19, 3, 66}), "").equalsIgnoreCase(qmw.m177151a(new byte[]{96, 52, 120, 109, 36}));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m199191e() {
        return !TextUtils.isEmpty(m199204r(qmw.m177151a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 65, 4, 20, 67, 15, 94, 89, 79, 3, 93, 19, 88}), ""));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m199192f() {
        return !TextUtils.isEmpty(m199204r(qmw.m177151a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 81, 19, 3, 85, 11, 84, 25, HttpTokens.CARRIAGE_RETURN, 7, 82, 3, 93}), ""));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m199193g() {
        if (Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{120, 51, 112, 96, 36, 47}))) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase(qmw.m177151a(new byte[]{120, 51, 112, 96, 36, 47})) || str.equalsIgnoreCase(qmw.m177151a(new byte[]{120, 41, 127, 120, 51}));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m199194h() {
        if (Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{124, 35, 127, 120, 55, 41}))) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase(qmw.m177151a(new byte[]{124, 35, 127, 120, 55, 41})) || str.equalsIgnoreCase(qmw.m177151a(new byte[]{106, 51, 122}));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m199195i() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{125, 35, 120, 109, 52})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{125, 35, 120, 109, 52})) || Build.DISPLAY.toUpperCase().contains(qmw.m177151a(new byte[]{118, 42, 104, 122, 36}));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m199196j() {
        return !TextUtils.isEmpty(m199204r(qmw.m177151a(new byte[]{66, 9, 31, 90, 8, 19, 89, 72, 68, 94, 79, Tnaf.POW_2_WIDTH, 85, 20, 66, 94, 14, 8, 30, 8, 80, 90, 4}), ""));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m199197k() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{125, 41, 101, 120, 45, 41, 98, 39})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{125, 41, 101, 120, 45, 41, 98, 39}));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m199198l() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{126, 51, 115, 126, HttpTokens.SPACE})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{126, 51, 115, 126, HttpTokens.SPACE}));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m199199m() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{127, 40, 116, 103, 45, 51, 99})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{127, 40, 116, 103, 45, 51, 99}));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m199200n() {
        if (Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{127, 54, 97, 120}))) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase(qmw.m177151a(new byte[]{127, 54, 97, 120})) || str.equalsIgnoreCase(qmw.m177151a(new byte[]{98, 35, 112, 123, 44, 35})) || !TextUtils.isEmpty(m199204r(qmw.m177151a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 65, 4, 20, 67, 15, 94, 89, 79, 9, 64, 22, 94, 69, 14, 11}), ""));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m199201o() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{99, 39, 124, 100, 52, 40, 119})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{99, 39, 124, 100, 52, 40, 119}));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m199202p() {
        return Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{102, 47, 103, 120})) || Build.BRAND.equalsIgnoreCase(qmw.m177151a(new byte[]{102, 47, 103, 120})) || !TextUtils.isEmpty(m199204r(qmw.m177151a(new byte[]{66, 9, 31, 65, 8, Tnaf.POW_2_WIDTH, 95, 72, 94, 68, 79, Tnaf.POW_2_WIDTH, 85, 20, 66, 94, 14, 8}), ""));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m199203q() {
        if (Build.MANUFACTURER.equalsIgnoreCase(qmw.m177151a(new byte[]{104, 47, 112, 120, 44, 47}))) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase(qmw.m177151a(new byte[]{104, 47, 112, 120, 44, 47})) || str.equalsIgnoreCase(qmw.m177151a(new byte[]{98, 35, 117, 122, 40}));
    }

    /* JADX INFO: renamed from: r */
    public static String m199204r(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName(qmw.m177151a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 53, 73, 21, 69, 82, 12, 54, 66, 9, 65, 82, 19, 18, 89, 3, 66}));
            str3 = (String) cls.getMethod(qmw.m177151a(new byte[]{87, 3, 69}), String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }
}
