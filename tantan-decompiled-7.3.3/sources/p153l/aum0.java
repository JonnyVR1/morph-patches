package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzControlView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aum0 {
    /* JADX INFO: renamed from: a */
    public static void m100401a(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBuzzCallControlView._add_time = (LoveBuzzControlView) viewGroup.getChildAt(0);
        voiceBuzzCallControlView._add_time_count = (VText) viewGroup.getChildAt(1);
        voiceBuzzCallControlView._mic = (LoveBuzzControlView) viewGroup.getChildAt(2);
        voiceBuzzCallControlView._quit = (LoveBuzzControlView) viewGroup.getChildAt(3);
        voiceBuzzCallControlView._speaker = (LoveBuzzControlView) viewGroup.getChildAt(4);
        voiceBuzzCallControlView._like = (LoveBuzzControlView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m100402b(VoiceBuzzCallControlView voiceBuzzCallControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136464G, viewGroup, true);
        m100401a(voiceBuzzCallControlView, viewInflate);
        return viewInflate;
    }
}
