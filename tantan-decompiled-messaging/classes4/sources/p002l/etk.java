package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.areaC.item.GuideGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class etk {
    /* JADX INFO: renamed from: a */
    public static void m12697a(GuideGiftItemView guideGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        guideGiftItemView.f4609a = (BottomViewGroup) viewGroup.getChildAt(0);
        guideGiftItemView.f4610b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        guideGiftItemView.f4611c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        guideGiftItemView.f4612d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        guideGiftItemView.f4613e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        guideGiftItemView.f4614f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        guideGiftItemView.f4615g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        guideGiftItemView.f4616h = viewGroup.getChildAt(1);
    }
}
