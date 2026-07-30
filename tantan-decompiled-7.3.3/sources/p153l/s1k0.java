package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.FixedScrollView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;

/* JADX INFO: loaded from: classes4.dex */
public class s1k0 {
    /* JADX INFO: renamed from: a */
    public static void m184052a(UpgradeGiftContentView upgradeGiftContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftContentView.f51047d = viewGroup.getChildAt(0);
        upgradeGiftContentView.f51048e = viewGroup.getChildAt(1);
        upgradeGiftContentView.f51049f = (TabLayout) viewGroup.getChildAt(2);
        upgradeGiftContentView.f51050g = (FixedScrollView) viewGroup.getChildAt(3);
        upgradeGiftContentView.f51051h = (UnScrollVPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        upgradeGiftContentView.f51052i = viewGroup.getChildAt(4);
        upgradeGiftContentView.f51053j = (FrameLayout) viewGroup.getChildAt(5);
    }
}
