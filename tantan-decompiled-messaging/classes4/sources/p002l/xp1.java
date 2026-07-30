package p002l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BlackDiamondBottomView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.hxs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xp1 extends df2<BlackDiamondBottomView> {
    public xp1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19988r, bLiveBottomButton);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m11812c4();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("diamond");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(BlackDiamondBottomView blackDiamondBottomView) {
        super.mo11312d4(blackDiamondBottomView);
        blackDiamondBottomView.setLayoutParams(new LinearLayout.LayoutParams(df2.f9193o, df2.f9194p));
        if (TextUtils.isEmpty(mo11809Z3())) {
            return;
        }
        hxs.k("context_livingAct", blackDiamondBottomView.f4517b, mo11809Z3());
    }
}
