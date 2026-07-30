package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.ODiamondPurchaseSectionView;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class sw40 {
    /* JADX INFO: renamed from: a */
    public static void m186124a(ODiamondPurchaseSectionView oDiamondPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oDiamondPurchaseSectionView.f35259b = (VImage) viewGroup.getChildAt(0);
        oDiamondPurchaseSectionView.f35260c = (LinearLayout) viewGroup.getChildAt(1);
        oDiamondPurchaseSectionView.f35261d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oDiamondPurchaseSectionView.f35262e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oDiamondPurchaseSectionView.f35263f = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        oDiamondPurchaseSectionView.f35264g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        oDiamondPurchaseSectionView.f35265h = (VText_AutoFit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        oDiamondPurchaseSectionView.f35266i = (TextView) viewGroup.getChildAt(2);
    }
}
