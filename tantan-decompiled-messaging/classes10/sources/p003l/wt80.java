package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeContentDlgItemBadgeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wt80 {
    /* JADX INFO: renamed from: a */
    public static void m10544a(PrivilegeContentDlgItemBadgeView privilegeContentDlgItemBadgeView, View view) {
        privilegeContentDlgItemBadgeView.a = (PrivilegeContentDlgItemBadgeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeContentDlgItemBadgeView.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeContentDlgItemBadgeView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        privilegeContentDlgItemBadgeView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
