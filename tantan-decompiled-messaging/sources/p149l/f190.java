package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceODiamondSingleView;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class f190 {
    /* JADX INFO: renamed from: a */
    public static void m119106a(PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceODiamondSingleView._texture = (VDraweeView) viewGroup.getChildAt(0);
        privilegeEntranceODiamondSingleView._icon = (VImage) viewGroup.getChildAt(1);
        privilegeEntranceODiamondSingleView._title = (TextView) viewGroup.getChildAt(2);
        privilegeEntranceODiamondSingleView._arrow_right = (VIcon) viewGroup.getChildAt(3);
        privilegeEntranceODiamondSingleView._unlock = (TextView) viewGroup.getChildAt(4);
    }
}
