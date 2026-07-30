package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView;

/* JADX INFO: loaded from: classes4.dex */
public class x6j0 {
    /* JADX INFO: renamed from: a */
    public static void m209505a(TopSVGAEffectView topSVGAEffectView, View view) {
        topSVGAEffectView.f50873a = (TopSVGAEffectView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topSVGAEffectView.f50874b = (AnimEffectPlayer) viewGroup.getChildAt(0);
        topSVGAEffectView.f50875c = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
