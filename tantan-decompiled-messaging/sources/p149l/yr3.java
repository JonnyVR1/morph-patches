package p149l;

import android.view.View;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;

/* JADX INFO: loaded from: classes4.dex */
public class yr3 extends mz0 {

    /* JADX INFO: renamed from: y */
    public boolean f199626y;

    public yr3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3c0.f110981d7, str2);
        this.f199626y = bLiveBottomButton.isClosed;
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        if (!Network.isConnected(ypv.f199497e)) {
            osi0.m165778b("网络异常");
            return;
        }
        m111423g4();
        boolean z = this.f199626y;
        this.f199626y = !z;
        ((BottomItemView) this.f85887k).m72142c(z, true);
        osi0.m165783g(this.f199626y ? "已屏蔽其他用户送礼动效" : "已恢复其他用户送礼动效");
        kpj.m146871b(this.f199626y);
        ((hdv) ypv.m215673l(fld0.f98150e)).f107305k.put(Boolean.valueOf(this.f199626y));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.giftResourceStatus);
    }

    @Override // p149l.mz0, p149l.i80, p149l.df2
    /* JADX INFO: renamed from: n4 */
    public void mo108215d4(BottomItemView bottomItemView) {
        super.mo108215d4(bottomItemView);
        xdl0.m208344M(((BottomItemView) this.f85887k).f48485d, true);
        ((BottomItemView) this.f85887k).m72142c(true ^ this.f199626y, false);
        ((hdv) ypv.m215673l(fld0.f98150e)).f107305k.put(Boolean.valueOf(this.f199626y));
    }
}
