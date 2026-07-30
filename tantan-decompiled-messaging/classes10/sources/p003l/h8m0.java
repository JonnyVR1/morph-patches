package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemDistanceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h8m0 {
    /* JADX INFO: renamed from: a */
    public static void m6932a(VisitorsFilterItemDistanceView visitorsFilterItemDistanceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFilterItemDistanceView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsFilterItemDistanceView.b = viewGroup.getChildAt(1);
    }
}
