package p149l;

import com.cosmos.photon.push.service.PushService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class beg0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f75157a;

    public beg0(h8g0 h8g0Var) {
        this.f75157a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.getString(PushService.KEY_COMMAND);
            int i = jSONObject.getInt("id");
            JSONArray jSONArray = jSONObject.getJSONArray("ret");
            h8g0 h8g0Var = this.f75157a;
            trg0 trg0Var = (trg0) h8g0Var.f106415f.get(i);
            if (trg0Var != null) {
                h8g0Var.f106415f.remove(i);
                trg0Var.mo185590a(jSONArray);
            }
        } catch (JSONException e) {
            qkg0.m175377c("WXGame", "Callback:" + e.getMessage());
        }
    }
}
