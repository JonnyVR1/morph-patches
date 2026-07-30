package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPremiumDiscountExclusivePrivilegeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jvo {
    /* JADX INFO: renamed from: a */
    public static void m147078a(IntlPremiumDiscountExclusivePrivilegeView intlPremiumDiscountExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPremiumDiscountExclusivePrivilegeView._root_view = (FrameLayout) viewGroup.getChildAt(0);
        intlPremiumDiscountExclusivePrivilegeView._container = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPremiumDiscountExclusivePrivilegeView._privilege_title = (VText) viewGroup.getChildAt(1);
    }
}
