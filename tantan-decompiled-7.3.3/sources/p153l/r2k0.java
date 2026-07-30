package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftSelectButton;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class r2k0 {
    /* JADX INFO: renamed from: a */
    public static void m179542a(UpgradeGiftSelectButton upgradeGiftSelectButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftSelectButton.f51099a = (VDraweeView) viewGroup.getChildAt(0);
        upgradeGiftSelectButton.f51100b = (TextView) viewGroup.getChildAt(1);
        upgradeGiftSelectButton.f51101c = (FrameLayout) viewGroup.getChildAt(2);
        upgradeGiftSelectButton.f51102d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        upgradeGiftSelectButton.f51103e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
