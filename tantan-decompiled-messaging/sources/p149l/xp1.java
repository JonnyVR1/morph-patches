package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BlackDiamondBottomView;

/* JADX INFO: loaded from: classes4.dex */
public class xp1 extends df2<BlackDiamondBottomView> {
    public xp1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168492r, bLiveBottomButton);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m111420c4();
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get("diamond");
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(BlackDiamondBottomView blackDiamondBottomView) {
        super.mo108215d4(blackDiamondBottomView);
        blackDiamondBottomView.setLayoutParams(new LinearLayout.LayoutParams(df2.f85884o, df2.f85885p));
        if (TextUtils.isEmpty(mo111417Z3())) {
            return;
        }
        hxs.m133398k("context_livingAct", blackDiamondBottomView.f48475b, mo111417Z3());
    }
}
