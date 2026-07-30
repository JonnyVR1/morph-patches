package p003l;

import l.fcg0;
import l.njg0;
import l.y6g0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class jng0 implements njg0 {
    /* JADX INFO: renamed from: a */
    public final void m5413a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            fcg0.a = new JSONObject(str4).getBoolean("debug");
            y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
