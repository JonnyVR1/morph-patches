package p153l;

import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s7v0 implements hvs0 {
    @Override // p153l.hvs0
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        t7v0 t7v0Var = (t7v0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168315g9)).booleanValue()) {
            jSONObject2.put("ad_request_url", t7v0Var.f172474c.m184593e());
            jSONObject2.put("ad_request_post_body", t7v0Var.f172474c.m184592d());
        }
        jSONObject2.put("base_url", t7v0Var.f172474c.m184590b());
        jSONObject2.put("signals", t7v0Var.f172473b);
        jSONObject3.put("body", t7v0Var.f172472a.f108277c);
        jSONObject3.put("headers", k6s0.m148569b().m167056k(t7v0Var.f172472a.f108276b));
        jSONObject3.put("response_code", t7v0Var.f172472a.f108275a);
        jSONObject3.put("latency", t7v0Var.f172472a.f108278d);
        jSONObject.put(SocialConstants.TYPE_REQUEST, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", t7v0Var.f172474c.m184595g());
        return jSONObject;
    }
}
