package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.showcase.NewUIPurchaseSectionViewAutoPay;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tc40 {
    /* JADX INFO: renamed from: a */
    public static void m9564a(NewUIPurchaseSectionViewAutoPay newUIPurchaseSectionViewAutoPay, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUIPurchaseSectionViewAutoPay.b = (LinearLayout) viewGroup.getChildAt(0);
        newUIPurchaseSectionViewAutoPay.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newUIPurchaseSectionViewAutoPay.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newUIPurchaseSectionViewAutoPay.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
