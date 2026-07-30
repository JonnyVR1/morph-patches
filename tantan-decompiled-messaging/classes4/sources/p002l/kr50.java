package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;
import com.p1.mobile.putong.live.base.data.BLiveOperation;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import l.fld0;
import l.ggv;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kr50 extends h4t<ho2, OperationEntranceAnimView> {
    public kr50(bsm<ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m16769K3() {
        ((ggv) ypv.l(fld0.c)).i = false;
        m25547E2().m14502G1(BLiveOperation.REFRESH_UNIT);
    }

    /* JADX INFO: renamed from: L3 */
    public void m16770L3(BLiveOperationItem bLiveOperationItem) {
        m25548F2().OperationsEvent.showOperationsItem().j(new ku50.C0652a(8100).m16802d(bLiveOperationItem).m16799a());
        m14207z3(500L, new Runnable() { // from class: l.jr50
            @Override // java.lang.Runnable
            public final void run() {
                this.f13993a.m16769K3();
            }
        });
    }
}
