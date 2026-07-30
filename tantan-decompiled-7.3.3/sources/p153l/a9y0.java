package p153l;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class a9y0 extends dix0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gtx0 f69088a;

    public a9y0(gtx0 gtx0Var) {
        this.f69088a = gtx0Var;
    }

    @Override // p153l.dix0, p153l.h0z0
    /* JADX INFO: renamed from: D2 */
    public final void mo96615D2(Status status) {
        this.f69088a.setResult(qqw0.m177527a(status));
    }

    @Override // p153l.dix0, p153l.h0z0
    /* JADX INFO: renamed from: q5 */
    public final void mo96616q5(Status status, Credential credential) {
        this.f69088a.setResult(new qqw0(status, credential));
    }
}
