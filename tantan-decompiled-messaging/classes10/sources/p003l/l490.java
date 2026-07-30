package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l490 {
    /* JADX INFO: renamed from: a */
    public static void m7665a(PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceSingleTextWithIconBgView._texture = viewGroup.getChildAt(0);
        privilegeEntranceSingleTextWithIconBgView._privilege_icon_simple = viewGroup.getChildAt(1);
        privilegeEntranceSingleTextWithIconBgView._privilege_icon = viewGroup.getChildAt(2);
        privilegeEntranceSingleTextWithIconBgView._desc = (TextView) viewGroup.getChildAt(3);
        privilegeEntranceSingleTextWithIconBgView._time_desc = (TextView) viewGroup.getChildAt(4);
        privilegeEntranceSingleTextWithIconBgView._go = viewGroup.getChildAt(5);
        privilegeEntranceSingleTextWithIconBgView._light_svga = viewGroup.getChildAt(6);
    }
}
