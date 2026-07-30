package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftSelectButton;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class atj0 {
    /* JADX INFO: renamed from: a */
    public static void m98816a(UpgradeGiftPagerItemView upgradeGiftPagerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftPagerItemView.f50228d = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        upgradeGiftPagerItemView.f50229e = (XEGiftView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        upgradeGiftPagerItemView.f50230f = (VDraweeView) viewGroup.getChildAt(1);
        upgradeGiftPagerItemView.f50231g = (TextView) viewGroup.getChildAt(2);
        upgradeGiftPagerItemView.f50232h = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        upgradeGiftPagerItemView.f50233i = (XEGiftView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        upgradeGiftPagerItemView.f50234j = (VDraweeView) viewGroup.getChildAt(4);
        upgradeGiftPagerItemView.f50235k = (TextView) viewGroup.getChildAt(5);
        upgradeGiftPagerItemView.f50236l = (TextView) viewGroup.getChildAt(6);
        upgradeGiftPagerItemView.f50237m = (UpgradeGiftSelectButton) viewGroup.getChildAt(7);
    }
}
