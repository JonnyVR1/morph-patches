package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class gpg0 extends oxg0 {
    /* JADX INFO: renamed from: g */
    public final void m131257g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", "没有广告模块");
            jSONObject.put("errCode", 1008);
        } catch (JSONException unused) {
        }
        m169707f("_error", jSONObject);
    }
}
