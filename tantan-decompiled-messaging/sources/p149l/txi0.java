package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView;

/* JADX INFO: loaded from: classes4.dex */
public class txi0 {
    /* JADX INFO: renamed from: a */
    public static void m190960a(TopSVGAEffectView topSVGAEffectView, View view) {
        topSVGAEffectView.f50025a = (TopSVGAEffectView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topSVGAEffectView.f50026b = (AnimEffectPlayer) viewGroup.getChildAt(0);
        topSVGAEffectView.f50027c = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
