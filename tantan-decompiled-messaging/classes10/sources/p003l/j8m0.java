package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.VisitorsFlowHasPrivilegeItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j8m0 {
    /* JADX INFO: renamed from: a */
    public static void m7377a(VisitorsFlowHasPrivilegeItemView visitorsFlowHasPrivilegeItemView, View view) {
        visitorsFlowHasPrivilegeItemView.a = (VisitorsFlowHasPrivilegeItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFlowHasPrivilegeItemView.b = viewGroup.getChildAt(0);
        visitorsFlowHasPrivilegeItemView.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        visitorsFlowHasPrivilegeItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        visitorsFlowHasPrivilegeItemView.e = (TextView) viewGroup.getChildAt(4);
        visitorsFlowHasPrivilegeItemView.f = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        visitorsFlowHasPrivilegeItemView.g = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        visitorsFlowHasPrivilegeItemView.h = (TextView) viewGroup.getChildAt(6);
    }
}
