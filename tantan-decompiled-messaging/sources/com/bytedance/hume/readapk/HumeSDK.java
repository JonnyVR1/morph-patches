package com.bytedance.hume.readapk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.hume.readapk.p012a.C1111a;
import com.p046p1.mobile.putong.data.JSBridgeVersion;
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
    private static final int f4704a = 1903654776;

    /* JADX INFO: renamed from: b */
    private static final int f4705b = -1721342362;

    /* JADX INFO: renamed from: c */
    private static final int f4706c = 1903654775;

    /* JADX INFO: renamed from: d */
    private static String[] f4707d = new String[3];

    /* JADX INFO: renamed from: e */
    private static volatile boolean f4708e = false;

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m5664a(String str) {
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
    private static Map<String, String> m5665b(Context context) throws Throwable {
        if (!f4708e) {
            m5666c(context);
            f4708e = true;
        }
        Map<String, String> mapM5664a = m5664a(f4707d[2]);
        return mapM5664a == null ? new HashMap() : mapM5664a;
    }

    /* JADX INFO: renamed from: c */
    private static void m5666c(Context context) throws Throwable {
        int[] iArr = {f4705b, f4706c, f4704a};
        String strM5667d = m5667d(context);
        if (TextUtils.isEmpty(strM5667d)) {
            f4707d = new String[]{"", "", ""};
        }
        File file = new File(strM5667d);
        String[] strArrM5685a = C1114d.m5685a(file, iArr);
        if (strArrM5685a == null) {
            strArrM5685a = f4707d;
        }
        f4707d = strArrM5685a;
        if (strArrM5685a.length >= 2 && TextUtils.isEmpty(strArrM5685a[0]) && TextUtils.isEmpty(f4707d[1])) {
            String strM5677a = C1111a.m5677a(file);
            String[] strArr = f4707d;
            if (strM5677a == null) {
                strM5677a = "";
            }
            strArr[0] = strM5677a;
        }
        String[] strArr2 = f4707d;
        if (strArr2.length < 3 || TextUtils.isEmpty(strArr2[2])) {
            return;
        }
        int length = f4707d[2].length();
        if (length <= 4) {
            f4707d[2] = "";
        } else {
            String[] strArr3 = f4707d;
            strArr3[2] = strArr3[2].substring(2, length - 2);
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m5667d(Context context) {
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
        if (!f4708e) {
            m5666c(context);
            f4708e = true;
        }
        Map<String, String> mapM5664a = m5664a(m5663a(context));
        return (mapM5664a == null || mapM5664a.size() <= 0) ? "" : mapM5664a.get("hume_channel_id");
    }

    public static String getVersion() {
        return JSBridgeVersion.JSBRIDGE_API_VERSION;
    }

    /* JADX INFO: renamed from: a */
    private static String m5663a(Context context) throws Throwable {
        if (!f4708e) {
            m5666c(context);
            f4708e = true;
        }
        if (TextUtils.isEmpty(f4707d[0])) {
            return !TextUtils.isEmpty(f4707d[1]) ? f4707d[1] : "";
        }
        return f4707d[0];
    }
}
