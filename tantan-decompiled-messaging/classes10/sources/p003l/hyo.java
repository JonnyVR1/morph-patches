package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hyo {
    /* JADX INFO: renamed from: a */
    public static void m7088a(IntlPrivilegePolicyItem intlPrivilegePolicyItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegePolicyItem.c = viewGroup.getChildAt(0);
        intlPrivilegePolicyItem.d = (TextView) viewGroup.getChildAt(1);
        intlPrivilegePolicyItem.e = (TextView) viewGroup.getChildAt(2);
    }
}
