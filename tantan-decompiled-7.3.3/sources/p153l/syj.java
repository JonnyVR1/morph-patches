package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class syj {
    /* JADX INFO: renamed from: a */
    public static void m188572a(GiftSuitItemView giftSuitItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftSuitItemView.f50811a = (ConstraintLayout) viewGroup.getChildAt(0);
        giftSuitItemView.f50812b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftSuitItemView.f50813c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftSuitItemView.f50814d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        giftSuitItemView.f50815e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        giftSuitItemView.f50816f = (VDraweeView) viewGroup.getChildAt(1);
        giftSuitItemView.f50817g = (VText) viewGroup.getChildAt(2);
    }
}
