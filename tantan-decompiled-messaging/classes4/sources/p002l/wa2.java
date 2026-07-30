package p002l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wa2 extends df2<TreasureBoxView> {

    /* JADX INFO: renamed from: q */
    public final faj0 f21586q;

    public wa2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19839f6, bLiveBottomButton);
        this.f21586q = (faj0) z2(new faj0(bsmVar, this));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("newUserTreasureBoxButton");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(TreasureBoxView treasureBoxView) {
        super.mo11312d4(treasureBoxView);
        int i = xdl0.f;
        treasureBoxView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        treasureBoxView.setIcon(mo11809Z3());
    }

    /* JADX INFO: renamed from: t */
    public void m24450t() {
        super.t();
        this.f21586q.m13037o4();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
    }
}
