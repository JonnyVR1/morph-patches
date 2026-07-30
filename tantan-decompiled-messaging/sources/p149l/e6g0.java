package p149l;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e6g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f89574a;

    public e6g0(oqg0 oqg0Var) {
        this.f89574a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        bhg0 bhg0Var = bhg0.f75610f;
        Context context = this.f89574a.f145139b;
        bhg0Var.getClass();
        int iM101834a = bhg0.m101834a(context);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("net_type", iM101834a);
            y6g0Var.success(jSONObject.toString());
        } catch (Exception e) {
            y6g0Var.failure(g6g0.m124590b(e.toString()));
        }
    }
}
