package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.showcase.ODiamondPurchaseSectionView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sw40 {
    /* JADX INFO: renamed from: a */
    public static void m9491a(ODiamondPurchaseSectionView oDiamondPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oDiamondPurchaseSectionView.b = viewGroup.getChildAt(0);
        oDiamondPurchaseSectionView.c = (LinearLayout) viewGroup.getChildAt(1);
        oDiamondPurchaseSectionView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oDiamondPurchaseSectionView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oDiamondPurchaseSectionView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        oDiamondPurchaseSectionView.g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        oDiamondPurchaseSectionView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        oDiamondPurchaseSectionView.i = (TextView) viewGroup.getChildAt(2);
    }
}
