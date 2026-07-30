package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w1p {
    /* JADX INFO: renamed from: a */
    public static void m10429a(IntlPrivilegeSubscriptionItem intlPrivilegeSubscriptionItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeSubscriptionItem.a = viewGroup.getChildAt(0);
        intlPrivilegeSubscriptionItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeSubscriptionItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlPrivilegeSubscriptionItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlPrivilegeSubscriptionItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlPrivilegeSubscriptionItem.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        intlPrivilegeSubscriptionItem.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
