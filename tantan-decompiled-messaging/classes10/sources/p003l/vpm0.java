package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vpm0 {
    /* JADX INFO: renamed from: a */
    public static void m10255a(VoiceCallControlView voiceCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallControlView.a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallControlView.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallControlView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        voiceCallControlView.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceCallControlView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCallControlView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceCallControlView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        voiceCallControlView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
