package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.CircleCountdownView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketCountdownView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zc60 {
    /* JADX INFO: renamed from: a */
    public static void m219235a(PacketCountdownView packetCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetCountdownView._circleCountdown = (CircleCountdownView) viewGroup.getChildAt(0);
        packetCountdownView._countdownText = (VText) viewGroup.getChildAt(1);
    }
}
