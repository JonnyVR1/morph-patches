package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.fld0;
import l.hdv;
import l.osi0;
import l.xdl0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yr3 extends mz0 {

    /* JADX INFO: renamed from: y */
    public boolean f23055y;

    public yr3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3c0.f12766d7, str2);
        this.f23055y = bLiveBottomButton.isClosed;
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        if (!Network.isConnected(ypv.e)) {
            osi0.b("网络异常");
            return;
        }
        m11815g4();
        boolean z = this.f23055y;
        this.f23055y = !z;
        ((BottomItemView) this.f9196k).m5615c(z, true);
        osi0.g(this.f23055y ? "已屏蔽其他用户送礼动效" : "已恢复其他用户送礼动效");
        kpj.m16734b(this.f23055y);
        ((hdv) ypv.l(fld0.e)).k.put(Boolean.valueOf(this.f23055y));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("giftResourceStatus");
    }

    @Override // p002l.mz0, p002l.i80, p002l.df2
    /* JADX INFO: renamed from: n4 */
    public void mo11312d4(BottomItemView bottomItemView) {
        super.mo11312d4(bottomItemView);
        xdl0.M(((BottomItemView) this.f9196k).f4527d, true);
        ((BottomItemView) this.f9196k).m5615c(true ^ this.f23055y, false);
        ((hdv) ypv.l(fld0.e)).k.put(Boolean.valueOf(this.f23055y));
    }
}
