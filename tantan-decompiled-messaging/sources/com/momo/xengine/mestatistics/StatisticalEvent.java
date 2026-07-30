package com.momo.xengine.mestatistics;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.heytap.mcssdk.mode.Message;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.aag0;

/* JADX INFO: loaded from: classes8.dex */
public class StatisticalEvent {
    private static String appPackage = null;
    private static String deviceHW = null;
    private static String deviceSW = null;
    private static int engineVersion = 0;
    private static int magicEffectVersion = 0;
    private static int mmcvVersion = 0;
    private static final String platform = "Android";
    private static int recorderSDKVersion;
    private static String uid;
    private final List<StatisticalValue> values = new LinkedList();

    public static void setEngineVersion(int i) {
        engineVersion = i;
    }

    public static void setMagicEffectVersion(int i) {
        magicEffectVersion = i;
    }

    public static void setMmcvVersion(int i) {
        mmcvVersion = i;
    }

    public static void setRecorderSDKVersion(int i) {
        recorderSDKVersion = i;
    }

    public static void setUid(String str) {
        uid = str;
    }

    public static void setup(Context context) {
        appPackage = context.getPackageName();
        deviceHW = String.format("%s_%s", Build.BRAND, Build.MODEL).replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "_");
        deviceSW = platform + Build.VERSION.RELEASE;
    }

    public void addValue(ReportType reportType, String str, long j, String str2) {
        StatisticalValue statisticalValue = new StatisticalValue(reportType, str, j);
        if (!TextUtils.isEmpty(str2)) {
            statisticalValue.setExtend(str2);
        }
        this.values.add(statisticalValue);
    }

    public JSONObject toJSONObject() {
        if (this.values.size() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            if (engineVersion > 0) {
                sb.append("XE_");
                sb.append(engineVersion);
                sb.append('_');
            }
            if (magicEffectVersion > 0) {
                sb.append("ME_");
                sb.append(magicEffectVersion);
                sb.append('_');
            }
            if (mmcvVersion > 0) {
                sb.append("CV_");
                sb.append(mmcvVersion);
                sb.append('_');
            }
            if (recorderSDKVersion > 0) {
                sb.append("RC_");
                sb.append(recorderSDKVersion);
                sb.append('_');
            }
            jSONObject.put(Message.APP_PACKAGE, appPackage);
            jSONObject.put("platform", platform);
            jSONObject.put("deviceHW", deviceHW);
            jSONObject.put("deviceSW", deviceSW);
            jSONObject.put("sdkVersion", sb);
            jSONObject.put(Oauth2AccessToken.KEY_UID, uid);
            jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
            JSONArray jSONArray = new JSONArray();
            Iterator<StatisticalValue> it = this.values.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSONObject());
            }
            jSONObject.put("values", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public String toString() {
        JSONObject jSONObject = toJSONObject();
        if (jSONObject != null) {
            return jSONObject.toString().replace(".", "_");
        }
        return null;
    }

    public void addValue(ReportType reportType, String str, long j) {
        addValue(reportType, str, j, null);
    }

    public void addValue(StatisticalValue statisticalValue) {
        this.values.add(statisticalValue);
    }
}
