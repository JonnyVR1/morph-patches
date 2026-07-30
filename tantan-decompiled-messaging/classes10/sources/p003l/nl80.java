package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.pricerecall.PriceRecall2Dialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nl80 {
    /* JADX INFO: renamed from: a */
    public static void m8342a(PriceRecall2Dialog priceRecall2Dialog, View view) {
        priceRecall2Dialog.a = (PriceRecall2Dialog) view;
        ViewGroup viewGroup = (ViewGroup) view;
        priceRecall2Dialog.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        priceRecall2Dialog.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        priceRecall2Dialog.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        priceRecall2Dialog.e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        priceRecall2Dialog.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        priceRecall2Dialog.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
