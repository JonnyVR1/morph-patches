package p153l;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class meg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f136497a;

    public meg0(wyg0 wyg0Var) {
        this.f136497a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        jpg0 jpg0Var = jpg0.f122099f;
        Context context = this.f136497a.f191641b;
        jpg0Var.getClass();
        int iM146497a = jpg0.m146497a(context);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("net_type", iM146497a);
            gfg0Var.success(jSONObject.toString());
        } catch (Exception e) {
            gfg0Var.failure(oeg0.m167367b(e.toString()));
        }
    }
}
