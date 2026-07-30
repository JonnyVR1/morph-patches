package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rzs {
    /* JADX INFO: renamed from: a */
    public static void m181761a(LiveIntlStarLeaderBoardEffectView liveIntlStarLeaderBoardEffectView, View view) {
        liveIntlStarLeaderBoardEffectView.f49990a = (LiveIntlStarLeaderBoardEffectView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveIntlStarLeaderBoardEffectView.f49991b = (VDraweeView) viewGroup.getChildAt(0);
        liveIntlStarLeaderBoardEffectView.f49992c = (FrameLayout) viewGroup.getChildAt(1);
        liveIntlStarLeaderBoardEffectView.f49993d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveIntlStarLeaderBoardEffectView.f49994e = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveIntlStarLeaderBoardEffectView.f49995f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
