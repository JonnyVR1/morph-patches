package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f090 {
    /* JADX INFO: renamed from: a */
    public static void m119035a(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceHasPrivilegeView._texture = (VImage) viewGroup.getChildAt(0);
        privilegeEntranceHasPrivilegeView._light_svga = (SVGAnimationView) viewGroup.getChildAt(1);
        privilegeEntranceHasPrivilegeView._border = (VImage) viewGroup.getChildAt(2);
        privilegeEntranceHasPrivilegeView._light_icon_svga = (SVGAnimationView) viewGroup.getChildAt(3);
        privilegeEntranceHasPrivilegeView._iv_privilege_icon = (VImage) viewGroup.getChildAt(4);
        privilegeEntranceHasPrivilegeView._vip_desc = (VText) viewGroup.getChildAt(5);
        privilegeEntranceHasPrivilegeView._vip_go = (VImage) viewGroup.getChildAt(6);
    }
}
