package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heatbox.VoiceLiveHeatBoxEntryView;
import p151v.VDraweeView;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class dzn0 {
    /* JADX INFO: renamed from: a */
    public static void m118755a(VoiceLiveHeatBoxEntryView voiceLiveHeatBoxEntryView, View view) {
        voiceLiveHeatBoxEntryView.f54031d = (VoiceLiveHeatBoxEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveHeatBoxEntryView.f54032e = viewGroup.getChildAt(0);
        voiceLiveHeatBoxEntryView.f54033f = (VDraweeView) viewGroup.getChildAt(1);
        voiceLiveHeatBoxEntryView.f54034g = (VMarqueeText) viewGroup.getChildAt(2);
        voiceLiveHeatBoxEntryView.f54035h = (VMarqueeText) viewGroup.getChildAt(3);
    }
}
