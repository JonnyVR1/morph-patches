package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tfm {
    /* JADX INFO: renamed from: a */
    public static void m190955a(IdolUserUpgradeView idolUserUpgradeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        idolUserUpgradeView.f50826a = viewGroup.getChildAt(0);
        idolUserUpgradeView.f50827b = (FrameLayout) viewGroup.getChildAt(1);
        idolUserUpgradeView.f50828c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        idolUserUpgradeView.f50829d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        idolUserUpgradeView.f50830e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        idolUserUpgradeView.f50831f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        idolUserUpgradeView.f50832g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        idolUserUpgradeView.f50833h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
    }
}
