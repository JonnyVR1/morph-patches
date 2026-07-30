package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes9.dex */
public class mhu extends ahu<LiveVChatCallingView> {

    /* JADX INFO: renamed from: f */
    public l4g0 f136879f;

    /* JADX INFO: renamed from: g */
    public icl0 f136880g;

    public mhu(knu knuVar, LiveVChatCallingView liveVChatCallingView) {
        super(knuVar);
        this.f136880g = new icl0();
        mo52715C(liveVChatCallingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m158428T2(C4470c c4470c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCallingView) v2).m70908j();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f136880g.m139445b();
        lifecycle().filter(new qcj() { // from class: l.khu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.lhu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132143a.m158428T2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public void m158429V2() {
        l4g0 l4g0Var = this.f136879f;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f136879f.m152775j();
            this.f136879f = null;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m158429V2();
        this.f136880g.m139448e();
    }

    /* JADX INFO: renamed from: U2 */
    public void mo151122U2() {
    }
}
