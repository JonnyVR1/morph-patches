package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jjg0 implements qtg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nng0 f121176a;

    public jjg0(nng0 nng0Var) {
        this.f121176a = nng0Var;
    }

    @Override // p153l.qtg0
    public final void onCompleted(String str) {
        nng0 nng0Var = this.f121176a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("ret_code");
            String strOptString = jSONObject.optString("ret_msg");
            if (i != 0) {
                nng0Var.f142784a.onFailure(i, strOptString);
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                nng0Var.f142785b = jSONObjectOptJSONObject.optString("model_url");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("crypto");
                if (jSONObjectOptJSONObject2 != null) {
                    nng0Var.f142786c = jSONObjectOptJSONObject2.optString("algorithm");
                    nng0Var.f142787d = jSONObjectOptJSONObject2.optString(Constants.KEY_KEY);
                }
            }
            if (TextUtils.isEmpty(nng0Var.f142785b)) {
                nng0Var.f142784a.onFailure(-1, "modelUrl can not be empty");
                return;
            }
            if (TextUtils.isEmpty(nng0Var.f142786c)) {
                nng0Var.f142784a.onFailure(-1, "algorithm can not be empty");
            } else if (TextUtils.isEmpty(nng0Var.f142787d)) {
                nng0Var.f142784a.onFailure(-1, "key can not be empty");
            } else {
                nng0Var.m163867a();
            }
        } catch (Exception e) {
            LogUtils.file("AiLoadModelTask", LogUtils.getErrorInfo(e));
            nng0Var.f142784a.onFailure(-1, "json error:" + e.toString());
        }
    }
}
