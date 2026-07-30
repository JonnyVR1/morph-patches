package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bx80 {
    /* JADX INFO: renamed from: a */
    public static void m104309a(PrivilegeDescListSvipContainerItem privilegeDescListSvipContainerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSvipContainerItem.f37700a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListSvipContainerItem.f37701b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListSvipContainerItem.f37702c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListSvipContainerItem.f37703d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListSvipContainerItem.f37704e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListSvipContainerItem.f37705f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListSvipContainerItem.f37706g = viewGroup.getChildAt(2);
    }
}
