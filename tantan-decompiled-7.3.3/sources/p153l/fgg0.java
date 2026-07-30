package p153l;

import com.cosmos.photon.push.service.PushService;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class fgg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f98934a;

    public fgg0(pgg0 pgg0Var) {
        this.f98934a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            pgg0.m172228c(this.f98934a, jSONObject.getInt("obj"), jSONObject.getString(PushService.KEY_COMMAND), jSONObject.optJSONObject("data"));
        } catch (JSONException e) {
            ysg0.m217257c("WXGame", "ObjMsg:" + e.getMessage());
        }
    }
}
