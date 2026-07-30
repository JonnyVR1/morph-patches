package com.bytedance.hume.readapk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.hume.readapk.p013a.C1134a;
import com.p051p1.mobile.putong.data.JSBridgeVersion;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class HumeSDK {
    public static final String TAG = "HumeSDK";

    /* JADX INFO: renamed from: a */
    private static final int f4741a = 1903654776;

    /* JADX INFO: renamed from: b */
    private static final int f4742b = -1721342362;

    /* JADX INFO: renamed from: c */
    private static final int f4743c = 1903654775;

    /* JADX INFO: renamed from: d */
    private static String[] f4744d = new String[3];

    /* JADX INFO: renamed from: e */
    private static volatile boolean f4745e = false;

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m5718a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                map.put(string, jSONObject.getString(string));
            }
            return map;
        } catch (JSONException | Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Map<String, String> m5719b(Context context) throws Throwable {
        if (!f4745e) {
            m5720c(context);
            f4745e = true;
        }
        Map<String, String> mapM5718a = m5718a(f4744d[2]);
        return mapM5718a == null ? new HashMap() : mapM5718a;
    }

    /* JADX INFO: renamed from: c */
    private static void m5720c(Context context) throws Throwable {
        int[] iArr = {f4742b, f4743c, f4741a};
        String strM5721d = m5721d(context);
        if (TextUtils.isEmpty(strM5721d)) {
            f4744d = new String[]{"", "", ""};
        }
        File file = new File(strM5721d);
        String[] strArrM5739a = C1137d.m5739a(file, iArr);
        if (strArrM5739a == null) {
            strArrM5739a = f4744d;
        }
        f4744d = strArrM5739a;
        if (strArrM5739a.length >= 2 && TextUtils.isEmpty(strArrM5739a[0]) && TextUtils.isEmpty(f4744d[1])) {
            String strM5731a = C1134a.m5731a(file);
            String[] strArr = f4744d;
            if (strM5731a == null) {
                strM5731a = "";
            }
            strArr[0] = strM5731a;
        }
        String[] strArr2 = f4744d;
        if (strArr2.length < 3 || TextUtils.isEmpty(strArr2[2])) {
            return;
        }
        int length = f4744d[2].length();
        if (length <= 4) {
            f4744d[2] = "";
        } else {
            String[] strArr3 = f4744d;
            strArr3[2] = strArr3[2].substring(2, length - 2);
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m5721d(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getChannel(Context context) throws Throwable {
        if (!f4745e) {
            m5720c(context);
            f4745e = true;
        }
        Map<String, String> mapM5718a = m5718a(m5717a(context));
        return (mapM5718a == null || mapM5718a.size() <= 0) ? "" : mapM5718a.get("hume_channel_id");
    }

    public static String getVersion() {
        return JSBridgeVersion.JSBRIDGE_API_VERSION;
    }

    /* JADX INFO: renamed from: a */
    private static String m5717a(Context context) throws Throwable {
        if (!f4745e) {
            m5720c(context);
            f4745e = true;
        }
        if (TextUtils.isEmpty(f4744d[0])) {
            return !TextUtils.isEmpty(f4744d[1]) ? f4744d[1] : "";
        }
        return f4744d[0];
    }
}
