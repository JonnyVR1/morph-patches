package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomCallButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fkm0 {
    /* JADX INFO: renamed from: a */
    public static void m13267a(VoiceBottomCallButton voiceBottomCallButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBottomCallButton.a = viewGroup.getChildAt(0);
        voiceBottomCallButton.b = viewGroup.getChildAt(1);
        voiceBottomCallButton.c = (TextView) viewGroup.getChildAt(2);
    }
}
