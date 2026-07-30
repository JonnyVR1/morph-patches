package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sw80 {
    /* JADX INFO: renamed from: a */
    public static void m9492a(PrivilegeDescListSeeItem privilegeDescListSeeItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSeeItem.a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListSeeItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListSeeItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListSeeItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListSeeItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListSeeItem.f = viewGroup.getChildAt(1);
        privilegeDescListSeeItem.g = (FrameLayout) viewGroup.getChildAt(2);
        privilegeDescListSeeItem.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListSeeItem.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
