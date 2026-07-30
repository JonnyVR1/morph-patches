package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class dpi0 extends ar2<ipi0> {
    public dpi0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m117377f0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m117379h0(Bundle bundle) {
        ((ipi0) this.viewModel).m141478r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m117380i0(vg60 vg60Var) {
        if (vg60Var != null) {
            ((ipi0) this.viewModel).m141477j(vg60Var.f184001a);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.api0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72725a.m117379h0((Bundle) obj);
            }
        });
        act().duringCreated(CoreModule.f18264c.f20384f0.m33931df()).subscribe(psd0.m173597H(new y20() { // from class: l.bpi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77782a.m117380i0((vg60) obj);
            }
        }, new y20() { // from class: l.cpi0
            @Override // p153l.y20
            public final void call(Object obj) {
                dpi0.m117377f0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
