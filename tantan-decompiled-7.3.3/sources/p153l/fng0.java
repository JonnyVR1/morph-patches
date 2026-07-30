package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class fng0 extends oxg0 {
    @Override // p153l.oxg0
    /* JADX INFO: renamed from: e */
    public final void mo126369e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", "fail: invalid param");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m169707f("fail", jSONObject);
    }

    @Override // p153l.oxg0
    /* JADX INFO: renamed from: d */
    public final void mo112983d() {
    }
}
