package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzControlView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wkm0 {
    /* JADX INFO: renamed from: a */
    public static void m203684a(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBuzzCallControlView._add_time = (LoveBuzzControlView) viewGroup.getChildAt(0);
        voiceBuzzCallControlView._add_time_count = (VText) viewGroup.getChildAt(1);
        voiceBuzzCallControlView._mic = (LoveBuzzControlView) viewGroup.getChildAt(2);
        voiceBuzzCallControlView._quit = (LoveBuzzControlView) viewGroup.getChildAt(3);
        voiceBuzzCallControlView._speaker = (LoveBuzzControlView) viewGroup.getChildAt(4);
        voiceBuzzCallControlView._like = (LoveBuzzControlView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m203685b(VoiceBuzzCallControlView voiceBuzzCallControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106022G, viewGroup, true);
        m203684a(voiceBuzzCallControlView, viewInflate);
        return viewInflate;
    }
}
