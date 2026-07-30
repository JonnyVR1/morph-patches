package com.cosmos.photon.push.thirdparty;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ThirdPartyEventReporter {
    private static String appId = "";
    private static IPushBridge bridge;
    private static IStatisticReporter reporter;

    private static void log(String str) {
        IStatisticReporter iStatisticReporter = reporter;
        if (iStatisticReporter != null) {
            iStatisticReporter.log(str);
        } else if (PushLogger.DEBUG) {
            PushLogger.m7458i(str);
        }
    }

    public static void logIsSupport(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            IPushBridge iPushBridge = bridge;
            if (iPushBridge != null) {
                jSONObject.put("token", iPushBridge.getRegisteredToken());
            }
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, appId);
            jSONObject.put("type", 10000);
            jSONObject.put("action", "is_support");
            jSONObject.put("vendor", str);
            jSONObject.put("code", z ? 1 : 0);
            log(jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    public static void logReg(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            IPushBridge iPushBridge = bridge;
            if (iPushBridge != null) {
                jSONObject.put("token", iPushBridge.getRegisteredToken());
            }
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, appId);
            jSONObject.put("type", 10000);
            jSONObject.put("action", "reg");
            jSONObject.put("vendor", str);
            log(jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    public static void logRegCallback(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            IPushBridge iPushBridge = bridge;
            if (iPushBridge != null) {
                jSONObject.put("token", iPushBridge.getRegisteredToken());
            }
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, appId);
            jSONObject.put("type", 10000);
            jSONObject.put("action", "reg_callback");
            jSONObject.put("vendor", str);
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("msg", str2);
            }
            log(jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    public static void logThirdMsgError(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            IPushBridge iPushBridge = bridge;
            if (iPushBridge != null) {
                jSONObject.put("token", iPushBridge.getRegisteredToken());
            }
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, appId);
            jSONObject.put("type", 10000);
            jSONObject.put("action", "third_msg_err");
            jSONObject.put("vendor", str);
            jSONObject.put("code", i);
            log(jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    public static void setAppId(String str) {
        appId = str;
    }

    public static void setBridge(IPushBridge iPushBridge) {
        bridge = iPushBridge;
    }

    public static void setReporter(IStatisticReporter iStatisticReporter) {
        reporter = iStatisticReporter;
    }
}
