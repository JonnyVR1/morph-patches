package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes4.dex */
public class ihe0 extends ar2<dhe0> {
    public ihe0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m139970e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m139973h0(Bundle bundle) {
        ((dhe0) this.viewModel).m115788r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m139974i0(vg60 vg60Var) {
        ((dhe0) this.viewModel).m115787d(vg60Var.f184001a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.fhe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99045a.m139973h0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20384f0.m33589Ap()).subscribe(psd0.m173597H(new y20() { // from class: l.ghe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104118a.m139974i0((vg60) obj);
            }
        }, new y20() { // from class: l.hhe0
            @Override // p153l.y20
            public final void call(Object obj) {
                ihe0.m139970e0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
