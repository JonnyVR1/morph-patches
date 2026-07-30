package p153l;

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
public final class hwq0 {

    /* JADX INFO: renamed from: c */
    private static final String[] f111910c = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* JADX INFO: renamed from: d */
    private static String f111911d = null;

    /* JADX INFO: renamed from: e */
    private static int f111912e = -1;

    /* JADX INFO: renamed from: f */
    private static int f111913f = -1;

    /* JADX INFO: renamed from: a */
    private Context f111914a;

    /* JADX INFO: renamed from: b */
    private JSONObject f111915b = new JSONObject();

    public hwq0(Context context) {
        this.f111914a = context;
    }

    /* JADX INFO: renamed from: a */
    public static hwq0 m137476a(Context context) {
        hwq0 hwq0Var = new hwq0(context);
        hwq0Var.m137489t(hwq0Var.m137501s());
        return hwq0Var;
    }

    /* JADX INFO: renamed from: b */
    public static hwq0 m137477b(Context context, long j) {
        hwq0 hwq0VarM137476a;
        k5r0 k5r0VarM148477c = k5r0.m148477c();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject jSONObjectM148487d = k5r0VarM148477c.m148487d(j);
        if (jSONObjectM148487d == null || jSONObjectM148487d.length() == 0) {
            hwq0VarM137476a = m137476a(n0r0.m161022i());
            hwq0VarM137476a.m137498m();
            try {
                hwq0VarM137476a.m137501s().put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            hwq0VarM137476a = new hwq0(n0r0.m161022i());
        }
        m137482h(hwq0VarM137476a);
        hwq0VarM137476a.m137497l(jSONObjectM148487d);
        return hwq0VarM137476a;
    }

    /* JADX INFO: renamed from: c */
    public static hwq0 m137478c(hwq0 hwq0Var) {
        m137479e(hwq0Var.m137501s());
        return hwq0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m137479e(JSONObject jSONObject) {
        m137494y(jSONObject);
        m137495z(jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m137480f() {
        if (f111912e == -1) {
            f111912e = m137490u().contains("64") ? 1 : 0;
        }
        return f111912e == 1;
    }

    /* JADX INFO: renamed from: g */
    public static hwq0 m137481g(Context context) {
        hwq0 hwq0VarM137476a = m137476a(context);
        m137478c(hwq0VarM137476a);
        m137482h(hwq0VarM137476a);
        hwq0VarM137476a.m137498m();
        hwq0VarM137476a.m137499o();
        hwq0VarM137476a.m137500q();
        return hwq0VarM137476a;
    }

    /* JADX INFO: renamed from: h */
    public static void m137482h(hwq0 hwq0Var) {
        if (hwq0Var == null) {
            return;
        }
        m137483i(hwq0Var.m137501s());
    }

    /* JADX INFO: renamed from: i */
    public static void m137483i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        m137493x(jSONObject);
        m137491v(jSONObject);
        m137492w(jSONObject);
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", n0r0.m161018e().m166169a());
            jSONObject.put("os_version", m137485k());
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
            jSONObject.put("cpu_abi", m137490u());
            Context contextM161022i = n0r0.m161022i();
            String packageName = contextM161022i.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextM161022i.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i = applicationInfo.labelRes;
                jSONObject.put("display_name", i > 0 ? contextM161022i.getString(i) : contextM161022i.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m137484j() {
        if (f111913f == -1) {
            f111913f = m137490u().contains("86") ? 1 : 0;
        }
        return f111913f == 1;
    }

    /* JADX INFO: renamed from: k */
    public static String m137485k() {
        String str = Build.VERSION.RELEASE;
        return str.contains(".") ? str : str.concat(".0");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m137486n(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m137487p(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m137488r(JSONObject jSONObject) {
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
    private void m137489t(JSONObject jSONObject) {
        try {
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 290);
            jSONObject.put("sdk_version_name", "0.0.2");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    private static String m137490u() {
        if (f111911d == null) {
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
                    f111911d = "unknown";
                }
                f111911d = sb.toString();
            } catch (Exception e) {
                q5r0.m175517g(e);
                f111911d = "unknown";
            }
        }
        return f111911d;
    }

    /* JADX INFO: renamed from: v */
    private static void m137491v(JSONObject jSONObject) {
        String str;
        try {
            DisplayMetrics displayMetrics = n0r0.m161022i().getResources().getDisplayMetrics();
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
            jSONObject.put("resolution", displayMetrics.heightPixels + BaseSei.f14624X + displayMetrics.widthPixels);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    private static void m137492w(JSONObject jSONObject) {
        try {
            String language = n0r0.m161022i().getResources().getConfiguration().locale.getLanguage();
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
    private static void m137493x(JSONObject jSONObject) {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            if (rxq0.m183560f()) {
                str = "MIUI-";
            } else {
                if (!rxq0.m183562h()) {
                    String strM183555a = rxq0.m183555a();
                    if (rxq0.m183556b(strM183555a)) {
                        sb.append("EMUI-");
                    }
                    if (!TextUtils.isEmpty(strM183555a)) {
                        sb.append(strM183555a);
                        str = "-";
                    }
                    sb.append(Build.VERSION.INCREMENTAL);
                    if (sb.length() > 0) {
                        jSONObject.put("rom", sb.toString());
                    }
                    jSONObject.put("rom_version", z5r0.m218725a());
                }
                str = "FLYME-";
            }
            sb.append(str);
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", z5r0.m218725a());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m137494y(JSONObject jSONObject) {
        try {
            jSONObject.put("access", l5r0.m152976a(n0r0.m161022i()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: z */
    private static void m137495z(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) n0r0.m161022i().getSystemService("phone");
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
    public JSONObject m137496d(Map<String, Object> map) {
        try {
            if (map == null) {
                return this.f111915b;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f111915b.has(entry.getKey())) {
                    this.f111915b.put(entry.getKey(), entry.getValue());
                }
            }
            for (String str : f111910c) {
                if (map.containsKey(str)) {
                    try {
                        this.f111915b.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused) {
                        this.f111915b.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f111915b.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused2) {
                }
            }
            if (map.containsKey("iid")) {
                this.f111915b.put("udid", map.get("iid"));
                this.f111915b.remove("iid");
            }
            if (map.containsKey("version_name")) {
                this.f111915b.put("app_version", map.get("version_name"));
                this.f111915b.remove("version_name");
            }
        } catch (Throwable unused3) {
        }
        return this.f111915b;
    }

    /* JADX INFO: renamed from: l */
    public JSONObject m137497l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f111915b;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f111915b.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.f111915b;
    }

    /* JADX INFO: renamed from: m */
    public JSONObject m137498m() {
        return m137496d(n0r0.m161015b().m100917b());
    }

    /* JADX INFO: renamed from: o */
    public JSONObject m137499o() {
        try {
            this.f111915b.put("device_id", n0r0.m161018e().m166169a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f111915b;
    }

    /* JADX INFO: renamed from: q */
    public JSONObject m137500q() {
        try {
            long jM100922h = n0r0.m161015b().m100922h();
            if (jM100922h > 0) {
                this.f111915b.put("user_id", jM100922h);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f111915b;
    }

    /* JADX INFO: renamed from: s */
    public JSONObject m137501s() {
        return this.f111915b;
    }
}
