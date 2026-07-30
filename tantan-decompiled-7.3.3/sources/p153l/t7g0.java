package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class t7g0 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public boolean f172428i;

    /* JADX INFO: renamed from: j */
    public boolean f172429j;

    public t7g0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m189570M3(uxj0 uxj0Var) {
        this.f172429j = true;
        m213811F2().LivePusherEvent.notifyPushStreamReady().m199277p();
        nsh0.m164608j(v2t.f182112b, "notifyStreamReady success:");
        this.f172428i = false;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m189571N3(Throwable th) {
        this.f172429j = true;
        m213811F2().LivePusherEvent.notifyPushStreamReady().m199277p();
        nsh0.m164608j(v2t.f182112b, "notifyStreamReady fail");
        this.f172428i = false;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m189572O3(w7g0 w7g0Var) {
        return Boolean.valueOf(this.f172429j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m189573P3() {
        C4470c c4470cLifecycle_ = lifecycle_();
        if (this.f172428i) {
            return;
        }
        if (!NullChecker.m82486a(c4470cLifecycle_) || c4470cLifecycle_.f16274a) {
            this.f172428i = true;
            nsh0.m164608j(v2t.f182112b, "notifyStreamReady start");
            duringCreated(LivingNormalApiProvider.m72783v6(((dw40) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.r7g0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161616a.m189570M3((uxj0) obj);
                }
            }, new y20() { // from class: l.s7g0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166689a.m189571N3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(w7g0.class, new qcj() { // from class: l.q7g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155960a.m189572O3((w7g0) obj);
            }
        });
    }
}
