package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zw80 {
    /* JADX INFO: renamed from: a */
    public static void m11459a(PrivilegeDescListShowcaseItem privilegeDescListShowcaseItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListShowcaseItem.a = (LinearLayout) viewGroup.getChildAt(0);
        privilegeDescListShowcaseItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListShowcaseItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListShowcaseItem.d = (FrameLayout) viewGroup.getChildAt(1);
    }
}
