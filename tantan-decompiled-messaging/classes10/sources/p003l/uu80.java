package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uu80 {
    /* JADX INFO: renamed from: a */
    public static void m9785a(PrivilegeDescListDiamondServiceItem privilegeDescListDiamondServiceItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListDiamondServiceItem.a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListDiamondServiceItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListDiamondServiceItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListDiamondServiceItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListDiamondServiceItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
