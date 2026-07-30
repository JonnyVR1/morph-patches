package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.VisitorsFlowNoPrivilegeItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p8m0 {
    /* JADX INFO: renamed from: a */
    public static void m8718a(VisitorsFlowNoPrivilegeItemView visitorsFlowNoPrivilegeItemView, View view) {
        visitorsFlowNoPrivilegeItemView.a = (VisitorsFlowNoPrivilegeItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFlowNoPrivilegeItemView.b = viewGroup.getChildAt(0);
        visitorsFlowNoPrivilegeItemView.c = (TextView) viewGroup.getChildAt(3);
        visitorsFlowNoPrivilegeItemView.d = (TextView) viewGroup.getChildAt(4);
        visitorsFlowNoPrivilegeItemView.e = (TextView) viewGroup.getChildAt(5);
        visitorsFlowNoPrivilegeItemView.f = (ImageView) viewGroup.getChildAt(6);
    }
}
