package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.pricerecall.PriceRecallGetSurpriseItem2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yl80 {
    /* JADX INFO: renamed from: a */
    public static void m11256a(PriceRecallGetSurpriseItem2 priceRecallGetSurpriseItem2, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        priceRecallGetSurpriseItem2.d = (LinearLayout) viewGroup.getChildAt(2);
        priceRecallGetSurpriseItem2.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        priceRecallGetSurpriseItem2.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        priceRecallGetSurpriseItem2.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        priceRecallGetSurpriseItem2.h = (RelativeLayout) viewGroup.getChildAt(3);
        priceRecallGetSurpriseItem2.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        priceRecallGetSurpriseItem2.j = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
