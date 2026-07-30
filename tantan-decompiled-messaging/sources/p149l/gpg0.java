package p149l;

import com.cosmos.photon.push.service.PushService;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p137a.C22402c;

/* JADX INFO: loaded from: classes.dex */
public abstract class gpg0 {

    /* JADX INFO: renamed from: a */
    public int f103800a;

    /* JADX INFO: renamed from: b */
    public h8g0 f103801b;

    /* JADX INFO: renamed from: a */
    public abstract void mo110226a();

    /* JADX INFO: renamed from: c */
    public boolean mo110227c(String str, JSONObject jSONObject) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo110228d();

    /* JADX INFO: renamed from: f */
    public final void m127355f(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("obj", this.f103800a);
            jSONObject2.put(PushService.KEY_COMMAND, str);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            qpg0 qpg0Var = this.f103801b.f106410a;
            if (qpg0Var != null) {
                String string = jSONObject2.toString();
                C22402c c22402c = qpg0Var.f155751c;
                if (c22402c == null) {
                    return;
                }
                c22402c.mo221584a("RTObjMsg", string);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo127354e() {
    }

    /* JADX INFO: renamed from: b */
    public void mo127353b(JSONObject jSONObject) {
    }
}
