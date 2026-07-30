package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftSelectButton;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class d2k0 {
    /* JADX INFO: renamed from: a */
    public static void m113704a(UpgradeGiftPagerItemView upgradeGiftPagerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftPagerItemView.f51076d = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        upgradeGiftPagerItemView.f51077e = (XEGiftView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        upgradeGiftPagerItemView.f51078f = (VDraweeView) viewGroup.getChildAt(1);
        upgradeGiftPagerItemView.f51079g = (TextView) viewGroup.getChildAt(2);
        upgradeGiftPagerItemView.f51080h = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        upgradeGiftPagerItemView.f51081i = (XEGiftView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        upgradeGiftPagerItemView.f51082j = (VDraweeView) viewGroup.getChildAt(4);
        upgradeGiftPagerItemView.f51083k = (TextView) viewGroup.getChildAt(5);
        upgradeGiftPagerItemView.f51084l = (TextView) viewGroup.getChildAt(6);
        upgradeGiftPagerItemView.f51085m = (UpgradeGiftSelectButton) viewGroup.getChildAt(7);
    }
}
