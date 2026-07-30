package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bbg0 implements ilg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ffg0 f74805a;

    public bbg0(ffg0 ffg0Var) {
        this.f74805a = ffg0Var;
    }

    @Override // p149l.ilg0
    public final void onCompleted(String str) {
        ffg0 ffg0Var = this.f74805a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("ret_code");
            String strOptString = jSONObject.optString("ret_msg");
            if (i != 0) {
                ffg0Var.f97255a.onFailure(i, strOptString);
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                ffg0Var.f97256b = jSONObjectOptJSONObject.optString("model_url");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("crypto");
                if (jSONObjectOptJSONObject2 != null) {
                    ffg0Var.f97257c = jSONObjectOptJSONObject2.optString("algorithm");
                    ffg0Var.f97258d = jSONObjectOptJSONObject2.optString(Constants.KEY_KEY);
                }
            }
            if (TextUtils.isEmpty(ffg0Var.f97256b)) {
                ffg0Var.f97255a.onFailure(-1, "modelUrl can not be empty");
                return;
            }
            if (TextUtils.isEmpty(ffg0Var.f97257c)) {
                ffg0Var.f97255a.onFailure(-1, "algorithm can not be empty");
            } else if (TextUtils.isEmpty(ffg0Var.f97258d)) {
                ffg0Var.f97255a.onFailure(-1, "key can not be empty");
            } else {
                ffg0Var.m121159a();
            }
        } catch (Exception e) {
            LogUtils.file("AiLoadModelTask", LogUtils.getErrorInfo(e));
            ffg0Var.f97255a.onFailure(-1, "json error:" + e.toString());
        }
    }
}
