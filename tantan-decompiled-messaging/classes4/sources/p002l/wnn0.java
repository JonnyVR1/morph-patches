package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndHeartBeatItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wnn0 {
    /* JADX INFO: renamed from: a */
    public static void m25255a(VoiceLiveEndHeartBeatItemView voiceLiveEndHeartBeatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveEndHeartBeatItemView.a = viewGroup.getChildAt(0);
        voiceLiveEndHeartBeatItemView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLiveEndHeartBeatItemView.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceLiveEndHeartBeatItemView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceLiveEndHeartBeatItemView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        voiceLiveEndHeartBeatItemView.f = viewGroup.getChildAt(2);
    }
}
