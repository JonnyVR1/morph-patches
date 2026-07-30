package p153l;

import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class eis0 extends yvb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f94207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fis0 f94208b;

    public eis0(fis0 fis0Var, String str) {
        this.f94207a = str;
        this.f94208b = fis0Var;
    }

    @Override // p153l.yvb0
    /* JADX INFO: renamed from: a */
    public final void mo120943a(String str) {
        dct0.m115298g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            fis0 fis0Var = this.f94208b;
            fis0Var.f99239d.m218018g(fis0Var.m125717c(this.f94207a, str).toString(), null);
        } catch (JSONException e) {
            dct0.m115296e("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // p153l.yvb0
    /* JADX INFO: renamed from: b */
    public final void mo120944b(xvb0 xvb0Var) {
        String strM213215b = xvb0Var.m213215b();
        try {
            fis0 fis0Var = this.f94208b;
            fis0Var.f99239d.m218018g(fis0Var.m125718d(this.f94207a, strM213215b).toString(), null);
        } catch (JSONException e) {
            dct0.m115296e("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
