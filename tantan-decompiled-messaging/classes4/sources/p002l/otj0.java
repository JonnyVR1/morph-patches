package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftSelectButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class otj0 {
    /* JADX INFO: renamed from: a */
    public static void m19744a(UpgradeGiftSelectButton upgradeGiftSelectButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftSelectButton.f6293a = viewGroup.getChildAt(0);
        upgradeGiftSelectButton.f6294b = (TextView) viewGroup.getChildAt(1);
        upgradeGiftSelectButton.f6295c = (FrameLayout) viewGroup.getChildAt(2);
        upgradeGiftSelectButton.f6296d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        upgradeGiftSelectButton.f6297e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
