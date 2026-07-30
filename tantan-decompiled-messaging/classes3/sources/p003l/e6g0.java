package p003l;

import android.content.Context;
import l.bhg0;
import l.g6g0;
import l.njg0;
import l.y6g0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class e6g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f3206a;

    public e6g0(oqg0 oqg0Var) {
        this.f3206a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3797a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        bhg0 bhg0Var = bhg0.f;
        Context context = this.f3206a.f6205b;
        bhg0Var.getClass();
        int iA = bhg0.a(context);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("net_type", iA);
            y6g0Var.success(jSONObject.toString());
        } catch (Exception e) {
            y6g0Var.failure(g6g0.b(e.toString()));
        }
    }
}
