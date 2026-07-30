package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseUpgradeIntroView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bbb0 {
    /* JADX INFO: renamed from: a */
    public static void m100955a(PurchaseUpgradeIntroView purchaseUpgradeIntroView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseUpgradeIntroView._decorate = (VImage) viewGroup.getChildAt(0);
        purchaseUpgradeIntroView._image = (VImage) viewGroup.getChildAt(1);
        purchaseUpgradeIntroView._close = (VImage) viewGroup.getChildAt(2);
        purchaseUpgradeIntroView._title = (VText) viewGroup.getChildAt(3);
        purchaseUpgradeIntroView._subtitle = (VText) viewGroup.getChildAt(4);
    }
}
