package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.PrivilegeContentDlgItemBadgeView;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a290 {
    /* JADX INFO: renamed from: a */
    public static void m95618a(PrivilegeContentDlgItemBadgeView privilegeContentDlgItemBadgeView, View view) {
        privilegeContentDlgItemBadgeView.f38589a = (PrivilegeContentDlgItemBadgeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeContentDlgItemBadgeView.f38590b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeContentDlgItemBadgeView.f38591c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        privilegeContentDlgItemBadgeView.f38592d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
