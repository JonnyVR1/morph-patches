package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.showcase.PicksTimesPurchaseSectionView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lg70 {
    /* JADX INFO: renamed from: a */
    public static void m7730a(PicksTimesPurchaseSectionView picksTimesPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksTimesPurchaseSectionView.b = (LinearLayout) viewGroup.getChildAt(0);
        picksTimesPurchaseSectionView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        picksTimesPurchaseSectionView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        picksTimesPurchaseSectionView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        picksTimesPurchaseSectionView.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        picksTimesPurchaseSectionView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
    }
}
