package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftInnerPagerItemView;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rtj {
    /* JADX INFO: renamed from: a */
    public static void m183121a(GiftInnerPagerItemView giftInnerPagerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftInnerPagerItemView.f30085d = (VDraweeView) viewGroup.getChildAt(0);
        giftInnerPagerItemView.f30086e = (VText) viewGroup.getChildAt(1);
        giftInnerPagerItemView.f30087f = (VMarqueeText) viewGroup.getChildAt(2);
        giftInnerPagerItemView.f30088g = (VText) viewGroup.getChildAt(3);
        giftInnerPagerItemView.f30089h = (VText) viewGroup.getChildAt(4);
    }
}
