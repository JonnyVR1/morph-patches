package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePrivilegeTopView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e290 {
    /* JADX INFO: renamed from: a */
    public static void m6235a(PrivilegeEntrancePrivilegeTopView privilegeEntrancePrivilegeTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntrancePrivilegeTopView._texture = viewGroup.getChildAt(0);
        privilegeEntrancePrivilegeTopView._border = viewGroup.getChildAt(1);
        privilegeEntrancePrivilegeTopView._icon_svga = viewGroup.getChildAt(2);
        privilegeEntrancePrivilegeTopView._privilege_icon = viewGroup.getChildAt(3);
        privilegeEntrancePrivilegeTopView._privilege_text = viewGroup.getChildAt(4);
        privilegeEntrancePrivilegeTopView._desc = viewGroup.getChildAt(5);
        privilegeEntrancePrivilegeTopView._action = viewGroup.getChildAt(6);
    }
}
