package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftOuterPagerItemView;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftPanelBottomBar;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class zsj {
    /* JADX INFO: renamed from: a */
    public static void m220036a(GiftOuterPagerItemView giftOuterPagerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftOuterPagerItemView.f29246d = (VPager) viewGroup.getChildAt(0);
        giftOuterPagerItemView.f29247e = (GiftPanelBottomBar) viewGroup.getChildAt(1);
    }
}
