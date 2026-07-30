package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftSelectButton;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class otj0 {
    /* JADX INFO: renamed from: a */
    public static void m165946a(UpgradeGiftSelectButton upgradeGiftSelectButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftSelectButton.f50251a = (VDraweeView) viewGroup.getChildAt(0);
        upgradeGiftSelectButton.f50252b = (TextView) viewGroup.getChildAt(1);
        upgradeGiftSelectButton.f50253c = (FrameLayout) viewGroup.getChildAt(2);
        upgradeGiftSelectButton.f50254d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        upgradeGiftSelectButton.f50255e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
