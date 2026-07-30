package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lv80 {
    /* JADX INFO: renamed from: a */
    public static void m7921a(PrivilegeDescListNearbyItem privilegeDescListNearbyItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListNearbyItem.a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListNearbyItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListNearbyItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListNearbyItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListNearbyItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListNearbyItem.f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListNearbyItem.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeDescListNearbyItem.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
