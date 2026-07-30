package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLastMomentExpandedLayout;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ii4 {
    /* JADX INFO: renamed from: a */
    public static void m140049a(CardBottomLastMomentExpandedLayout cardBottomLastMomentExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLastMomentExpandedLayout.f24242c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomLastMomentExpandedLayout.f24243d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f24244e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomLastMomentExpandedLayout.f24245f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f24246g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f24247h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f24248i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomLastMomentExpandedLayout.f24249j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        cardBottomLastMomentExpandedLayout.f24250k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        cardBottomLastMomentExpandedLayout.f24251l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
    }
}
