package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedIdealGuideLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tmf {
    /* JADX INFO: renamed from: a */
    public static void m9592a(ExpandedIdealGuideLayout expandedIdealGuideLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expandedIdealGuideLayout.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        expandedIdealGuideLayout.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        expandedIdealGuideLayout.c = viewGroup.getChildAt(1);
    }
}
