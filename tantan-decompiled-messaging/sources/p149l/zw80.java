package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import p147v.VIcon;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class zw80 {
    /* JADX INFO: renamed from: a */
    public static void m220580a(PrivilegeDescListShowcaseItem privilegeDescListShowcaseItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListShowcaseItem.f37689a = (LinearLayout) viewGroup.getChildAt(0);
        privilegeDescListShowcaseItem.f37690b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListShowcaseItem.f37691c = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListShowcaseItem.f37692d = (FrameLayout) viewGroup.getChildAt(1);
    }
}
