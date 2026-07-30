package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.view.CardLabelShowView;
import com.p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ci4 {
    /* JADX INFO: renamed from: a */
    public static void m5950a(CardBottomTagLayout cardBottomTagLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomTagLayout.c = viewGroup.getChildAt(0);
        cardBottomTagLayout.d = viewGroup.getChildAt(1);
        cardBottomTagLayout.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomTagLayout.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomTagLayout.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomTagLayout.h = (CardLabelShowView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
