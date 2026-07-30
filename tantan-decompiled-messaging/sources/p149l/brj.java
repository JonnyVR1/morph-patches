package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftInnerPagerItemView;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class brj {
    /* JADX INFO: renamed from: a */
    public static void m103550a(GiftInnerPagerItemView giftInnerPagerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftInnerPagerItemView.f29237d = (VDraweeView) viewGroup.getChildAt(0);
        giftInnerPagerItemView.f29238e = (VText) viewGroup.getChildAt(1);
        giftInnerPagerItemView.f29239f = (VMarqueeText) viewGroup.getChildAt(2);
        giftInnerPagerItemView.f29240g = (VText) viewGroup.getChildAt(3);
        giftInnerPagerItemView.f29241h = (VText) viewGroup.getChildAt(4);
    }
}
