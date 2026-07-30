package p153l;

import com.cosmos.photon.push.service.PushService;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p141a.C22517c;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxg0 {

    /* JADX INFO: renamed from: a */
    public int f149666a;

    /* JADX INFO: renamed from: b */
    public pgg0 f149667b;

    /* JADX INFO: renamed from: a */
    public abstract void mo112981a();

    /* JADX INFO: renamed from: c */
    public boolean mo112982c(String str, JSONObject jSONObject) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo112983d();

    /* JADX INFO: renamed from: f */
    public final void m169707f(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("obj", this.f149666a);
            jSONObject2.put(PushService.KEY_COMMAND, str);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            yxg0 yxg0Var = this.f149667b.f152264a;
            if (yxg0Var != null) {
                String string = jSONObject2.toString();
                C22517c c22517c = yxg0Var.f201971c;
                if (c22517c == null) {
                    return;
                }
                c22517c.mo222830a("RTObjMsg", string);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo126369e() {
    }

    /* JADX INFO: renamed from: b */
    public void mo169706b(JSONObject jSONObject) {
    }
}
