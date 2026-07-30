package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFlowNoPrivilegeItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class p8m0 {
    /* JADX INFO: renamed from: a */
    public static void m167803a(VisitorsFlowNoPrivilegeItemView visitorsFlowNoPrivilegeItemView, View view) {
        visitorsFlowNoPrivilegeItemView._root = (VisitorsFlowNoPrivilegeItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFlowNoPrivilegeItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        visitorsFlowNoPrivilegeItemView._active_infos = (TextView) viewGroup.getChildAt(3);
        visitorsFlowNoPrivilegeItemView._visitor_count = (TextView) viewGroup.getChildAt(4);
        visitorsFlowNoPrivilegeItemView._reason_infos = (TextView) viewGroup.getChildAt(5);
        visitorsFlowNoPrivilegeItemView._o_diamond_visitor_ic = (ImageView) viewGroup.getChildAt(6);
    }
}
