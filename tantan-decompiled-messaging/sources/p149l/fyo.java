package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fyo {
    /* JADX INFO: renamed from: a */
    public static void m123787a(IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeExclusivePrivilegeView.f37176a = (FrameLayout) viewGroup.getChildAt(0);
        intlPrivilegeExclusivePrivilegeView.f37177b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeExclusivePrivilegeView.f37178c = (VText) viewGroup.getChildAt(1);
    }
}
