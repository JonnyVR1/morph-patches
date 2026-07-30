package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cwj {
    /* JADX INFO: renamed from: a */
    public static void m109049a(GiftSuitItemView giftSuitItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftSuitItemView.f49963a = (ConstraintLayout) viewGroup.getChildAt(0);
        giftSuitItemView.f49964b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftSuitItemView.f49965c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftSuitItemView.f49966d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        giftSuitItemView.f49967e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        giftSuitItemView.f49968f = (VDraweeView) viewGroup.getChildAt(1);
        giftSuitItemView.f49969g = (VText) viewGroup.getChildAt(2);
    }
}
