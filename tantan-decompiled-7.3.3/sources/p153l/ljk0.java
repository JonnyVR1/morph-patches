package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.UserUpgradeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ljk0 {
    /* JADX INFO: renamed from: a */
    public static void m154511a(UserUpgradeView userUpgradeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userUpgradeView.f50881a = viewGroup.getChildAt(0);
        userUpgradeView.f50882b = (FrameLayout) viewGroup.getChildAt(1);
        userUpgradeView.f50883c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userUpgradeView.f50884d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        userUpgradeView.f50885e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        userUpgradeView.f50886f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        userUpgradeView.f50887g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        userUpgradeView.f50888h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        userUpgradeView.f50889i = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        userUpgradeView.f50890j = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
