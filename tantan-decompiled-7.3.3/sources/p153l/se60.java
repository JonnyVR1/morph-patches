package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketCountdownView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressBar;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;

/* JADX INFO: loaded from: classes4.dex */
public class se60 {
    /* JADX INFO: renamed from: a */
    public static void m185520a(PacketProgressView packetProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetProgressView._countdownView = (PacketCountdownView) viewGroup.getChildAt(0);
        packetProgressView._progressBar = (PacketProgressBar) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m185521b(PacketProgressView packetProgressView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199161m1, viewGroup, false);
        m185520a(packetProgressView, viewInflate);
        return viewInflate;
    }
}
