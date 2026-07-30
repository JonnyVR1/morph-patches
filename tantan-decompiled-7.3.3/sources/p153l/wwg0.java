package p153l;

import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class wwg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f191277a;

    public wwg0(pgg0 pgg0Var) {
        this.f191277a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            pgg0.m172229d(this.f191277a, jSONObject.getString("type"), jSONObject.getInt("obj"), jSONObject.optJSONObject("data"));
        } catch (JSONException e) {
            ysg0.m217257c("WXGame", "ObjCreate:" + e.getMessage());
        }
    }
}
