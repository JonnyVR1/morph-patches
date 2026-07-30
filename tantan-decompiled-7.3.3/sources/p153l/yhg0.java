package p153l;

import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yhg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f199965a;

    public yhg0(wyg0 wyg0Var) {
        this.f199965a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("user_id", this.f199965a.f191643d);
            jSONObject.put("room_id", this.f199965a.f191644e);
            jSONObject.put("mg_id", this.f199965a.f191646g);
            jSONObject.put("mg_id_str", String.valueOf(this.f199965a.f191646g));
            jSONObject.put("code", this.f199965a.f191645f);
            jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, utg0.f180952g);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", utg0.m198036d());
            jSONObject.put("sud_sdk_trace_id", utg0.f180955j);
            gfg0Var.success(jSONObject.toString());
        } catch (Exception unused) {
            gfg0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
