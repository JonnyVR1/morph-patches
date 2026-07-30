package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.quickaudio.view.QuickAudioCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kpb0 {
    /* JADX INFO: renamed from: a */
    public static void m7631a(QuickAudioCardView quickAudioCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickAudioCardView.a = viewGroup.getChildAt(1);
        quickAudioCardView.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        quickAudioCardView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        quickAudioCardView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        quickAudioCardView.e = viewGroup.getChildAt(2);
        quickAudioCardView.f = viewGroup.getChildAt(3);
        quickAudioCardView.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickAudioCardView.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickAudioCardView.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        quickAudioCardView.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        quickAudioCardView.k = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        quickAudioCardView.l = (FrameLayout) viewGroup.getChildAt(4);
        quickAudioCardView.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
