package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroPage1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z590 {
    /* JADX INFO: renamed from: a */
    public static void m11345a(PrivilegeItemIntroPage1 privilegeItemIntroPage1, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeItemIntroPage1.a = viewGroup.getChildAt(0);
        privilegeItemIntroPage1.b = (TextView) viewGroup.getChildAt(1);
        privilegeItemIntroPage1.c = (TextView) viewGroup.getChildAt(2);
        privilegeItemIntroPage1.d = (FrameLayout) viewGroup.getChildAt(3);
        privilegeItemIntroPage1.e = (TextView) viewGroup.getChildAt(4);
    }
}
