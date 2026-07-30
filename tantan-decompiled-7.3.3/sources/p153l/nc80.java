package p153l;

import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesContainerView;

/* JADX INFO: loaded from: classes5.dex */
public class nc80 extends i6t<dw40, PkWinTimesContainerView> {

    /* JADX INFO: renamed from: i */
    public s680 f141323i;

    /* JADX INFO: renamed from: j */
    public boolean f141324j;

    public nc80(dum<? extends dw40> dumVar, s680 s680Var, PkWinTimesContainerView pkWinTimesContainerView) {
        super(dumVar);
        this.f141324j = false;
        this.f141323i = s680Var;
        mo52715C(pkWinTimesContainerView);
    }

    /* JADX INFO: renamed from: J3 */
    public void m162508J3(PkData pkData) {
        if (this.f141324j) {
            return;
        }
        this.f141324j = true;
        if (pkData.showWinTimesTag) {
            if (pkData.getAnchorWinTimes() >= 2) {
                this.f141323i.f166546l.m132514X3();
            }
            ((PkWinTimesContainerView) this.viewModel).m77496c(pkData.getAnchorWinTimes(), pkData.getOtherWinTimes());
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m162509K3() {
        if (this.f141324j) {
            ((PkWinTimesContainerView) this.viewModel).m77498e();
        }
    }

    public void reset() {
        this.f141324j = false;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }
}
