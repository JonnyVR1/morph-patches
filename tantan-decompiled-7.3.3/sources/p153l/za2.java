package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class za2 extends fq1 {
    public za2(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, obc0.f146368i6, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m219098k4(vxj0 vxj0Var) {
        mo119794b4(false);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m149347c4();
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().BottomEvent.hideGiftPacket().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ya2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198147a.m219098k4((vxj0) obj);
            }
        }));
    }
}
