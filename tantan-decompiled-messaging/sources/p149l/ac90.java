package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeVIPBadgeView;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class ac90 {
    /* JADX INFO: renamed from: a */
    public static void m95718a(PrivilegeVIPBadgeView privilegeVIPBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeVIPBadgeView.f35120a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeVIPBadgeView.f35121b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeVIPBadgeView.f35122c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeVIPBadgeView.f35123d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
