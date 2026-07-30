package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;

/* JADX INFO: loaded from: classes4.dex */
public class wa2 extends df2<TreasureBoxView> {

    /* JADX INFO: renamed from: q */
    public final faj0 f185423q;

    public wa2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168343f6, bLiveBottomButton);
        this.f185423q = (faj0) m144512z2(new faj0(bsmVar, this));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.newUserTreasureBoxButton);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(TreasureBoxView treasureBoxView) {
        super.mo108215d4(treasureBoxView);
        int i = xdl0.f192404f;
        treasureBoxView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        treasureBoxView.setIcon(mo111417Z3());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f185423q.m120215o4();
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
    }
}
