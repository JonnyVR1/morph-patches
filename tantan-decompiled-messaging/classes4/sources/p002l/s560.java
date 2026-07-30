package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s560 {
    /* JADX INFO: renamed from: a */
    public static void m22208a(PacketProgressBar packetProgressBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetProgressBar._progressBarParent = viewGroup.getChildAt(0);
        packetProgressBar._progressBar = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        packetProgressBar._svga_progress = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        packetProgressBar._complete_layout = viewGroup.getChildAt(1);
        packetProgressBar._svga_complete = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        packetProgressBar._progressText = viewGroup.getChildAt(2);
    }
}
