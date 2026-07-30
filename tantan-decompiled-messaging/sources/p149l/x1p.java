package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeSubscriptionItem;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x1p {
    /* JADX INFO: renamed from: a */
    public static void m206756a(IntlPrivilegeSubscriptionItem intlPrivilegeSubscriptionItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeSubscriptionItem._item_layout = (VRelative) viewGroup.getChildAt(0);
        intlPrivilegeSubscriptionItem._top_line = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeSubscriptionItem._top_divider_line = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlPrivilegeSubscriptionItem._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlPrivilegeSubscriptionItem._desc = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlPrivilegeSubscriptionItem._arrow = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        intlPrivilegeSubscriptionItem._divider_line = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
