package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeUnlockOnlineView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xb90 {
    /* JADX INFO: renamed from: a */
    public static void m10781a(PrivilegeUnlockOnlineView privilegeUnlockOnlineView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeUnlockOnlineView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeUnlockOnlineView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
