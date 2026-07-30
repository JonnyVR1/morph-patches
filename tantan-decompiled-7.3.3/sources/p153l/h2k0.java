package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerView;
import p151v.VDraweeView;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class h2k0 {
    /* JADX INFO: renamed from: a */
    public static void m133393a(UpgradeGiftPagerView upgradeGiftPagerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftPagerView.f51089d = (VDraweeView) viewGroup.getChildAt(0);
        upgradeGiftPagerView.f51090e = viewGroup.getChildAt(1);
        upgradeGiftPagerView.f51091f = (TextView) viewGroup.getChildAt(2);
        upgradeGiftPagerView.f51092g = viewGroup.getChildAt(3);
        upgradeGiftPagerView.f51093h = (VPager) viewGroup.getChildAt(4);
    }
}
