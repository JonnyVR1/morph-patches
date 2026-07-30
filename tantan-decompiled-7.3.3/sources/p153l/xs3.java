package p153l;

import android.view.View;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;

/* JADX INFO: loaded from: classes4.dex */
public class xs3 extends tz0 {

    /* JADX INFO: renamed from: y */
    public boolean f196056y;

    public xs3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, obc0.f146309d7, str2);
        this.f196056y = bLiveBottomButton.isClosed;
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        if (!Network.isConnected(zrv.f205803e)) {
            r1j0.m179415b("网络异常");
            return;
        }
        m149350g4();
        boolean z = this.f196056y;
        this.f196056y = !z;
        ((BottomItemView) this.f126232k).m73325c(z, true);
        r1j0.m179420g(this.f196056y ? "已屏蔽其他用户送礼动效" : "已恢复其他用户送礼动效");
        asj.m99927b(this.f196056y);
        ((ifv) zrv.m221194l(htd0.f111523e)).f114702k.put(Boolean.valueOf(this.f196056y));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.giftResourceStatus);
    }

    @Override // p153l.tz0, p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: n4 */
    public void mo108591d4(BottomItemView bottomItemView) {
        super.mo108591d4(bottomItemView);
        bnl0.m105524M(((BottomItemView) this.f126232k).f49333d, true);
        ((BottomItemView) this.f126232k).m73325c(true ^ this.f196056y, false);
        ((ifv) zrv.m221194l(htd0.f111523e)).f114702k.put(Boolean.valueOf(this.f196056y));
    }
}
