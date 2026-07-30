package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceODiamondSingleView;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class j990 {
    /* JADX INFO: renamed from: a */
    public static void m143934a(PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceODiamondSingleView._texture = (VDraweeView) viewGroup.getChildAt(0);
        privilegeEntranceODiamondSingleView._icon = (VImage) viewGroup.getChildAt(1);
        privilegeEntranceODiamondSingleView._title = (TextView) viewGroup.getChildAt(2);
        privilegeEntranceODiamondSingleView._arrow_right = (VIcon) viewGroup.getChildAt(3);
        privilegeEntranceODiamondSingleView._unlock = (TextView) viewGroup.getChildAt(4);
    }
}
