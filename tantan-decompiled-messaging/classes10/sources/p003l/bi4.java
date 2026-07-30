package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.view.CardLabelShowView;
import com.p1.mobile.putong.core.newui.home.views.CardBottomTagExpandedLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bi4 {
    /* JADX INFO: renamed from: a */
    public static void m5722a(CardBottomTagExpandedLayout cardBottomTagExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomTagExpandedLayout.c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomTagExpandedLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomTagExpandedLayout.e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomTagExpandedLayout.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomTagExpandedLayout.g = (CardLabelShowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
