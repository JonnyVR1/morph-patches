package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.PrivilegeContentDlgItemBadgeView;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wt80 {
    /* JADX INFO: renamed from: a */
    public static void m205534a(PrivilegeContentDlgItemBadgeView privilegeContentDlgItemBadgeView, View view) {
        privilegeContentDlgItemBadgeView.f37741a = (PrivilegeContentDlgItemBadgeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeContentDlgItemBadgeView.f37742b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeContentDlgItemBadgeView.f37743c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        privilegeContentDlgItemBadgeView.f37744d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
