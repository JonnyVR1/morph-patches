package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceODiamondSingleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f190 {
    /* JADX INFO: renamed from: a */
    public static void m6363a(PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceODiamondSingleView._texture = viewGroup.getChildAt(0);
        privilegeEntranceODiamondSingleView._icon = viewGroup.getChildAt(1);
        privilegeEntranceODiamondSingleView._title = (TextView) viewGroup.getChildAt(2);
        privilegeEntranceODiamondSingleView._arrow_right = viewGroup.getChildAt(3);
        privilegeEntranceODiamondSingleView._unlock = (TextView) viewGroup.getChildAt(4);
    }
}
