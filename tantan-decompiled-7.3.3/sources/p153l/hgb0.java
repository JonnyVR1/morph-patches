package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeSayHiView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class hgb0 {
    /* JADX INFO: renamed from: a */
    public static void m134918a(PurchasePrivilegeSayHiView purchasePrivilegeSayHiView, View view) {
        purchasePrivilegeSayHiView._root = (PurchasePrivilegeSayHiView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeSayHiView._bg = (VImage) viewGroup.getChildAt(0);
        purchasePrivilegeSayHiView._avatar = (AutoVDraweeView) viewGroup.getChildAt(1);
    }
}
