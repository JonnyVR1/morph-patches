package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BlackDiamondBottomView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class y33 {
    /* JADX INFO: renamed from: a */
    public static void m214114a(BlackDiamondBottomView blackDiamondBottomView, View view) {
        blackDiamondBottomView.f49322a = (BlackDiamondBottomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        blackDiamondBottomView.f49323b = (VDraweeView) viewGroup.getChildAt(0);
        blackDiamondBottomView.f49324c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        blackDiamondBottomView.f49325d = viewGroup.getChildAt(2);
    }
}
