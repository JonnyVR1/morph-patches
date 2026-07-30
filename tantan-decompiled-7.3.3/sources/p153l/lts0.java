package p153l;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lts0 {
    /* JADX INFO: renamed from: a */
    public static void m155807a(mts0 mts0Var, String str, Map map) {
        try {
            mts0Var.mo13759q(str, k6s0.m148569b().m167056k(map));
        } catch (JSONException unused) {
            dct0.m115298g("Could not convert parameters to JSON.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m155808b(mts0 mts0Var, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        dct0.m115293b("Dispatching AFMA event: ".concat(sb.toString()));
        mts0Var.zza(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m155809c(mts0 mts0Var, String str, String str2) {
        mts0Var.zza(str + "(" + str2 + ");");
    }

    /* JADX INFO: renamed from: d */
    public static void m155810d(mts0 mts0Var, String str, JSONObject jSONObject) {
        mts0Var.mo13731b(str, jSONObject.toString());
    }
}
