package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCommonTipBoxV2;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l2q {
    /* JADX INFO: renamed from: a */
    public static void m148294a(ItemCommonTipBoxV2 itemCommonTipBoxV2, View view) {
        itemCommonTipBoxV2.f30899c = (ItemCommonTipBoxV2) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonTipBoxV2.f30900d = (VLinear) viewGroup.getChildAt(0);
        itemCommonTipBoxV2.f30901e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCommonTipBoxV2.f30902f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonTipBoxV2.f30903g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonTipBoxV2.f30904h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemCommonTipBoxV2.f30905i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
