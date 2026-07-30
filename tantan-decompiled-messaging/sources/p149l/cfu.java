package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;

/* JADX INFO: loaded from: classes13.dex */
public class cfu extends zeu<LiveVChatCalledView> {

    /* JADX INFO: renamed from: f */
    public cwf0 f80663f;

    /* JADX INFO: renamed from: g */
    public d3l0 f80664g;

    public cfu(jlu jluVar, LiveVChatCalledView liveVChatCalledView) {
        super(jluVar);
        this.f80664g = new d3l0();
        mo51532C(liveVChatCalledView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public /* synthetic */ void m106600U2(C4319c c4319c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCalledView) v2).m69712q();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f80664g.m109936b();
        lifecycle().filter(new w9j() { // from class: l.afu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.bfu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75353a.m106600U2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public void m106603W2() {
        cwf0 cwf0Var = this.f80663f;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f80663f.m109034j();
            this.f80663f = null;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m106603W2();
        this.f80664g.m109939e();
    }

    /* JADX INFO: renamed from: T2 */
    public void mo106601T2() {
    }

    /* JADX INFO: renamed from: V2 */
    public void mo106602V2() {
    }
}
