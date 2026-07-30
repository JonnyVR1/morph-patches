package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class gt3 extends tz0 {
    public gt3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, obc0.f146450p4, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m132196p4(vxj0 vxj0Var) {
        mo119794b4(false);
    }

    @Override // p153l.kf2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.hideGiftPacket().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ft3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100712a.m132196p4((vxj0) obj);
            }
        }));
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(2700).m103154e(this.f126233l.url).m103152c());
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket);
    }
}
