package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class d5s {
    /* JADX INFO: renamed from: a */
    public static void m110070a(LiveCountdownView liveCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCountdownView.f49805a = (VDraweeView) viewGroup.getChildAt(0);
        liveCountdownView.f49806b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveCountdownView.f49807c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        liveCountdownView.f49808d = (CommonGiftCountDownView) viewGroup.getChildAt(3);
        liveCountdownView.f49809e = (AnimEffectPlayer) viewGroup.getChildAt(4);
    }
}
