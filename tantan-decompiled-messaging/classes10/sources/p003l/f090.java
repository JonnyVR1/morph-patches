package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceHasPrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f090 {
    /* JADX INFO: renamed from: a */
    public static void m6359a(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceHasPrivilegeView._texture = viewGroup.getChildAt(0);
        privilegeEntranceHasPrivilegeView._light_svga = viewGroup.getChildAt(1);
        privilegeEntranceHasPrivilegeView._border = viewGroup.getChildAt(2);
        privilegeEntranceHasPrivilegeView._light_icon_svga = viewGroup.getChildAt(3);
        privilegeEntranceHasPrivilegeView._iv_privilege_icon = viewGroup.getChildAt(4);
        privilegeEntranceHasPrivilegeView._vip_desc = viewGroup.getChildAt(5);
        privilegeEntranceHasPrivilegeView._vip_go = viewGroup.getChildAt(6);
    }
}
