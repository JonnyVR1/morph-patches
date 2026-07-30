package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftOuterPagerItemView;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftPanelBottomBar;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class pvj {
    /* JADX INFO: renamed from: a */
    public static void m173965a(GiftOuterPagerItemView giftOuterPagerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftOuterPagerItemView.f30094d = (VPager) viewGroup.getChildAt(0);
        giftOuterPagerItemView.f30095e = (GiftPanelBottomBar) viewGroup.getChildAt(1);
    }
}
