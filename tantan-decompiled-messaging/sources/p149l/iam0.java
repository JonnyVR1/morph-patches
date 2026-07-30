package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsUnPrivilegeView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class iam0 {
    /* JADX INFO: renamed from: a */
    public static void m135161a(VisitorsUnPrivilegeView visitorsUnPrivilegeView, View view) {
        visitorsUnPrivilegeView.f38120a = (VisitorsUnPrivilegeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsUnPrivilegeView.f38121b = (VRelative) viewGroup.getChildAt(0);
        visitorsUnPrivilegeView.f38122c = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        visitorsUnPrivilegeView.f38123d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsUnPrivilegeView.f38124e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        visitorsUnPrivilegeView.f38125f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        visitorsUnPrivilegeView.f38126g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        visitorsUnPrivilegeView.f38127h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
