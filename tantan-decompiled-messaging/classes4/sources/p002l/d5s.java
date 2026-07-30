package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d5s {
    /* JADX INFO: renamed from: a */
    public static void m11604a(LiveCountdownView liveCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCountdownView.f5847a = viewGroup.getChildAt(0);
        liveCountdownView.f5848b = viewGroup.getChildAt(1);
        liveCountdownView.f5849c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        liveCountdownView.f5850d = (CommonGiftCountDownView) viewGroup.getChildAt(3);
        liveCountdownView.f5851e = viewGroup.getChildAt(4);
    }
}
