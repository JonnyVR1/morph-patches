package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeSayHiView;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class d8b0 {
    /* JADX INFO: renamed from: a */
    public static void m110321a(PurchasePrivilegeSayHiView purchasePrivilegeSayHiView, View view) {
        purchasePrivilegeSayHiView._root = (PurchasePrivilegeSayHiView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeSayHiView._bg = (VImage) viewGroup.getChildAt(0);
        purchasePrivilegeSayHiView._avatar = (AutoVDraweeView) viewGroup.getChildAt(1);
    }
}
