package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class eor0 extends unb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f92492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ouh0 f92493b;

    public eor0(ouh0 ouh0Var, String str) {
        this.f92492a = str;
        this.f92493b = ouh0Var;
    }

    @Override // p149l.unb0
    /* JADX INFO: renamed from: a */
    public final void mo117509a(String str) {
        x2t0.m206869g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.f92493b.f145698b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f92492a, str), null);
    }

    @Override // p149l.unb0
    /* JADX INFO: renamed from: b */
    public final void mo117510b(tnb0 tnb0Var) {
        String str;
        String strM189771b = tnb0Var.m189771b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f92492a);
            jSONObject.put("signal", strM189771b);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f92492a, tnb0Var.m189771b());
        }
        this.f92493b.f145698b.evaluateJavascript(str, null);
    }
}
