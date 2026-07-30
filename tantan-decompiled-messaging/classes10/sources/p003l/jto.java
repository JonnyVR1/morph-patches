package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPremiumDiscountExclusivePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jto {
    /* JADX INFO: renamed from: a */
    public static void m7461a(IntlPremiumDiscountExclusivePrivilegeView intlPremiumDiscountExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPremiumDiscountExclusivePrivilegeView.a = (FrameLayout) viewGroup.getChildAt(0);
        intlPremiumDiscountExclusivePrivilegeView.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPremiumDiscountExclusivePrivilegeView.c = viewGroup.getChildAt(1);
    }
}
