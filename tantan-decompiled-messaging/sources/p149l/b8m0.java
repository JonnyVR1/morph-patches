package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterBar;
import p147v.VCheckBox;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class b8m0 {
    /* JADX INFO: renamed from: a */
    public static void m100776a(VisitorsFilterBar visitorsFilterBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFilterBar.f38077a = (LinearLayout) viewGroup.getChildAt(0);
        visitorsFilterBar.f38078b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        visitorsFilterBar.f38079c = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        visitorsFilterBar.f38080d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsFilterBar.f38081e = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        visitorsFilterBar.f38082f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        visitorsFilterBar.f38083g = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        visitorsFilterBar.f38084h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        visitorsFilterBar.f38085i = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        visitorsFilterBar.f38086j = (VRecyclerView) viewGroup.getChildAt(2);
    }
}
