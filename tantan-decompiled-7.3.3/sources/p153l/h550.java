package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.ODiamondPurchaseSectionView;
import p151v.VImage;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class h550 {
    /* JADX INFO: renamed from: a */
    public static void m133626a(ODiamondPurchaseSectionView oDiamondPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oDiamondPurchaseSectionView.f36107b = (VImage) viewGroup.getChildAt(0);
        oDiamondPurchaseSectionView.f36108c = (LinearLayout) viewGroup.getChildAt(1);
        oDiamondPurchaseSectionView.f36109d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oDiamondPurchaseSectionView.f36110e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oDiamondPurchaseSectionView.f36111f = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        oDiamondPurchaseSectionView.f36112g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        oDiamondPurchaseSectionView.f36113h = (VText_AutoFit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        oDiamondPurchaseSectionView.f36114i = (TextView) viewGroup.getChildAt(2);
    }
}
