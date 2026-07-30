package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterBar;
import p151v.VCheckBox;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class fhm0 {
    /* JADX INFO: renamed from: a */
    public static void m125581a(VisitorsFilterBar visitorsFilterBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFilterBar.f38925a = (LinearLayout) viewGroup.getChildAt(0);
        visitorsFilterBar.f38926b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        visitorsFilterBar.f38927c = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        visitorsFilterBar.f38928d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsFilterBar.f38929e = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        visitorsFilterBar.f38930f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        visitorsFilterBar.f38931g = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        visitorsFilterBar.f38932h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        visitorsFilterBar.f38933i = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        visitorsFilterBar.f38934j = (VRecyclerView) viewGroup.getChildAt(2);
    }
}
