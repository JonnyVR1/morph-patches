package tech.sud.gip.core.network.detection;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkDetectionStepResult {
    public int code;
    public String msg;

    public NetworkDetectionStepResult deepCopy() {
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = this.code;
        networkDetectionStepResult.msg = this.msg;
        return networkDetectionStepResult;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", this.code);
        jSONObject.put("msg", this.msg);
        return jSONObject;
    }
}
