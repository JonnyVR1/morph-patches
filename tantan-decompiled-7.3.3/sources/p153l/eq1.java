package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BlackDiamondBottomView;

/* JADX INFO: loaded from: classes4.dex */
public class eq1 extends kf2<BlackDiamondBottomView> {
    public eq1(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f199224r, bLiveBottomButton);
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
        return BLiveButtonType.get("diamond");
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(BlackDiamondBottomView blackDiamondBottomView) {
        super.mo108591d4(blackDiamondBottomView);
        blackDiamondBottomView.setLayoutParams(new LinearLayout.LayoutParams(kf2.f126229o, kf2.f126230p));
        if (TextUtils.isEmpty(mo119793Z3())) {
            return;
        }
        izs.m142860k("context_livingAct", blackDiamondBottomView.f49323b, mo119793Z3());
    }
}
