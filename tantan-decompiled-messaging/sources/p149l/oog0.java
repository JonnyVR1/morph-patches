package p149l;

import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class oog0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f144872a;

    public oog0(h8g0 h8g0Var) {
        this.f144872a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            h8g0.m129888d(this.f144872a, jSONObject.getString("type"), jSONObject.getInt("obj"), jSONObject.optJSONObject("data"));
        } catch (JSONException e) {
            qkg0.m175377c("WXGame", "ObjCreate:" + e.getMessage());
        }
    }
}
