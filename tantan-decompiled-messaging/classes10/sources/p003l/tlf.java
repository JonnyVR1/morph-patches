package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tlf {
    /* JADX INFO: renamed from: a */
    public static void m9591a(ExpandedCardInforLayout expandedCardInforLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expandedCardInforLayout.a = viewGroup.getChildAt(0);
        expandedCardInforLayout.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        expandedCardInforLayout.c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        expandedCardInforLayout.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }
}
