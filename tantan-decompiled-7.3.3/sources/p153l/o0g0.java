package p153l;

import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSkinConfig;

/* JADX INFO: loaded from: classes9.dex */
public class o0g0 extends dvs<s0g0> {
    public o0g0(ner nerVar, nus nusVar, s0g0 s0g0Var) {
        super(nerVar, nusVar);
        mo52715C(s0g0Var);
        if (getAct() instanceof PutongAct) {
            ((PutongAct) getAct()).setTransparentStatusBar();
        }
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: M2 */
    public void mo160242M2() {
        super.mo160242M2();
        m113231o2(t4u.m189320i(), false).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.i0g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(tbs.f172989b.m203605d7());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.j0g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117824a.m165488V2((Boolean) obj);
            }
        }));
        m113231o2(tbs.f172989b.m159275l(false), false).filter(new qcj() { // from class: l.k0g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveSettings bLiveSettings = (BLiveSettings) obj;
                return Boolean.valueOf((bLiveSettings == null || bLiveSettings.liveSkinConfig == null) ? false : true);
            }
        }).map(new qcj() { // from class: l.l0g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSettings) obj).liveSkinConfig;
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.m0g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134311a.m165489W2((BLiveSkinConfig) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.n0g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139627a.m165490X2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m165488V2(Boolean bool) {
        ((s0g0) this.viewModel).m183944k(bool.booleanValue());
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m165489W2(BLiveSkinConfig bLiveSkinConfig) {
        ((s0g0) this.viewModel).m183947n(bLiveSkinConfig);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m165490X2(String str) {
        ((s0g0) this.viewModel).m183945l("fakeLiveSquare".equals(str));
    }
}
