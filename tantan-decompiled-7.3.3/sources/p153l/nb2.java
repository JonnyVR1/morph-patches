package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;

/* JADX INFO: loaded from: classes4.dex */
public class nb2 extends fq1 {

    /* JADX INFO: renamed from: s */
    public final zb2 f141068s;

    public nb2(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, obc0.f146380j6, bLiveBottomButton);
        this.f141068s = (zb2) m153103z2(new zb2(dumVar));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        this.f141068s.m219182g4();
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get("settingButton");
    }

    /* JADX INFO: renamed from: j4 */
    public void m162109j4(boolean z) {
        ((RedDotButton) this.f126232k).mo73321g0(z);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().BottomEvent.setSettingButtonRedDot().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.mb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135613a.m162109j4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
