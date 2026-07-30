package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class w350 extends x6s<pn40, r350> {

    /* JADX INFO: renamed from: j */
    public final r1k0 f184306j;

    public w350(bsm<? extends pn40> bsmVar) {
        super(bsmVar);
        this.f184306j = new r1k0();
        mo51532C(new r350(this));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        this.f184306j.m177475b();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().OfficialShowCardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.t350
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167592a.m201257Y3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m201254V3() {
        ((pn40) m206027E2()).m132125e0(false, mo77274R2(), "OfficialShowCardDialog", new d30() { // from class: l.v350
            @Override // p149l.d30
            public final void call() {
                this.f179747a.m201255W3();
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m201255W3() {
        ((r350) this.viewModel).m177660K();
        lsi0.m151595y("订阅成功");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m201256X3(BLiveEnvelope bLiveEnvelope) {
        ((r350) this.viewModel).m177661L(bLiveEnvelope.data.officialShowUser);
        this.f184306j.m177477d("p_live_profile", ((pn40) m206027E2()).m149814k(), ((pn40) m206027E2()).mo149813j().anchor.f44419id, mo77274R2(), null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m201257Y3(Boolean bool) {
        duringCreated(LivingNormalApiProvider.m71520m7(((pn40) m206027E2()).m132140j0())).subscribe(ffw.m121193d(new e30() { // from class: l.u350
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173573a.m201256X3((BLiveEnvelope) obj);
            }
        }));
    }
}
