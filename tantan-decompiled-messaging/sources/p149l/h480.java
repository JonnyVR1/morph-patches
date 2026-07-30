package p149l;

import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesContainerView;

/* JADX INFO: loaded from: classes5.dex */
public class h480 extends h4t<pn40, PkWinTimesContainerView> {

    /* JADX INFO: renamed from: i */
    public my70 f105816i;

    /* JADX INFO: renamed from: j */
    public boolean f105817j;

    public h480(bsm<? extends pn40> bsmVar, my70 my70Var, PkWinTimesContainerView pkWinTimesContainerView) {
        super(bsmVar);
        this.f105817j = false;
        this.f105816i = my70Var;
        mo51532C(pkWinTimesContainerView);
    }

    /* JADX INFO: renamed from: J3 */
    public void m129232J3(PkData pkData) {
        if (this.f105817j) {
            return;
        }
        this.f105817j = true;
        if (pkData.showWinTimesTag) {
            if (pkData.getAnchorWinTimes() >= 2) {
                this.f105816i.f136262l.m97737X3();
            }
            ((PkWinTimesContainerView) this.viewModel).m76313c(pkData.getAnchorWinTimes(), pkData.getOtherWinTimes());
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m129233K3() {
        if (this.f105817j) {
            ((PkWinTimesContainerView) this.viewModel).m76315e();
        }
    }

    public void reset() {
        this.f105817j = false;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }
}
