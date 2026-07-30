package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroOutstanding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y590 {
    /* JADX INFO: renamed from: a */
    public static void m11153a(PrivilegeItemIntroOutstanding privilegeItemIntroOutstanding, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeItemIntroOutstanding.a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeItemIntroOutstanding.b = viewGroup.getChildAt(1);
        privilegeItemIntroOutstanding.c = viewGroup.getChildAt(2);
    }
}
