package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ddm {
    /* JADX INFO: renamed from: a */
    public static void m111041a(IdolUserUpgradeView idolUserUpgradeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        idolUserUpgradeView.f49978a = viewGroup.getChildAt(0);
        idolUserUpgradeView.f49979b = (FrameLayout) viewGroup.getChildAt(1);
        idolUserUpgradeView.f49980c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        idolUserUpgradeView.f49981d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        idolUserUpgradeView.f49982e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        idolUserUpgradeView.f49983f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        idolUserUpgradeView.f49984g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        idolUserUpgradeView.f49985h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
    }
}
