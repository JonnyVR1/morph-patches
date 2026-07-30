package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeSuperLikeView;
import p151v.AutoVDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class igb0 {
    /* JADX INFO: renamed from: a */
    public static void m139913a(PurchasePrivilegeSuperLikeView purchasePrivilegeSuperLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeSuperLikeView._avatar_left = (AutoVDraweeView) viewGroup.getChildAt(0);
        purchasePrivilegeSuperLikeView._avatar_right = (AutoVDraweeView) viewGroup.getChildAt(1);
        purchasePrivilegeSuperLikeView._icon = (ImageView) viewGroup.getChildAt(2);
    }
}
