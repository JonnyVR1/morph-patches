package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class xeg0 extends gpg0 {
    @Override // p149l.gpg0
    /* JADX INFO: renamed from: e */
    public final void mo127354e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", "fail: invalid param");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m127355f("fail", jSONObject);
    }

    @Override // p149l.gpg0
    /* JADX INFO: renamed from: d */
    public final void mo110228d() {
    }
}
