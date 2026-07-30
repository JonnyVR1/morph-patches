package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;

/* JADX INFO: loaded from: classes4.dex */
public class kr50 extends h4t<ho2, OperationEntranceAnimView> {
    public kr50(bsm<ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m146967K3() {
        ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = false;
        m206027E2().m132066G1(BLiveOperation.REFRESH_UNIT);
    }

    /* JADX INFO: renamed from: L3 */
    public void m146968L3(BLiveOperationItem bLiveOperationItem) {
        m206028F2().OperationsEvent.showOperationsItem().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItem).m147256a());
        m129320z3(500L, new Runnable() { // from class: l.jr50
            @Override // java.lang.Runnable
            public final void run() {
                this.f119380a.m146967K3();
            }
        });
    }
}
