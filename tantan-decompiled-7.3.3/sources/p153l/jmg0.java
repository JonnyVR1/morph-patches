package p153l;

import com.cosmos.photon.push.service.PushService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class jmg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f121670a;

    public jmg0(pgg0 pgg0Var) {
        this.f121670a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.getString(PushService.KEY_COMMAND);
            int i = jSONObject.getInt("id");
            JSONArray jSONArray = jSONObject.getJSONArray("ret");
            pgg0 pgg0Var = this.f121670a;
            b0h0 b0h0Var = (b0h0) pgg0Var.f152269f.get(i);
            if (b0h0Var != null) {
                pgg0Var.f152269f.remove(i);
                b0h0Var.mo101070a(jSONArray);
            }
        } catch (JSONException e) {
            ysg0.m217257c("WXGame", "Callback:" + e.getMessage());
        }
    }
}
