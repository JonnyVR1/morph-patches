package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.areaC.item.GuideGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class etk {
    /* JADX INFO: renamed from: a */
    public static void m118127a(GuideGiftItemView guideGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        guideGiftItemView.f48567a = (BottomViewGroup) viewGroup.getChildAt(0);
        guideGiftItemView.f48568b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        guideGiftItemView.f48569c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        guideGiftItemView.f48570d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        guideGiftItemView.f48571e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        guideGiftItemView.f48572f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        guideGiftItemView.f48573g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        guideGiftItemView.f48574h = (VText) viewGroup.getChildAt(1);
    }
}
