package p003l;

import l.njg0;
import l.y6g0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class kkg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f4968a;

    public kkg0(oqg0 oqg0Var) {
        this.f4968a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5696a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            String str5 = (String) this.f4968a.f6215l.get(new JSONObject(str4).getString("state"));
            if (str5 == null) {
                str5 = "{}";
            }
            y6g0Var.success(str5);
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
