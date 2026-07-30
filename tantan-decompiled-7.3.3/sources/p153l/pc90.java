package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class pc90 {
    /* JADX INFO: renamed from: a */
    public static void m171640a(PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceSingleTextWithIconBgView._texture = (VImage) viewGroup.getChildAt(0);
        privilegeEntranceSingleTextWithIconBgView._privilege_icon_simple = (VImage) viewGroup.getChildAt(1);
        privilegeEntranceSingleTextWithIconBgView._privilege_icon = (VImage) viewGroup.getChildAt(2);
        privilegeEntranceSingleTextWithIconBgView._desc = (TextView) viewGroup.getChildAt(3);
        privilegeEntranceSingleTextWithIconBgView._time_desc = (TextView) viewGroup.getChildAt(4);
        privilegeEntranceSingleTextWithIconBgView._go = (VImage) viewGroup.getChildAt(5);
        privilegeEntranceSingleTextWithIconBgView._light_svga = (SVGAnimationView) viewGroup.getChildAt(6);
    }
}
