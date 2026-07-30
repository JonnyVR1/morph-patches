package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;

/* JADX INFO: loaded from: classes13.dex */
public class lfu extends zeu<LiveVChatCallingView> {

    /* JADX INFO: renamed from: f */
    public cwf0 f127930f;

    /* JADX INFO: renamed from: g */
    public d3l0 f127931g;

    public lfu(jlu jluVar, LiveVChatCallingView liveVChatCallingView) {
        super(jluVar);
        this.f127931g = new d3l0();
        mo51532C(liveVChatCallingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m149745T2(C4319c c4319c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveVChatCallingView) v2).m69725j();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f127931g.m109936b();
        lifecycle().filter(new w9j() { // from class: l.jfu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.kfu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122973a.m149745T2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public void m149746V2() {
        cwf0 cwf0Var = this.f127930f;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f127930f.m109034j();
            this.f127930f = null;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m149746V2();
        this.f127931g.m109939e();
    }

    /* JADX INFO: renamed from: U2 */
    public void mo142754U2() {
    }
}
