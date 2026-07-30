package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.VisitorsUnPrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iam0 {
    /* JADX INFO: renamed from: a */
    public static void m7144a(VisitorsUnPrivilegeView visitorsUnPrivilegeView, View view) {
        visitorsUnPrivilegeView.a = (VisitorsUnPrivilegeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsUnPrivilegeView.b = viewGroup.getChildAt(0);
        visitorsUnPrivilegeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        visitorsUnPrivilegeView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsUnPrivilegeView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        visitorsUnPrivilegeView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        visitorsUnPrivilegeView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        visitorsUnPrivilegeView.h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
