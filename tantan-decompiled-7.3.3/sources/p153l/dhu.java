package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;

/* JADX INFO: loaded from: classes9.dex */
public class dhu extends ahu<LiveVChatCalledView> {

    /* JADX INFO: renamed from: f */
    public l4g0 f88552f;

    /* JADX INFO: renamed from: g */
    public icl0 f88553g;

    public dhu(knu knuVar, LiveVChatCalledView liveVChatCalledView) {
        super(knuVar);
        this.f88553g = new icl0();
        mo52715C(liveVChatCalledView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m115818U2(C4470c c4470c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCalledView) v2).m70895q();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f88553g.m139445b();
        lifecycle().filter(new qcj() { // from class: l.bhu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.chu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81863a.m115818U2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public void m115821W2() {
        l4g0 l4g0Var = this.f88552f;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f88552f.m152775j();
            this.f88552f = null;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m115821W2();
        this.f88553g.m139448e();
    }

    /* JADX INFO: renamed from: T2 */
    public void mo115819T2() {
    }

    /* JADX INFO: renamed from: V2 */
    public void mo115820V2() {
    }
}
