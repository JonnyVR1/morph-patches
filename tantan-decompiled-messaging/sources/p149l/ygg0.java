package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ygg0 extends gpg0 {
    /* JADX INFO: renamed from: g */
    public final void m214641g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", "没有广告模块");
            jSONObject.put("errCode", 1008);
        } catch (JSONException unused) {
        }
        m127355f("_error", jSONObject);
    }
}
