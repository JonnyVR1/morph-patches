package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.AuthData;
import l.e30;
import l.hlp0;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u0c extends hlp0<v0c> {
    public u0c(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m24890h0(Bundle bundle) {
        ((jq2) this).viewModel.m25647R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m24894o0(AuthData authData) {
        ((jq2) this).viewModel.m25653X(authData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m24895p0(Throwable th) {
        ((jq2) this).viewModel.m25652W();
    }

    /* JADX INFO: renamed from: a0 */
    public void m24896a0() {
        super.a0();
        creates(new e30() { // from class: l.t0c
            public final void call(Object obj) {
                this.f21795a.m24890h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m24897n0() {
        duringCreated(CoreModule.m1850H().accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.r0c
            public final void call(Object obj) {
                this.f20216a.m24894o0((AuthData) obj);
            }
        }, new e30() { // from class: l.s0c
            public final void call(Object obj) {
                this.f20968a.m24895p0((Throwable) obj);
            }
        }));
    }
}
