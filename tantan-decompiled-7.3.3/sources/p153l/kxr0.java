package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kxr0 extends yvb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f129230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w2i0 f129231b;

    public kxr0(w2i0 w2i0Var, String str) {
        this.f129230a = str;
        this.f129231b = w2i0Var;
    }

    @Override // p153l.yvb0
    /* JADX INFO: renamed from: a */
    public final void mo120943a(String str) {
        dct0.m115298g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.f129231b.f186902b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f129230a, str), null);
    }

    @Override // p153l.yvb0
    /* JADX INFO: renamed from: b */
    public final void mo120944b(xvb0 xvb0Var) {
        String str;
        String strM213215b = xvb0Var.m213215b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f129230a);
            jSONObject.put("signal", strM213215b);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f129230a, xvb0Var.m213215b());
        }
        this.f129231b.f186902b.evaluateJavascript(str, null);
    }
}
