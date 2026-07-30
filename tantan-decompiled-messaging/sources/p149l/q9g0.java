package p149l;

import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q9g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f153433a;

    public q9g0(oqg0 oqg0Var) {
        this.f153433a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("user_id", this.f153433a.f145141d);
            jSONObject.put("room_id", this.f153433a.f145142e);
            jSONObject.put("mg_id", this.f153433a.f145144g);
            jSONObject.put("mg_id_str", String.valueOf(this.f153433a.f145144g));
            jSONObject.put("code", this.f153433a.f145143f);
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, mlg0.f134432g);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", mlg0.m155145d());
            jSONObject.put("sud_sdk_trace_id", mlg0.f134435j);
            y6g0Var.success(jSONObject.toString());
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
