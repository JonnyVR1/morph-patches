package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heatbox.VoiceLiveHeatBoxEntryView;
import p147v.VDraweeView;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class zpn0 {
    /* JADX INFO: renamed from: a */
    public static void m219699a(VoiceLiveHeatBoxEntryView voiceLiveHeatBoxEntryView, View view) {
        voiceLiveHeatBoxEntryView.f53183d = (VoiceLiveHeatBoxEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveHeatBoxEntryView.f53184e = viewGroup.getChildAt(0);
        voiceLiveHeatBoxEntryView.f53185f = (VDraweeView) viewGroup.getChildAt(1);
        voiceLiveHeatBoxEntryView.f53186g = (VMarqueeText) viewGroup.getChildAt(2);
        voiceLiveHeatBoxEntryView.f53187h = (VMarqueeText) viewGroup.getChildAt(3);
    }
}
