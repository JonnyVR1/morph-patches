package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y290 {
    /* JADX INFO: renamed from: a */
    public static void m214047a(PrivilegeDescListDiamondServiceItem privilegeDescListDiamondServiceItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListDiamondServiceItem.f38424a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListDiamondServiceItem.f38425b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListDiamondServiceItem.f38426c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListDiamondServiceItem.f38427d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListDiamondServiceItem.f38428e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
