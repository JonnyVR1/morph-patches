package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedSuperlikeComboView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gnf {
    /* JADX INFO: renamed from: a */
    public static void m6776a(ExpandedSuperlikeComboView expandedSuperlikeComboView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expandedSuperlikeComboView.a = viewGroup.getChildAt(0);
        expandedSuperlikeComboView.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        expandedSuperlikeComboView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        expandedSuperlikeComboView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        expandedSuperlikeComboView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        expandedSuperlikeComboView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        expandedSuperlikeComboView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        expandedSuperlikeComboView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(4);
    }
}
