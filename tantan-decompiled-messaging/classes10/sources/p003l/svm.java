package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.intlInstantChat.InstantMatchPurchaseSheetItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class svm {
    /* JADX INFO: renamed from: a */
    public static void m9490a(InstantMatchPurchaseSheetItemView instantMatchPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instantMatchPurchaseSheetItemView.a = viewGroup.getChildAt(0);
        instantMatchPurchaseSheetItemView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        instantMatchPurchaseSheetItemView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        instantMatchPurchaseSheetItemView.d = viewGroup.getChildAt(1);
        instantMatchPurchaseSheetItemView.e = viewGroup.getChildAt(2);
    }
}
