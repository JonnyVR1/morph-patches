package p149l;

import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class u04 extends a44 {

    /* JADX INFO: renamed from: k */
    public g14 f172842k;

    /* JADX INFO: renamed from: l */
    public Dialog f172843l;

    public u04(bsm bsmVar, w6d0 w6d0Var) {
        super(bsmVar, w6d0Var);
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: X3 */
    public void mo94781X3() {
        super.mo94781X3();
        ((o34) this.viewModel).m162402n();
        this.f172843l = act().dialog().m20503E0(R$string.f47203e1).m20556t0(R$string.f47577v2, new Runnable() { // from class: l.t04
            @Override // java.lang.Runnable
            public final void run() {
                this.f167098a.m191284o4();
            }
        }).m20541k0(R$string.f46842N1).m20568z0();
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: j4 */
    public void mo94793j4() {
        super.mo94793j4();
        mo94776S3();
        if (this.f172842k == null) {
            this.f172842k = new g14(this, ((w6d0) this.f67440j).f184830l);
        }
        this.f172842k.m124053d();
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: k4 */
    public void mo94794k4(BLiveCall bLiveCall, i54 i54Var) {
        super.mo94794k4(bLiveCall, i54Var);
        m191285p4(bLiveCall);
    }

    @Override // p149l.a44
    /* JADX INFO: renamed from: l4 */
    public void mo94795l4() {
        ((zwl) m129297F3(new tt00(4400))).mo185824f();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        uep0.m193327n(this.f172843l);
        g14 g14Var = this.f172842k;
        if (g14Var != null) {
            g14Var.m124051b();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m191284o4() {
        m94796m4(this.f67439i);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m191285p4(BLiveCall bLiveCall) {
        if (v44.m196943k(bLiveCall) && v44.m196940h(bLiveCall)) {
            ((o34) this.viewModel).m162398F(true);
        } else {
            ((o34) this.viewModel).m162398F(false);
        }
    }
}
