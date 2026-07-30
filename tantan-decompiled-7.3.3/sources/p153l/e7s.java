package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class e7s {
    /* JADX INFO: renamed from: a */
    public static void m119768a(LiveCountdownView liveCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCountdownView.f50653a = (VDraweeView) viewGroup.getChildAt(0);
        liveCountdownView.f50654b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveCountdownView.f50655c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        liveCountdownView.f50656d = (CommonGiftCountDownView) viewGroup.getChildAt(3);
        liveCountdownView.f50657e = (AnimEffectPlayer) viewGroup.getChildAt(4);
    }
}
