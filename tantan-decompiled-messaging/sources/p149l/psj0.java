package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.FixedScrollView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;

/* JADX INFO: loaded from: classes4.dex */
public class psj0 {
    /* JADX INFO: renamed from: a */
    public static void m171157a(UpgradeGiftContentView upgradeGiftContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftContentView.f50199d = viewGroup.getChildAt(0);
        upgradeGiftContentView.f50200e = viewGroup.getChildAt(1);
        upgradeGiftContentView.f50201f = (TabLayout) viewGroup.getChildAt(2);
        upgradeGiftContentView.f50202g = (FixedScrollView) viewGroup.getChildAt(3);
        upgradeGiftContentView.f50203h = (UnScrollVPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        upgradeGiftContentView.f50204i = viewGroup.getChildAt(4);
        upgradeGiftContentView.f50205j = (FrameLayout) viewGroup.getChildAt(5);
    }
}
