package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.views.CardBottomDefaultExpandedLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vg4 {
    /* JADX INFO: renamed from: a */
    public static void m10224a(CardBottomDefaultExpandedLayout cardBottomDefaultExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomDefaultExpandedLayout.c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomDefaultExpandedLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomDefaultExpandedLayout.e = viewGroup.getChildAt(1);
        cardBottomDefaultExpandedLayout.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomDefaultExpandedLayout.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomDefaultExpandedLayout.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomDefaultExpandedLayout.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomDefaultExpandedLayout.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomDefaultExpandedLayout.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
