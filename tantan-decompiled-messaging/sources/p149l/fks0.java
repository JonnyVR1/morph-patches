package p149l;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fks0 {
    /* JADX INFO: renamed from: a */
    public static void m121889a(gks0 gks0Var, String str, Map map) {
        try {
            gks0Var.mo13705q(str, exr0.m118703b().m134103k(map));
        } catch (JSONException unused) {
            x2t0.m206869g("Could not convert parameters to JSON.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m121890b(gks0 gks0Var, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        x2t0.m206864b("Dispatching AFMA event: ".concat(sb.toString()));
        gks0Var.zza(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m121891c(gks0 gks0Var, String str, String str2) {
        gks0Var.zza(str + "(" + str2 + ");");
    }

    /* JADX INFO: renamed from: d */
    public static void m121892d(gks0 gks0Var, String str, JSONObject jSONObject) {
        gks0Var.mo13677b(str, jSONObject.toString());
    }
}
