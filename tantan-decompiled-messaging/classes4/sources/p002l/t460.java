package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.CircleCountdownView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketCountdownView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t460 {
    /* JADX INFO: renamed from: a */
    public static void m22789a(PacketCountdownView packetCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetCountdownView._circleCountdown = (CircleCountdownView) viewGroup.getChildAt(0);
        packetCountdownView._countdownText = viewGroup.getChildAt(1);
    }
}
