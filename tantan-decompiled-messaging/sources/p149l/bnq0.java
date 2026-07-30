package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.connect.common.Constants;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bnq0 {

    /* JADX INFO: renamed from: c */
    private static final String[] f76428c = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* JADX INFO: renamed from: d */
    private static String f76429d = null;

    /* JADX INFO: renamed from: e */
    private static int f76430e = -1;

    /* JADX INFO: renamed from: f */
    private static int f76431f = -1;

    /* JADX INFO: renamed from: a */
    private Context f76432a;

    /* JADX INFO: renamed from: b */
    private JSONObject f76433b = new JSONObject();

    public bnq0(Context context) {
        this.f76432a = context;
    }

    /* JADX INFO: renamed from: a */
    public static bnq0 m102832a(Context context) {
        bnq0 bnq0Var = new bnq0(context);
        bnq0Var.m102845t(bnq0Var.m102857s());
        return bnq0Var;
    }

    /* JADX INFO: renamed from: b */
    public static bnq0 m102833b(Context context, long j) {
        bnq0 bnq0VarM102832a;
        ewq0 ewq0VarM118487c = ewq0.m118487c();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject jSONObjectM118497d = ewq0VarM118487c.m118497d(j);
        if (jSONObjectM118497d == null || jSONObjectM118497d.length() == 0) {
            bnq0VarM102832a = m102832a(hrq0.m132700i());
            bnq0VarM102832a.m102854m();
            try {
                bnq0VarM102832a.m102857s().put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            bnq0VarM102832a = new bnq0(hrq0.m132700i());
        }
        m102838h(bnq0VarM102832a);
        bnq0VarM102832a.m102853l(jSONObjectM118497d);
        return bnq0VarM102832a;
    }

    /* JADX INFO: renamed from: c */
    public static bnq0 m102834c(bnq0 bnq0Var) {
        m102835e(bnq0Var.m102857s());
        return bnq0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m102835e(JSONObject jSONObject) {
        m102850y(jSONObject);
        m102851z(jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m102836f() {
        if (f76430e == -1) {
            f76430e = m102846u().contains("64") ? 1 : 0;
        }
        return f76430e == 1;
    }

    /* JADX INFO: renamed from: g */
    public static bnq0 m102837g(Context context) {
        bnq0 bnq0VarM102832a = m102832a(context);
        m102834c(bnq0VarM102832a);
        m102838h(bnq0VarM102832a);
        bnq0VarM102832a.m102854m();
        bnq0VarM102832a.m102855o();
        bnq0VarM102832a.m102856q();
        return bnq0VarM102832a;
    }

    /* JADX INFO: renamed from: h */
    public static void m102838h(bnq0 bnq0Var) {
        if (bnq0Var == null) {
            return;
        }
        m102839i(bnq0Var.m102857s());
    }

    /* JADX INFO: renamed from: i */
    public static void m102839i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        m102849x(jSONObject);
        m102847v(jSONObject);
        m102848w(jSONObject);
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", hrq0.m132696e().m138758a());
            jSONObject.put("os_version", m102841k());
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str = Build.MODEL;
            String str2 = Build.BRAND;
            if (str == null) {
                str = str2;
            } else if (str2 != null && !str.contains(str2)) {
                str = str2 + ' ' + str;
            }
            jSONObject.put("device_model", str);
            jSONObject.put("device_brand", str2);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", m102846u());
            Context contextM132700i = hrq0.m132700i();
            String packageName = contextM132700i.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextM132700i.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i = applicationInfo.labelRes;
                jSONObject.put("display_name", i > 0 ? contextM132700i.getString(i) : contextM132700i.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m102840j() {
        if (f76431f == -1) {
            f76431f = m102846u().contains("86") ? 1 : 0;
        }
        return f76431f == 1;
    }

    /* JADX INFO: renamed from: k */
    public static String m102841k() {
        String str = Build.VERSION.RELEASE;
        return str.contains(".") ? str : str.concat(".0");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m102842n(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m102843p(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m102844r(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString("aid");
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return Integer.parseInt(strOptString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: t */
    private void m102845t(JSONObject jSONObject) {
        try {
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 290);
            jSONObject.put("sdk_version_name", "0.0.2");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    private static String m102846u() {
        if (f76429d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i >= strArr.length) {
                            break;
                        }
                        sb.append(strArr[i]);
                        if (i != strArr.length - 1) {
                            sb.append(", ");
                        }
                        i++;
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f76429d = "unknown";
                }
                f76429d = sb.toString();
            } catch (Exception e) {
                kwq0.m147634g(e);
                f76429d = "unknown";
            }
        }
        return f76429d;
    }

    /* JADX INFO: renamed from: v */
    private static void m102847v(JSONObject jSONObject) {
        String str;
        try {
            DisplayMetrics displayMetrics = hrq0.m132700i().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                str = "ldpi";
            } else if (i != 240) {
                str = i != 320 ? "mdpi" : "xhdpi";
            } else {
                str = "hdpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + BaseSei.f13930X + displayMetrics.widthPixels);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    private static void m102848w(JSONObject jSONObject) {
        try {
            String language = hrq0.m132700i().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, language);
            }
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put("region", country);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0005, B:6:0x000d, B:16:0x0035, B:18:0x0040, B:19:0x0049, B:7:0x0011, B:10:0x001a, B:12:0x0024, B:13:0x0029, B:15:0x002f), top: B:22:0x0005 }] */
    /* JADX INFO: renamed from: x */
    private static void m102849x(JSONObject jSONObject) {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            if (loq0.m150793f()) {
                str = "MIUI-";
            } else {
                if (!loq0.m150795h()) {
                    String strM150788a = loq0.m150788a();
                    if (loq0.m150789b(strM150788a)) {
                        sb.append("EMUI-");
                    }
                    if (!TextUtils.isEmpty(strM150788a)) {
                        sb.append(strM150788a);
                        str = "-";
                    }
                    sb.append(Build.VERSION.INCREMENTAL);
                    if (sb.length() > 0) {
                        jSONObject.put("rom", sb.toString());
                    }
                    jSONObject.put("rom_version", twq0.m190869a());
                }
                str = "FLYME-";
            }
            sb.append(str);
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", twq0.m190869a());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m102850y(JSONObject jSONObject) {
        try {
            jSONObject.put("access", fwq0.m123552a(hrq0.m132700i()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: z */
    private static void m102851z(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) hrq0.m132700i().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m102852d(Map<String, Object> map) {
        try {
            if (map == null) {
                return this.f76433b;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f76433b.has(entry.getKey())) {
                    this.f76433b.put(entry.getKey(), entry.getValue());
                }
            }
            for (String str : f76428c) {
                if (map.containsKey(str)) {
                    try {
                        this.f76433b.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused) {
                        this.f76433b.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f76433b.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused2) {
                }
            }
            if (map.containsKey("iid")) {
                this.f76433b.put("udid", map.get("iid"));
                this.f76433b.remove("iid");
            }
            if (map.containsKey("version_name")) {
                this.f76433b.put("app_version", map.get("version_name"));
                this.f76433b.remove("version_name");
            }
        } catch (Throwable unused3) {
        }
        return this.f76433b;
    }

    /* JADX INFO: renamed from: l */
    public JSONObject m102853l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f76433b;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f76433b.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.f76433b;
    }

    /* JADX INFO: renamed from: m */
    public JSONObject m102854m() {
        return m102852d(hrq0.m132693b().m194560b());
    }

    /* JADX INFO: renamed from: o */
    public JSONObject m102855o() {
        try {
            this.f76433b.put("device_id", hrq0.m132696e().m138758a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f76433b;
    }

    /* JADX INFO: renamed from: q */
    public JSONObject m102856q() {
        try {
            long jM194565h = hrq0.m132693b().m194565h();
            if (jM194565h > 0) {
                this.f76433b.put("user_id", jM194565h);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f76433b;
    }

    /* JADX INFO: renamed from: s */
    public JSONObject m102857s() {
        return this.f76433b;
    }
}
