package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ev80 {
    /* JADX INFO: renamed from: a */
    public static void m6320a(PrivilegeDescListItem privilegeDescListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListItem.a = viewGroup.getChildAt(0);
        privilegeDescListItem.b = viewGroup.getChildAt(1);
        privilegeDescListItem.c = viewGroup.getChildAt(2);
    }
}
