package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vx80 {
    /* JADX INFO: renamed from: a */
    public static void m10389a(PrivilegeDescListVisitorItem privilegeDescListVisitorItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListVisitorItem.a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListVisitorItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListVisitorItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListVisitorItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListVisitorItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListVisitorItem.f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListVisitorItem.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
