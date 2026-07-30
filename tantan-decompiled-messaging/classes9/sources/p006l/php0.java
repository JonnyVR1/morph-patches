package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.app.web.p003ab.WebABAct;
import com.p1.mobile.putong.data.AuthData;
import l.e30;
import l.hlp0;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class php0 extends hlp0<rhp0> {
    public php0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m21114h0(Bundle bundle) {
        ((jq2) this).viewModel.m22855U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m21118p0(AuthData authData) {
        ((jq2) this).viewModel.m22857X(authData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m21119q0(Throwable th) {
        ((jq2) this).viewModel.m22856W();
    }

    /* JADX INFO: renamed from: a0 */
    public void m21120a0() {
        super.a0();
        creates(new e30() { // from class: l.mhp0
            public final void call(Object obj) {
                this.f16983a.m21114h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m21121n0() {
        duringCreated(qib0.f19805c0.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.nhp0
            public final void call(Object obj) {
                this.f17685a.m21118p0((AuthData) obj);
            }
        }, new e30() { // from class: l.ohp0
            public final void call(Object obj) {
                this.f18241a.m21119q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public String m21122o0() {
        WebABAct webABActAct = act();
        return webABActAct != null ? webABActAct.m1612e2() : "";
    }
}
