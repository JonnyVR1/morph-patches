package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.xiaomi.push.EnumC14937n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class l4r0 {

    /* JADX INFO: renamed from: a */
    private static volatile int f130011a = 0;

    /* JADX INFO: renamed from: b */
    private static int f130012b = -1;

    /* JADX INFO: renamed from: c */
    private static Map<String, EnumC14937n> f130013c;

    /* JADX INFO: renamed from: a */
    public static int m152816a() {
        if (f130011a == 0) {
            try {
                f130011a = (TextUtils.isEmpty(m152822g("ro.miui.ui.version.code")) && TextUtils.isEmpty(m152822g("ro.miui.ui.version.name"))) ? 2 : 1;
            } catch (Throwable th) {
                ouq0.m169395o("get isMIUI failed", th);
                f130011a = 0;
            }
            ouq0.m169403w("isMIUI's value is: " + f130011a);
        }
        return f130011a;
    }

    /* JADX INFO: renamed from: b */
    public static int m152817b(Context context) {
        String strM152822g = m152822g("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(strM152822g) || !TextUtils.isDigitsOnly(strM152822g)) {
            return 0;
        }
        return Integer.parseInt(strM152822g);
    }

    /* JADX INFO: renamed from: c */
    public static EnumC14937n m152818c(String str) {
        EnumC14937n enumC14937nM152828m = m152828m(str);
        return enumC14937nM152828m == null ? EnumC14937n.Global : enumC14937nM152828m;
    }

    /* JADX INFO: renamed from: d */
    public static String m152819d() {
        int iM189417a = t5r0.m189417a();
        if (!m152824i() || iM189417a <= 0) {
            return "";
        }
        if (iM189417a < 2) {
            return "alpha";
        }
        return iM189417a < 3 ? "development" : "stable";
    }

    /* JADX INFO: renamed from: e */
    public static String m152820e(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m152821f(intent.getExtras());
    }

    /* JADX INFO: renamed from: f */
    public static String m152821f(Bundle bundle) {
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
                    sb.append(m152821f((Bundle) obj));
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
    public static String m152822g(String str) {
        try {
            try {
                return (String) otq0.m169169g("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                ouq0.m169378B("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m152823h() {
        if (f130013c != null) {
            return;
        }
        HashMap map = new HashMap();
        f130013c = map;
        map.put("CN", EnumC14937n.China);
        Map<String, EnumC14937n> map2 = f130013c;
        EnumC14937n enumC14937n = EnumC14937n.Europe;
        map2.put("FI", enumC14937n);
        f130013c.put("SE", enumC14937n);
        f130013c.put("NO", enumC14937n);
        f130013c.put("FO", enumC14937n);
        f130013c.put("EE", enumC14937n);
        f130013c.put("LV", enumC14937n);
        f130013c.put("LT", enumC14937n);
        f130013c.put("BY", enumC14937n);
        f130013c.put("MD", enumC14937n);
        f130013c.put("UA", enumC14937n);
        f130013c.put("PL", enumC14937n);
        f130013c.put("CZ", enumC14937n);
        f130013c.put("SK", enumC14937n);
        f130013c.put("HU", enumC14937n);
        f130013c.put("DE", enumC14937n);
        f130013c.put("AT", enumC14937n);
        f130013c.put("CH", enumC14937n);
        f130013c.put("LI", enumC14937n);
        f130013c.put("GB", enumC14937n);
        f130013c.put("IE", enumC14937n);
        f130013c.put("NL", enumC14937n);
        f130013c.put("BE", enumC14937n);
        f130013c.put("LU", enumC14937n);
        f130013c.put("FR", enumC14937n);
        f130013c.put("RO", enumC14937n);
        f130013c.put("BG", enumC14937n);
        f130013c.put("RS", enumC14937n);
        f130013c.put("MK", enumC14937n);
        f130013c.put("AL", enumC14937n);
        f130013c.put("GR", enumC14937n);
        f130013c.put("SI", enumC14937n);
        f130013c.put("HR", enumC14937n);
        f130013c.put("IT", enumC14937n);
        f130013c.put("SM", enumC14937n);
        f130013c.put("MT", enumC14937n);
        f130013c.put("ES", enumC14937n);
        f130013c.put("PT", enumC14937n);
        f130013c.put("AD", enumC14937n);
        f130013c.put("CY", enumC14937n);
        f130013c.put("DK", enumC14937n);
        f130013c.put("IS", enumC14937n);
        f130013c.put("UK", enumC14937n);
        f130013c.put("EL", enumC14937n);
        f130013c.put("RU", EnumC14937n.Russia);
        f130013c.put("IN", EnumC14937n.India);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m152824i() {
        return m152816a() == 1;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m152825j(Context context) {
        return context != null && m152826k(context.getPackageName());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m152826k(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    /* JADX INFO: renamed from: l */
    public static int m152827l(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    private static EnumC14937n m152828m(String str) {
        m152823h();
        return f130013c.get(str.toUpperCase());
    }

    /* JADX INFO: renamed from: n */
    public static String m152829n() {
        String strM170679a = p5r0.m170679a("ro.miui.region", "");
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = m152830o(p5r0.m170679a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strM170679a)) {
            strM170679a = p5r0.m170679a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(strM170679a)) {
            ouq0.m169393m("get region from system, region = " + strM170679a);
        }
        if (!TextUtils.isEmpty(strM170679a)) {
            return strM170679a;
        }
        String country = Locale.getDefault().getCountry();
        ouq0.m169393m("locale.default.country = " + country);
        return country;
    }

    /* JADX INFO: renamed from: o */
    private static String m152830o(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split("-");
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m152831p() {
        return m152816a() == 2;
    }

    /* JADX INFO: renamed from: q */
    public static String m152832q() {
        return m152822g("ro.miui.ui.version.name");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m152833r() {
        if (f130012b < 0) {
            f130012b = !m152837v() ? 1 : 0;
        }
        return f130012b > 0;
    }

    /* JADX INFO: renamed from: s */
    public static String m152834s() {
        return m152822g("ro.build.characteristics");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m152835t() {
        return !EnumC14937n.China.name().equalsIgnoreCase(m152818c(m152829n()).name());
    }

    /* JADX INFO: renamed from: u */
    public static String m152836u() {
        return m152822g("ro.product.manufacturer");
    }

    /* JADX INFO: renamed from: v */
    public static boolean m152837v() {
        String strM170679a = "";
        try {
            strM170679a = p5r0.m170679a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(strM170679a);
    }
}
