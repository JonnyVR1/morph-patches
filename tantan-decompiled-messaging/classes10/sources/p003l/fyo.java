package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fyo {
    /* JADX INFO: renamed from: a */
    public static void m6531a(IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeExclusivePrivilegeView.a = (FrameLayout) viewGroup.getChildAt(0);
        intlPrivilegeExclusivePrivilegeView.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeExclusivePrivilegeView.c = viewGroup.getChildAt(1);
    }
}
