package p149l;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class uzx0 extends x8x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ akx0 f179042a;

    public uzx0(akx0 akx0Var) {
        this.f179042a = akx0Var;
    }

    @Override // p149l.x8x0, p149l.bry0
    /* JADX INFO: renamed from: D2 */
    public final void mo103604D2(Status status) {
        this.f179042a.setResult(khw0.m146023a(status));
    }

    @Override // p149l.x8x0, p149l.bry0
    /* JADX INFO: renamed from: q5 */
    public final void mo103606q5(Status status, Credential credential) {
        this.f179042a.setResult(new khw0(status, credential));
    }
}
