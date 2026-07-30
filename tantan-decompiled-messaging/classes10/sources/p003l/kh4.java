package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.CardBottomLetterLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kh4 {
    /* JADX INFO: renamed from: a */
    public static void m7598a(CardBottomLetterLayout cardBottomLetterLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLetterLayout.c = viewGroup.getChildAt(0);
        cardBottomLetterLayout.d = viewGroup.getChildAt(1);
        cardBottomLetterLayout.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomLetterLayout.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomLetterLayout.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
