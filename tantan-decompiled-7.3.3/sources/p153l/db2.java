package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;

/* JADX INFO: loaded from: classes4.dex */
public class db2 extends kf2<TreasureBoxView> {

    /* JADX INFO: renamed from: q */
    public final jjj0 f85961q;

    public db2(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f199075f6, bLiveBottomButton);
        this.f85961q = (jjj0) m153103z2(new jjj0(dumVar, this));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.newUserTreasureBoxButton);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(TreasureBoxView treasureBoxView) {
        super.mo108591d4(treasureBoxView);
        int i = bnl0.f77545f;
        treasureBoxView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        treasureBoxView.setIcon(mo119793Z3());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f85961q.m145061o4();
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
    }
}
