package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.showcase.BoostPurchaseSectionView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g93 {
    /* JADX INFO: renamed from: a */
    public static void m6617a(BoostPurchaseSectionView boostPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostPurchaseSectionView.b = (LinearLayout) viewGroup.getChildAt(0);
        boostPurchaseSectionView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostPurchaseSectionView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostPurchaseSectionView.e = (TextView) viewGroup.getChildAt(1);
        boostPurchaseSectionView.f = (TextView) viewGroup.getChildAt(2);
        boostPurchaseSectionView.g = (TextView) viewGroup.getChildAt(3);
    }
}
