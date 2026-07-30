package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeSuperLikeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e8b0 {
    /* JADX INFO: renamed from: a */
    public static void m6252a(PurchasePrivilegeSuperLikeView purchasePrivilegeSuperLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeSuperLikeView.a = viewGroup.getChildAt(0);
        purchasePrivilegeSuperLikeView.b = viewGroup.getChildAt(1);
        purchasePrivilegeSuperLikeView.c = (ImageView) viewGroup.getChildAt(2);
    }
}
