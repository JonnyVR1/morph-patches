package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.visitor.VisitorsFilterBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b8m0 {
    /* JADX INFO: renamed from: a */
    public static void m5700a(VisitorsFilterBar visitorsFilterBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFilterBar.a = (LinearLayout) viewGroup.getChildAt(0);
        visitorsFilterBar.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        visitorsFilterBar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        visitorsFilterBar.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsFilterBar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        visitorsFilterBar.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        visitorsFilterBar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        visitorsFilterBar.h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        visitorsFilterBar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        visitorsFilterBar.j = viewGroup.getChildAt(2);
    }
}
