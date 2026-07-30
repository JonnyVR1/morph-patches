package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.PicksTimesPurchaseSectionView;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class ro70 {
    /* JADX INFO: renamed from: a */
    public static void m182360a(PicksTimesPurchaseSectionView picksTimesPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksTimesPurchaseSectionView._border = (LinearLayout) viewGroup.getChildAt(0);
        picksTimesPurchaseSectionView._count = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        picksTimesPurchaseSectionView._info = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        picksTimesPurchaseSectionView._top_price = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        picksTimesPurchaseSectionView._bottom_bg = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        picksTimesPurchaseSectionView._bottom_price = (VText_AutoFit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
    }
}
