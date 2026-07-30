package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yxo {
    /* JADX INFO: renamed from: a */
    public static void m11317a(IntlPrivilegeDescListSeeItem intlPrivilegeDescListSeeItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListSeeItem.a = viewGroup.getChildAt(0);
        intlPrivilegeDescListSeeItem.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeDescListSeeItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
