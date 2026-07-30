package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFlowHasPrivilegeItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class j8m0 {
    /* JADX INFO: renamed from: a */
    public static void m140227a(VisitorsFlowHasPrivilegeItemView visitorsFlowHasPrivilegeItemView, View view) {
        visitorsFlowHasPrivilegeItemView._root = (VisitorsFlowHasPrivilegeItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFlowHasPrivilegeItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        visitorsFlowHasPrivilegeItemView._online_ic = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        visitorsFlowHasPrivilegeItemView._active_infos = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        visitorsFlowHasPrivilegeItemView._visitor_count = (TextView) viewGroup.getChildAt(4);
        visitorsFlowHasPrivilegeItemView._name = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        visitorsFlowHasPrivilegeItemView._age = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        visitorsFlowHasPrivilegeItemView._visit_time_infos = (TextView) viewGroup.getChildAt(6);
    }
}
