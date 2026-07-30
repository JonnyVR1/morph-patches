package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomDefaultExpandedLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedProfileItemView;
import com.p051p1.mobile.putong.core.newui.home.views.IconTextView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uh4 {
    /* JADX INFO: renamed from: a */
    public static void m196025a(CardBottomDefaultExpandedLayout cardBottomDefaultExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomDefaultExpandedLayout.f24191c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomDefaultExpandedLayout.f24192d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f24193e = (VLinear) viewGroup.getChildAt(1);
        cardBottomDefaultExpandedLayout.f24194f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f24195g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f24196h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomDefaultExpandedLayout.f24197i = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomDefaultExpandedLayout.f24198j = (IconTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomDefaultExpandedLayout.f24199k = (CardBottomExpandedProfileItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
