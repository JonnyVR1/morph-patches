package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.datadot.DataDotUtils;
import com.immomo.moment.datadot.EditDataDotInfo;
import com.immomo.moment.datadot.RecoderDataDotInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ric0 {

    /* JADX INFO: renamed from: a */
    public static boolean f159535a = false;

    /* JADX INFO: renamed from: a */
    public static boolean m179489a() {
        return !f159535a;
    }

    /* JADX INFO: renamed from: b */
    public static void m179490b() {
        DataDotUtils.getInstance().clearRecoderDataDotInfo();
    }

    /* JADX INFO: renamed from: c */
    public static void m179491c() {
        DataDotUtils.getInstance().clearEditDataDotInfo();
    }

    /* JADX INFO: renamed from: d */
    private static String m179492d(int i, int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        int length = stackTrace.length - i2;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            sb.append("at ");
            sb.append(stackTraceElement.toString());
            sb.append(SignParameters.NEW_LINE);
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m179493e(int i, String str, String str2, int i2) {
        JSONObject jSONObject;
        if (m179489a()) {
            return;
        }
        try {
            if (i2 == 1) {
                jSONObject = new JSONObject(RecoderDataDotInfo.toRecoderDataDot(DataDotUtils.getInstance().getRecoderDataDotInfo()));
            } else {
                jSONObject = i2 == 2 ? new JSONObject(EditDataDotInfo.toEditDataDot(DataDotUtils.getInstance().getEditDataDotInfo())) : new JSONObject();
            }
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put("errorMsg", str);
            jSONObject.put("cameraLogType", "cameraError");
            jSONObject.put("callStack", m179492d(5, 0));
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("customDescribe", str2);
            }
            m179494f(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m179494f(JSONObject jSONObject) {
        if (m179489a() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("perfStatType", 8);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject.toString();
        MDLog.m7389d("RecorderLogger", string);
        sic0.m184323d(string);
    }

    /* JADX INFO: renamed from: g */
    public static void m179495g(int i) {
        if (m179489a()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("record_onload", String.valueOf(i));
            jSONObject.put("cameraLogType", "cameraPerform");
            jSONObject.put("cameraKind", 1);
            m179494f(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
