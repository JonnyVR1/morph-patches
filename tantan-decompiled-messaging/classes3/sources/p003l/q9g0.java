package p003l;

import l.mlg0;
import l.njg0;
import l.y6g0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class q9g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f6611a;

    public q9g0(oqg0 oqg0Var) {
        this.f6611a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m7016a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("user_id", this.f6611a.f6207d);
            jSONObject.put("room_id", this.f6611a.f6208e);
            jSONObject.put("mg_id", this.f6611a.f6210g);
            jSONObject.put("mg_id_str", String.valueOf(this.f6611a.f6210g));
            jSONObject.put("code", this.f6611a.f6209f);
            jSONObject.put("app_id", mlg0.g);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", mlg0.d());
            jSONObject.put("sud_sdk_trace_id", mlg0.j);
            y6g0Var.success(jSONObject.toString());
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
