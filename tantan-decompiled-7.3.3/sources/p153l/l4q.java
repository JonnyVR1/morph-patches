package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCommonTipBoxV2;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l4q {
    /* JADX INFO: renamed from: a */
    public static void m152815a(ItemCommonTipBoxV2 itemCommonTipBoxV2, View view) {
        itemCommonTipBoxV2.f31747c = (ItemCommonTipBoxV2) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonTipBoxV2.f31748d = (VLinear) viewGroup.getChildAt(0);
        itemCommonTipBoxV2.f31749e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCommonTipBoxV2.f31750f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonTipBoxV2.f31751g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonTipBoxV2.f31752h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemCommonTipBoxV2.f31753i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
