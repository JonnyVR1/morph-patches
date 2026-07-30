package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BlackDiamondBottomView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class i33 {
    /* JADX INFO: renamed from: a */
    public static void m134145a(BlackDiamondBottomView blackDiamondBottomView, View view) {
        blackDiamondBottomView.f48474a = (BlackDiamondBottomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        blackDiamondBottomView.f48475b = (VDraweeView) viewGroup.getChildAt(0);
        blackDiamondBottomView.f48476c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        blackDiamondBottomView.f48477d = viewGroup.getChildAt(2);
    }
}
