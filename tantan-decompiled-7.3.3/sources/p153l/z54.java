package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class z54 extends i6t<oo2, c64> {
    public z54(dum dumVar) {
        super(dumVar);
        mo52715C(new c64());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m218623L3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public void m218625R3(String str) {
        m218628P3(str);
        ((c64) this.viewModel).m108101k();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m218626N3(BLiveCallSummary bLiveCallSummary) {
        ((c64) this.viewModel).m108100j(bLiveCallSummary);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m218627O3(String str) {
        return Boolean.valueOf(!((c64) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: P3 */
    public void m218628P3(String str) {
        duringCreated(LivingNormalApiProvider.m72510R3(str)).subscribe(dhw.m115826e(new y20() { // from class: l.x54
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192454a.m218626N3((BLiveCallSummary) obj);
            }
        }, new y20() { // from class: l.y54
            @Override // p153l.y20
            public final void call(Object obj) {
                z54.m218623L3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().CallEvent.callSummary().m199270g()).filter(new qcj() { // from class: l.v54
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f182475a.m218627O3((String) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.w54
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187478a.m218625R3((String) obj);
            }
        }));
    }
}
