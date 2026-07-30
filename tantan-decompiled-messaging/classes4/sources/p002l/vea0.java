package p002l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.C0108b;
import com.p1.mobile.putong.core.CoreModule;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.ura;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vea0 extends jq2<C0108b> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f21095a;

    /* JADX INFO: renamed from: b */
    public boolean f21096b;

    public vea0(mcr mcrVar) {
        super(mcrVar);
        this.f21096b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m23894n0(Bundle bundle) {
        m23898j0();
    }

    /* JADX INFO: renamed from: Z */
    public void m23895Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m23896a0() {
        super.a0();
        creates(new e30() { // from class: l.rea0
            public final void call(Object obj) {
                this.f18482a.m23894n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m23897i0() {
        s7m s7mVar = ((jq2) this).viewModel;
        ((C0108b) s7mVar).f1384k.duringCreated(CoreModule.c.B0.P3(((C0108b) s7mVar).m2249n().getTimeInMillis())).subscribe(mkd0.H(new e30() { // from class: l.sea0
            public final void call(Object obj) {
                this.f18951a.m23899k0((roj0) obj);
            }
        }, new e30() { // from class: l.tea0
            public final void call(Object obj) {
                this.f20198a.m23901m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m23898j0() {
        LoopInputType loopInputType = (LoopInputType) ((C0108b) ((jq2) this).viewModel).m2250p().getSerializable("loop_input_type");
        this.f21095a = loopInputType;
        ((C0108b) ((jq2) this).viewModel).m2254v(loopInputType);
        ((C0108b) ((jq2) this).viewModel).f1384k.m2093f5();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m23899k0(roj0 roj0Var) {
        this.f21096b = true;
        ((C0108b) ((jq2) this).viewModel).m2248m();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m23900l0() {
        this.f21096b = true;
        ((C0108b) ((jq2) this).viewModel).m2248m();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m23901m0(Throwable th) {
        ((C0108b) ((jq2) this).viewModel).m2252s();
        if (act().isFinishing()) {
            return;
        }
        ura.e().d().Xs(act(), th, new d30() { // from class: l.uea0
            public final void call() {
                this.f20599a.m23900l0();
            }
        });
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: o0 */
    public void m23902o0(int i, int i2, Intent intent) {
    }
}
