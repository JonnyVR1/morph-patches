package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s1t {
    /* JADX INFO: renamed from: a */
    public static void m184060a(LiveIntlStarLeaderBoardEffectView liveIntlStarLeaderBoardEffectView, View view) {
        liveIntlStarLeaderBoardEffectView.f50838a = (LiveIntlStarLeaderBoardEffectView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveIntlStarLeaderBoardEffectView.f50839b = (VDraweeView) viewGroup.getChildAt(0);
        liveIntlStarLeaderBoardEffectView.f50840c = (FrameLayout) viewGroup.getChildAt(1);
        liveIntlStarLeaderBoardEffectView.f50841d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveIntlStarLeaderBoardEffectView.f50842e = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveIntlStarLeaderBoardEffectView.f50843f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
