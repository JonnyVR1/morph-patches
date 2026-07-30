package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class ei4 {
    /* JADX INFO: renamed from: a */
    public static void m120879a(CardBottomIntlComplimentReceivedLayout cardBottomIntlComplimentReceivedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlComplimentReceivedLayout.f24215c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f24216d = (VLinear) viewGroup.getChildAt(1);
        cardBottomIntlComplimentReceivedLayout.f24217e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f24218f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f24219g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardBottomIntlComplimentReceivedLayout.f24220h = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        cardBottomIntlComplimentReceivedLayout.f24221i = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        cardBottomIntlComplimentReceivedLayout.f24222j = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
