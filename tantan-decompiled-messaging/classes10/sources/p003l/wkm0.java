package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wkm0 {
    /* JADX INFO: renamed from: a */
    public static void m10508a(VoiceBuzzCallControlView voiceBuzzCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBuzzCallControlView.d = viewGroup.getChildAt(0);
        voiceBuzzCallControlView.e = viewGroup.getChildAt(1);
        voiceBuzzCallControlView.f = viewGroup.getChildAt(2);
        voiceBuzzCallControlView.g = viewGroup.getChildAt(3);
        voiceBuzzCallControlView.h = viewGroup.getChildAt(4);
        voiceBuzzCallControlView.i = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m10509b(VoiceBuzzCallControlView voiceBuzzCallControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.G, viewGroup, true);
        m10508a(voiceBuzzCallControlView, viewInflate);
        return viewInflate;
    }
}
