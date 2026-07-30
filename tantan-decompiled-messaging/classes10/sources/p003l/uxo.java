package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uxo {
    /* JADX INFO: renamed from: a */
    public static void m9790a(IntlPrivilegeDescListItem intlPrivilegeDescListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeDescListItem.a = viewGroup.getChildAt(0);
        intlPrivilegeDescListItem.b = viewGroup.getChildAt(1);
        intlPrivilegeDescListItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeDescListItem.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
