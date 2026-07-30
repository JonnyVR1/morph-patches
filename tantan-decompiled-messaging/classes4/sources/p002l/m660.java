package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketCountdownView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressBar;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m660 {
    /* JADX INFO: renamed from: a */
    public static void m17722a(PacketProgressView packetProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetProgressView._countdownView = (PacketCountdownView) viewGroup.getChildAt(0);
        packetProgressView._progressBar = (PacketProgressBar) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m17723b(PacketProgressView packetProgressView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19925m1, viewGroup, false);
        m17722a(packetProgressView, viewInflate);
        return viewInflate;
    }
}
