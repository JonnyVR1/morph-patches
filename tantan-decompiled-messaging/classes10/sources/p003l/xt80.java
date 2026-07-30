package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeContentDlgItemDiamondServiceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xt80 {
    /* JADX INFO: renamed from: a */
    public static void m10954a(PrivilegeContentDlgItemDiamondServiceView privilegeContentDlgItemDiamondServiceView, View view) {
        privilegeContentDlgItemDiamondServiceView.a = (PrivilegeContentDlgItemDiamondServiceView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeContentDlgItemDiamondServiceView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeContentDlgItemDiamondServiceView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
