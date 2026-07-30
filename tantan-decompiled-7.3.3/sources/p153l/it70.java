package p153l;

import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkBountyData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class it70 extends i6t<dw40, PkBountyView> {

    /* JADX INFO: renamed from: i */
    public kcg0 f116804i;

    public it70(dum<? extends dw40> dumVar, PkBountyView pkBountyView) {
        super(dumVar);
        mo52715C(pkBountyView);
    }

    /* JADX INFO: renamed from: K3 */
    public void m142017K3() {
        ((PkBountyView) this.viewModel).m77460e();
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m142018L3(Long l2) {
        if (l2.longValue() >= 3) {
            ((PkBountyView) this.viewModel).m77466m();
            psd0.m173633z(this.f116804i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m142019M3(PkBountyData pkBountyData) {
        if (pkBountyData == null) {
            return;
        }
        ((PkBountyView) this.viewModel).m77464k(pkBountyData, false);
        psd0.m173633z(this.f116804i);
        this.f116804i = m138858H3(((dw40) m213810E2()).m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.ht70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111513a.m142018L3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public void m142020N3(PkData pkData) {
        ((PkBountyView) this.viewModel).m77464k(pkData.getPkBountyData(), true);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f116804i);
        m142017K3();
    }
}
