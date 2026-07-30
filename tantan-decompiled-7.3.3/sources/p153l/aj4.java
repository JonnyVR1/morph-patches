package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomExpandedBasicInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomTagExpandedLayout;
import com.p051p1.mobile.putong.core.view.CardLabelShowView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aj4 {
    /* JADX INFO: renamed from: a */
    public static void m98351a(CardBottomTagExpandedLayout cardBottomTagExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomTagExpandedLayout.f24316c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomTagExpandedLayout.f24317d = (CardBottomExpandedBasicInfoView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomTagExpandedLayout.f24318e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomTagExpandedLayout.f24319f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomTagExpandedLayout.f24320g = (CardLabelShowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
