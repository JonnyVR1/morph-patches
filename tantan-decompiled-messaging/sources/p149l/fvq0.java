package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.xiaomi.push.EnumC14789n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class fvq0 {

    /* JADX INFO: renamed from: a */
    private static volatile int f99470a = 0;

    /* JADX INFO: renamed from: b */
    private static int f99471b = -1;

    /* JADX INFO: renamed from: c */
    private static Map<String, EnumC14789n> f99472c;

    /* JADX INFO: renamed from: a */
    public static int m123347a() {
        if (f99470a == 0) {
            try {
                f99470a = (TextUtils.isEmpty(m123353g("ro.miui.ui.version.code")) && TextUtils.isEmpty(m123353g("ro.miui.ui.version.name"))) ? 2 : 1;
            } catch (Throwable th) {
                ilq0.m137042o("get isMIUI failed", th);
                f99470a = 0;
            }
            ilq0.m137050w("isMIUI's value is: " + f99470a);
        }
        return f99470a;
    }

    /* JADX INFO: renamed from: b */
    public static int m123348b(Context context) {
        String strM123353g = m123353g("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(strM123353g) || !TextUtils.isDigitsOnly(strM123353g)) {
            return 0;
        }
        return Integer.parseInt(strM123353g);
    }

    /* JADX INFO: renamed from: c */
    public static EnumC14789n m123349c(String str) {
        EnumC14789n enumC14789nM123359m = m123359m(str);
        return enumC14789nM123359m == null ? EnumC14789n.Global : enumC14789nM123359m;
    }

    /* JADX INFO: renamed from: d */
    public static String m123350d() {
        int iM161878a = nwq0.m161878a();
        if (!m123355i() || iM161878a <= 0) {
            return "";
        }
        if (iM161878a < 2) {
            return "alpha";
        }
        return iM161878a < 3 ? "development" : "stable";
    }

    /* JADX INFO: renamed from: e */
    public static String m123351e(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m123352f(intent.getExtras());
    }

    /* JADX INFO: renamed from: f */
    public static String m123352f(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) obj));
                } else if (obj instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb.append(m123352f((Bundle) obj));
                } else {
                    sb.append(obj);
                }
                z = false;
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m123353g(String str) {
        try {
            try {
                return (String) ikq0.m136884g("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                ilq0.m137025B("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m123354h() {
        if (f99472c != null) {
            return;
        }
        HashMap map = new HashMap();
        f99472c = map;
        map.put("CN", EnumC14789n.China);
        Map<String, EnumC14789n> map2 = f99472c;
        EnumC14789n enumC14789n = EnumC14789n.Europe;
        map2.put("FI", enumC14789n);
        f99472c.put("SE", enumC14789n);
        f99472c.put("NO", enumC14789n);
        f99472c.put("FO", enumC14789n);
        f99472c.put("EE", enumC14789n);
        f99472c.put("LV", enumC14789n);
        f99472c.put("LT", enumC14789n);
        f99472c.put("BY", enumC14789n);
        f99472c.put("MD", enumC14789n);
        f99472c.put("UA", enumC14789n);
        f99472c.put("PL", enumC14789n);
        f99472c.put("CZ", enumC14789n);
        f99472c.put("SK", enumC14789n);
        f99472c.put("HU", enumC14789n);
        f99472c.put("DE", enumC14789n);
        f99472c.put("AT", enumC14789n);
        f99472c.put("CH", enumC14789n);
        f99472c.put("LI", enumC14789n);
        f99472c.put("GB", enumC14789n);
        f99472c.put("IE", enumC14789n);
        f99472c.put("NL", enumC14789n);
        f99472c.put("BE", enumC14789n);
        f99472c.put("LU", enumC14789n);
        f99472c.put("FR", enumC14789n);
        f99472c.put("RO", enumC14789n);
        f99472c.put("BG", enumC14789n);
        f99472c.put("RS", enumC14789n);
        f99472c.put("MK", enumC14789n);
        f99472c.put("AL", enumC14789n);
        f99472c.put("GR", enumC14789n);
        f99472c.put("SI", enumC14789n);
        f99472c.put("HR", enumC14789n);
        f99472c.put("IT", enumC14789n);
        f99472c.put("SM", enumC14789n);
        f99472c.put("MT", enumC14789n);
        f99472c.put("ES", enumC14789n);
        f99472c.put("PT", enumC14789n);
        f99472c.put("AD", enumC14789n);
        f99472c.put("CY", enumC14789n);
        f99472c.put("DK", enumC14789n);
        f99472c.put("IS", enumC14789n);
        f99472c.put("UK", enumC14789n);
        f99472c.put("EL", enumC14789n);
        f99472c.put("RU", EnumC14789n.Russia);
        f99472c.put("IN", EnumC14789n.India);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m123355i() {
        return m123347a() == 1;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m123356j(Context context) {
        return context != null && m123357k(context.getPackageName());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m123357k(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    /* JADX INFO: renamed from: l */
    public static int m123358l(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    private static EnumC14789n m123359m(String str) {
        m123354h();
        return f99472c.get(str.toUpperCase());
    }

    /* JADX INFO: renamed from: n */
    public static String m123360n() {
        String strM143665a = jwq0.m143665a("ro.miui.region", "");
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = m123361o(jwq0.m143665a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strM143665a)) {
            strM143665a = jwq0.m143665a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(strM143665a)) {
            ilq0.m137040m("get region from system, region = " + strM143665a);
        }
        if (!TextUtils.isEmpty(strM143665a)) {
            return strM143665a;
        }
        String country = Locale.getDefault().getCountry();
        ilq0.m137040m("locale.default.country = " + country);
        return country;
    }

    /* JADX INFO: renamed from: o */
    private static String m123361o(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split("-");
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m123362p() {
        return m123347a() == 2;
    }

    /* JADX INFO: renamed from: q */
    public static String m123363q() {
        return m123353g("ro.miui.ui.version.name");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m123364r() {
        if (f99471b < 0) {
            f99471b = !m123368v() ? 1 : 0;
        }
        return f99471b > 0;
    }

    /* JADX INFO: renamed from: s */
    public static String m123365s() {
        return m123353g("ro.build.characteristics");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m123366t() {
        return !EnumC14789n.China.name().equalsIgnoreCase(m123349c(m123360n()).name());
    }

    /* JADX INFO: renamed from: u */
    public static String m123367u() {
        return m123353g("ro.product.manufacturer");
    }

    /* JADX INFO: renamed from: v */
    public static boolean m123368v() {
        String strM143665a = "";
        try {
            strM143665a = jwq0.m143665a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(strM143665a);
    }
}
