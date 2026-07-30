package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlInstantChat.InstantMatchPurchaseSheetItemView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class txm {
    /* JADX INFO: renamed from: a */
    public static void m193515a(InstantMatchPurchaseSheetItemView instantMatchPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instantMatchPurchaseSheetItemView.f35473a = (VRelative) viewGroup.getChildAt(0);
        instantMatchPurchaseSheetItemView.f35474b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        instantMatchPurchaseSheetItemView.f35475c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        instantMatchPurchaseSheetItemView.f35476d = (VImage) viewGroup.getChildAt(1);
        instantMatchPurchaseSheetItemView.f35477e = (VImage) viewGroup.getChildAt(2);
    }
}
