package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeDescListSeeImageItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jw80 {
    /* JADX INFO: renamed from: a */
    public static void m7466a(PrivilegeDescListSeeImageItem privilegeDescListSeeImageItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSeeImageItem.a = viewGroup.getChildAt(0);
        privilegeDescListSeeImageItem.b = viewGroup.getChildAt(1);
        privilegeDescListSeeImageItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeDescListSeeImageItem.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        privilegeDescListSeeImageItem.e = (LinearLayout) viewGroup.getChildAt(2);
        privilegeDescListSeeImageItem.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListSeeImageItem.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
