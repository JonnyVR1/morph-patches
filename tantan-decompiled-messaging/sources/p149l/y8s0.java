package p149l;

import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class y8s0 extends unb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f196878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z8s0 f196879b;

    public y8s0(z8s0 z8s0Var, String str) {
        this.f196878a = str;
        this.f196879b = z8s0Var;
    }

    @Override // p149l.unb0
    /* JADX INFO: renamed from: a */
    public final void mo117509a(String str) {
        x2t0.m206869g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            z8s0 z8s0Var = this.f196879b;
            z8s0Var.f202204d.m147847g(z8s0Var.m217626c(this.f196878a, str).toString(), null);
        } catch (JSONException e) {
            x2t0.m206867e("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // p149l.unb0
    /* JADX INFO: renamed from: b */
    public final void mo117510b(tnb0 tnb0Var) {
        String strM189771b = tnb0Var.m189771b();
        try {
            z8s0 z8s0Var = this.f196879b;
            z8s0Var.f202204d.m147847g(z8s0Var.m217627d(this.f196878a, strM189771b).toString(), null);
        } catch (JSONException e) {
            x2t0.m206867e("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
