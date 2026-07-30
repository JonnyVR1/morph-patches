package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.web.p051ab.WebABAct;
import com.p046p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes9.dex */
public class php0 extends hlp0<rhp0> {
    public php0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m169119h0(Bundle bundle) {
        ((rhp0) this.viewModel).m179457U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m169123p0(AuthData authData) {
        ((rhp0) this.viewModel).m179459X(authData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m169124q0(Throwable th) {
        ((rhp0) this.viewModel).m179458W();
    }

    @Override // p149l.hlp0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.mhp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133834a.m169119h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m169125n0() {
        duringCreated(qib0.f154714c0.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.nhp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139012a.m169123p0((AuthData) obj);
            }
        }, new e30() { // from class: l.ohp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144035a.m169124q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public String m169126o0() {
        Act act = act();
        return act != null ? ((WebABAct) act).m29702e2() : "";
    }
}
