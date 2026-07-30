package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.home.views.CardBottomLiteratureMessageLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lh4 {
    /* JADX INFO: renamed from: a */
    public static void m7732a(CardBottomLiteratureMessageLayout cardBottomLiteratureMessageLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLiteratureMessageLayout.c = (LinearLayout) viewGroup.getChildAt(0);
        cardBottomLiteratureMessageLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomLiteratureMessageLayout.e = viewGroup.getChildAt(1);
        cardBottomLiteratureMessageLayout.f = viewGroup.getChildAt(2);
    }
}
