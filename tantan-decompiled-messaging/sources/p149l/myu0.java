package p149l;

import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class myu0 implements bms0 {
    @Override // p149l.bms0
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        nyu0 nyu0Var = (nyu0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132244g9)).booleanValue()) {
            jSONObject2.put("ad_request_url", nyu0Var.f141165c.m156598e());
            jSONObject2.put("ad_request_post_body", nyu0Var.f141165c.m156597d());
        }
        jSONObject2.put("base_url", nyu0Var.f141165c.m156595b());
        jSONObject2.put("signals", nyu0Var.f141164b);
        jSONObject3.put("body", nyu0Var.f141163a.f78064c);
        jSONObject3.put("headers", exr0.m118703b().m134103k(nyu0Var.f141163a.f78063b));
        jSONObject3.put("response_code", nyu0Var.f141163a.f78062a);
        jSONObject3.put("latency", nyu0Var.f141163a.f78065d);
        jSONObject.put(SocialConstants.TYPE_REQUEST, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", nyu0Var.f141165c.m156600g());
        return jSONObject;
    }
}
