package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import p147v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class ov80 {
    /* JADX INFO: renamed from: a */
    public static void m166161a(PrivilegeDescListNoSVipItem privilegeDescListNoSVipItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListNoSVipItem.f37622a = viewGroup.getChildAt(0);
        privilegeDescListNoSVipItem.f37623b = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListNoSVipItem.f37624c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListNoSVipItem.f37625d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeDescListNoSVipItem.f37626e = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
    }
}
