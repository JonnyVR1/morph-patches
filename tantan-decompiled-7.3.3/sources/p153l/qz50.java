package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;

/* JADX INFO: loaded from: classes4.dex */
public class qz50 extends i6t<oo2, OperationEntranceAnimView> {
    public qz50(dum<oo2> dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m178763K3() {
        ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = false;
        m213810E2().m168455G1(BLiveOperation.REFRESH_UNIT);
    }

    /* JADX INFO: renamed from: L3 */
    public void m178764L3(BLiveOperationItem bLiveOperationItem) {
        m213811F2().OperationsEvent.showOperationsItem().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItem).m175002a());
        m138879z3(500L, new Runnable() { // from class: l.pz50
            @Override // java.lang.Runnable
            public final void run() {
                this.f154721a.m178763K3();
            }
        });
    }
}
