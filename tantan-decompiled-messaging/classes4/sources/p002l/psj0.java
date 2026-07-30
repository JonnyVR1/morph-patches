package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.FixedScrollView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class psj0 {
    /* JADX INFO: renamed from: a */
    public static void m20653a(UpgradeGiftContentView upgradeGiftContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftContentView.f6241d = viewGroup.getChildAt(0);
        upgradeGiftContentView.f6242e = viewGroup.getChildAt(1);
        upgradeGiftContentView.f6243f = viewGroup.getChildAt(2);
        upgradeGiftContentView.f6244g = (FixedScrollView) viewGroup.getChildAt(3);
        upgradeGiftContentView.f6245h = (UnScrollVPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        upgradeGiftContentView.f6246i = viewGroup.getChildAt(4);
        upgradeGiftContentView.f6247j = (FrameLayout) viewGroup.getChildAt(5);
    }
}
