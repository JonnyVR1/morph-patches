package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressBar;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yd60 {
    /* JADX INFO: renamed from: a */
    public static void m215186a(PacketProgressBar packetProgressBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetProgressBar._progressBarParent = (VFrame) viewGroup.getChildAt(0);
        packetProgressBar._progressBar = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        packetProgressBar._svga_progress = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        packetProgressBar._complete_layout = (VFrame) viewGroup.getChildAt(1);
        packetProgressBar._svga_complete = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        packetProgressBar._progressText = (VText) viewGroup.getChildAt(2);
    }
}
