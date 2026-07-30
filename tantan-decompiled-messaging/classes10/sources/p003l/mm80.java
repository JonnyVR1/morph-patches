package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.pricerecall.PriceRecallTellPriceSelectItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mm80 {
    /* JADX INFO: renamed from: a */
    public static void m8174a(PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        priceRecallTellPriceSelectItem.a = viewGroup.getChildAt(0);
        priceRecallTellPriceSelectItem.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        priceRecallTellPriceSelectItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        priceRecallTellPriceSelectItem.d = viewGroup.getChildAt(2);
    }
}
