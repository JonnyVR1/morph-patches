package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class lc50 extends y8s<dw40, gc50> {

    /* JADX INFO: renamed from: j */
    public final xak0 f131275j;

    public lc50(dum<? extends dw40> dumVar) {
        super(dumVar);
        this.f131275j = new xak0();
        mo52715C(new gc50(this));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        this.f131275j.m209863b();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().OfficialShowCardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ic50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114283a.m153637Y3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m153634V3() {
        ((dw40) m213810E2()).m168511e0(false, mo78457R2(), "OfficialShowCardDialog", new x20() { // from class: l.kc50
            @Override // p153l.x20
            public final void call() {
                this.f125025a.m153635W3();
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m153635W3() {
        ((gc50) this.viewModel).m129858K();
        o1j0.m165651y("订阅成功");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m153636X3(BLiveEnvelope bLiveEnvelope) {
        ((gc50) this.viewModel).m129859L(bLiveEnvelope.data.officialShowUser);
        this.f131275j.m209865d("p_live_profile", ((dw40) m213810E2()).m202191k(), ((dw40) m213810E2()).mo183435j().anchor.f45267id, mo78457R2(), null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m153637Y3(Boolean bool) {
        duringCreated(LivingNormalApiProvider.m72703m7(((dw40) m213810E2()).m168526j0())).subscribe(dhw.m115825d(new y20() { // from class: l.jc50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120022a.m153636X3((BLiveEnvelope) obj);
            }
        }));
    }
}
