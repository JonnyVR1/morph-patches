package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeSuperLikeView;
import p147v.AutoVDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class e8b0 {
    /* JADX INFO: renamed from: a */
    public static void m115255a(PurchasePrivilegeSuperLikeView purchasePrivilegeSuperLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeSuperLikeView._avatar_left = (AutoVDraweeView) viewGroup.getChildAt(0);
        purchasePrivilegeSuperLikeView._avatar_right = (AutoVDraweeView) viewGroup.getChildAt(1);
        purchasePrivilegeSuperLikeView._icon = (ImageView) viewGroup.getChildAt(2);
    }
}
