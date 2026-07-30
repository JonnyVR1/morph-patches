package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.areaC.item.GuideGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uvk {
    /* JADX INFO: renamed from: a */
    public static void m198265a(GuideGiftItemView guideGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        guideGiftItemView.f49415a = (BottomViewGroup) viewGroup.getChildAt(0);
        guideGiftItemView.f49416b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        guideGiftItemView.f49417c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        guideGiftItemView.f49418d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        guideGiftItemView.f49419e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        guideGiftItemView.f49420f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        guideGiftItemView.f49421g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        guideGiftItemView.f49422h = (VText) viewGroup.getChildAt(1);
    }
}
