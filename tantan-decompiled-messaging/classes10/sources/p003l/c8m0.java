package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemAgeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c8m0 {
    /* JADX INFO: renamed from: a */
    public static void m5870a(VisitorsFilterItemAgeView visitorsFilterItemAgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFilterItemAgeView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsFilterItemAgeView.b = viewGroup.getChildAt(1);
    }
}
