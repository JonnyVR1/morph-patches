package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bx80 {
    /* JADX INFO: renamed from: a */
    public static void m5827a(PrivilegeDescListSvipContainerItem privilegeDescListSvipContainerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSvipContainerItem.a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListSvipContainerItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListSvipContainerItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListSvipContainerItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListSvipContainerItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListSvipContainerItem.f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListSvipContainerItem.g = viewGroup.getChildAt(2);
    }
}
