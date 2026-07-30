package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes9.dex */
public class u0c extends hlp0<v0c> {
    public u0c(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m191332h0(Bundle bundle) {
        ((v0c) this.viewModel).m196485R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m191336o0(AuthData authData) {
        ((v0c) this.viewModel).m196491X(authData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m191337p0(Throwable th) {
        ((v0c) this.viewModel).m196490W();
    }

    @Override // p149l.hlp0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.t0c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167142a.m191332h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m191338n0() {
        duringCreated(CoreModule.m29931H().accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.r0c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157162a.m191336o0((AuthData) obj);
            }
        }, new e30() { // from class: l.s0c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161765a.m191337p0((Throwable) obj);
            }
        }));
    }
}
