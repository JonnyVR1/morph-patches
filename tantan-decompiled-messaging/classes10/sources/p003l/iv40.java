package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.showcase.ODiamondAllPriceSectionView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iv40 {
    /* JADX INFO: renamed from: a */
    public static void m7300a(ODiamondAllPriceSectionView oDiamondAllPriceSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oDiamondAllPriceSectionView.b = (LinearLayout) viewGroup.getChildAt(0);
        oDiamondAllPriceSectionView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        oDiamondAllPriceSectionView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        oDiamondAllPriceSectionView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        oDiamondAllPriceSectionView.f = viewGroup.getChildAt(1);
    }
}
