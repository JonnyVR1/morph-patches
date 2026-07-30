package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.views.CardBottomProfileExpandedLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ai4 {
    /* JADX INFO: renamed from: a */
    public static void m5384a(CardBottomProfileExpandedLayout cardBottomProfileExpandedLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomProfileExpandedLayout.c = (FrameLayout) viewGroup.getChildAt(0);
        cardBottomProfileExpandedLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomProfileExpandedLayout.e = (FrameLayout) viewGroup.getChildAt(1);
        cardBottomProfileExpandedLayout.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
