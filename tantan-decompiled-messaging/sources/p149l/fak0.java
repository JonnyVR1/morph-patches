package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.UserUpgradeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fak0 {
    /* JADX INFO: renamed from: a */
    public static void m120216a(UserUpgradeView userUpgradeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userUpgradeView.f50033a = viewGroup.getChildAt(0);
        userUpgradeView.f50034b = (FrameLayout) viewGroup.getChildAt(1);
        userUpgradeView.f50035c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userUpgradeView.f50036d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        userUpgradeView.f50037e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        userUpgradeView.f50038f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        userUpgradeView.f50039g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        userUpgradeView.f50040h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        userUpgradeView.f50041i = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        userUpgradeView.f50042j = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
