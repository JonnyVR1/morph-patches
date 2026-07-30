package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.ItemCommonTipBoxV2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l2q {
    /* JADX INFO: renamed from: a */
    public static void m7660a(ItemCommonTipBoxV2 itemCommonTipBoxV2, View view) {
        itemCommonTipBoxV2.c = (ItemCommonTipBoxV2) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonTipBoxV2.d = viewGroup.getChildAt(0);
        itemCommonTipBoxV2.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCommonTipBoxV2.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonTipBoxV2.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonTipBoxV2.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemCommonTipBoxV2.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
