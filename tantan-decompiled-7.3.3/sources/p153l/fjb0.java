package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseUpgradeIntroView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fjb0 {
    /* JADX INFO: renamed from: a */
    public static void m125791a(PurchaseUpgradeIntroView purchaseUpgradeIntroView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseUpgradeIntroView._decorate = (VImage) viewGroup.getChildAt(0);
        purchaseUpgradeIntroView._image = (VImage) viewGroup.getChildAt(1);
        purchaseUpgradeIntroView._close = (VImage) viewGroup.getChildAt(2);
        purchaseUpgradeIntroView._title = (VText) viewGroup.getChildAt(3);
        purchaseUpgradeIntroView._subtitle = (VText) viewGroup.getChildAt(4);
    }
}
