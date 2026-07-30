package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.lsi0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w350 extends x6s<pn40, r350> {

    /* JADX INFO: renamed from: j */
    public final r1k0 f21431j;

    public w350(bsm<? extends pn40> bsmVar) {
        super(bsmVar);
        this.f21431j = new r1k0();
        C(new r350(this));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        this.f21431j.m21730b();
    }

    /* JADX INFO: renamed from: T */
    public void m24301T() {
        super.T();
        duringCreated((c) m25548F2().OfficialShowCardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.t350
            public final void call(Object obj) {
                this.f19408a.m24305Y3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m24302V3() {
        ((pn40) m25547E2()).m14561e0(false, mo21430R2(), "OfficialShowCardDialog", new d30() { // from class: l.v350
            public final void call() {
                this.f20939a.m24303W3();
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m24303W3() {
        ((r350) ((bwr) this).viewModel).m21764K();
        lsi0.y("订阅成功");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m24304X3(BLiveEnvelope bLiveEnvelope) {
        ((r350) ((bwr) this).viewModel).m21765L(bLiveEnvelope.data.officialShowUser);
        this.f21431j.m21732d("p_live_profile", ((pn40) m25547E2()).m17235k(), ((pn40) m25547E2()).m17234j().anchor.id, mo21430R2(), null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m24305Y3(Boolean bool) {
        duringCreated(LivingNormalApiProvider.m4886m7(((pn40) m25547E2()).m14576j0())).subscribe(ffw.d(new e30() { // from class: l.u350
            public final void call(Object obj) {
                this.f20475a.m24304X3((BLiveEnvelope) obj);
            }
        }));
    }
}
