package p149l;

import com.cosmos.photon.push.service.PushService;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class x7g0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f191362a;

    public x7g0(h8g0 h8g0Var) {
        this.f191362a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            h8g0.m129887c(this.f191362a, jSONObject.getInt("obj"), jSONObject.getString(PushService.KEY_COMMAND), jSONObject.optJSONObject("data"));
        } catch (JSONException e) {
            qkg0.m175377c("WXGame", "ObjMsg:" + e.getMessage());
        }
    }
}
