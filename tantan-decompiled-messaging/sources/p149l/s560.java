package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressBar;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s560 {
    /* JADX INFO: renamed from: a */
    public static void m182319a(PacketProgressBar packetProgressBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetProgressBar._progressBarParent = (VFrame) viewGroup.getChildAt(0);
        packetProgressBar._progressBar = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        packetProgressBar._svga_progress = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        packetProgressBar._complete_layout = (VFrame) viewGroup.getChildAt(1);
        packetProgressBar._svga_complete = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        packetProgressBar._progressText = (VText) viewGroup.getChildAt(2);
    }
}
