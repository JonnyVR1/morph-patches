package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePrivilegeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c9p {
    /* JADX INFO: renamed from: a */
    public static void m108454a(IntlPurchasePrivilegeView intlPurchasePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePrivilegeView._container = (FrameLayout) viewGroup.getChildAt(0);
        intlPurchasePrivilegeView._title = (VText) viewGroup.getChildAt(1);
    }
}
