package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTitle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ex80 {
    /* JADX INFO: renamed from: a */
    public static void m6356a(PrivilegeDescListTitle privilegeDescListTitle, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListTitle.a = (TextView) viewGroup.getChildAt(0);
        privilegeDescListTitle.b = viewGroup.getChildAt(1);
        privilegeDescListTitle.c = (TextView) viewGroup.getChildAt(2);
    }
}
