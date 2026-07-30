package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePrivilegeTopView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e290 {
    /* JADX INFO: renamed from: a */
    public static void m114497a(PrivilegeEntrancePrivilegeTopView privilegeEntrancePrivilegeTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntrancePrivilegeTopView._texture = (VImage) viewGroup.getChildAt(0);
        privilegeEntrancePrivilegeTopView._border = (VImage) viewGroup.getChildAt(1);
        privilegeEntrancePrivilegeTopView._icon_svga = (SVGAnimationView) viewGroup.getChildAt(2);
        privilegeEntrancePrivilegeTopView._privilege_icon = (VImage) viewGroup.getChildAt(3);
        privilegeEntrancePrivilegeTopView._privilege_text = (VText) viewGroup.getChildAt(4);
        privilegeEntrancePrivilegeTopView._desc = (VText) viewGroup.getChildAt(5);
        privilegeEntrancePrivilegeTopView._action = (VText) viewGroup.getChildAt(6);
    }
}
