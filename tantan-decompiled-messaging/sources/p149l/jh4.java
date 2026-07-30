package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLastMomentExpandedLayout;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jh4 {
    /* JADX INFO: renamed from: a */
    public static void m141484a(CardBottomLastMomentExpandedLayout cardBottomLastMomentExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLastMomentExpandedLayout.f23500c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomLastMomentExpandedLayout.f23501d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f23502e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomLastMomentExpandedLayout.f23503f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f23504g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f23505h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f23506i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomLastMomentExpandedLayout.f23507j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f23508k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        cardBottomLastMomentExpandedLayout.f23509l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
    }
}
