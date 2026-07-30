package p149l;

import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkBountyData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class cl70 extends h4t<pn40, PkBountyView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f81374i;

    public cl70(bsm<? extends pn40> bsmVar, PkBountyView pkBountyView) {
        super(bsmVar);
        mo51532C(pkBountyView);
    }

    /* JADX INFO: renamed from: K3 */
    public void m107447K3() {
        ((PkBountyView) this.viewModel).m76277e();
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m107448L3(Long l2) {
        if (l2.longValue() >= 3) {
            ((PkBountyView) this.viewModel).m76283m();
            mkd0.m154992z(this.f81374i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m107449M3(PkBountyData pkBountyData) {
        if (pkBountyData == null) {
            return;
        }
        ((PkBountyView) this.viewModel).m76281k(pkBountyData, false);
        mkd0.m154992z(this.f81374i);
        this.f81374i = m129299H3(((pn40) m206027E2()).m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.bl70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76168a.m107448L3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public void m107450N3(PkData pkData) {
        ((PkBountyView) this.viewModel).m76281k(pkData.getPkBountyData(), true);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f81374i);
        m107447K3();
    }
}
