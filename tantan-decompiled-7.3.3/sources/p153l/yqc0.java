package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.datadot.DataDotUtils;
import com.immomo.moment.datadot.EditDataDotInfo;
import com.immomo.moment.datadot.RecoderDataDotInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class yqc0 {

    /* JADX INFO: renamed from: a */
    public static boolean f201164a = false;

    /* JADX INFO: renamed from: a */
    public static boolean m217077a() {
        return !f201164a;
    }

    /* JADX INFO: renamed from: b */
    public static void m217078b() {
        DataDotUtils.getInstance().clearRecoderDataDotInfo();
    }

    /* JADX INFO: renamed from: c */
    public static void m217079c() {
        DataDotUtils.getInstance().clearEditDataDotInfo();
    }

    /* JADX INFO: renamed from: d */
    private static String m217080d(int i, int i2) {
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
    public static void m217081e(int i, String str, String str2, int i2) {
        JSONObject jSONObject;
        if (m217077a()) {
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
            jSONObject.put("callStack", m217080d(5, 0));
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("customDescribe", str2);
            }
            m217082f(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m217082f(JSONObject jSONObject) {
        if (m217077a() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("perfStatType", 8);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject.toString();
        MDLog.m7443d("RecorderLogger", string);
        zqc0.m221006d(string);
    }

    /* JADX INFO: renamed from: g */
    public static void m217083g(int i) {
        if (m217077a()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("record_onload", String.valueOf(i));
            jSONObject.put("cameraLogType", "cameraPerform");
            jSONObject.put("cameraKind", 1);
            m217082f(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
