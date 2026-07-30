package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.heartbeat.VoiceTopHeartBeatView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ruo0 {
    /* JADX INFO: renamed from: a */
    public static void m22128a(VoiceTopHeartBeatView voiceTopHeartBeatView, View view) {
        voiceTopHeartBeatView.c = (VoiceTopHeartBeatView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopHeartBeatView.d = viewGroup.getChildAt(0);
        voiceTopHeartBeatView.e = (TextView) viewGroup.getChildAt(1);
    }
}
