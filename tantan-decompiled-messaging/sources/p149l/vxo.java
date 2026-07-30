package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vxo {
    /* JADX INFO: renamed from: a */
    public static void m200575a(IntlPrivilegeDescListItem intlPrivilegeDescListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListItem.f37905a = (VIcon) viewGroup.getChildAt(0);
        intlPrivilegeDescListItem.f37906b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeDescListItem.f37907c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlPrivilegeDescListItem.f37908d = viewGroup.getChildAt(2);
    }
}
