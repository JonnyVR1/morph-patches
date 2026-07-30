package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeSubscriptionItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x1p {
    /* JADX INFO: renamed from: a */
    public static void m10620a(IntlPrivilegeSubscriptionItem intlPrivilegeSubscriptionItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeSubscriptionItem.f = viewGroup.getChildAt(0);
        intlPrivilegeSubscriptionItem.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeSubscriptionItem.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlPrivilegeSubscriptionItem.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlPrivilegeSubscriptionItem.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlPrivilegeSubscriptionItem.k = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        intlPrivilegeSubscriptionItem.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
