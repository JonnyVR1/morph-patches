package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeVIPBadgeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ac90 {
    /* JADX INFO: renamed from: a */
    public static void m5355a(PrivilegeVIPBadgeView privilegeVIPBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeVIPBadgeView.a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeVIPBadgeView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeVIPBadgeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeVIPBadgeView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
