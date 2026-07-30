package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uum0 {
    /* JADX INFO: renamed from: a */
    public static void m23643a(VoiceCardFanBaseEnterView voiceCardFanBaseEnterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardFanBaseEnterView.a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardFanBaseEnterView.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardFanBaseEnterView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardFanBaseEnterView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardFanBaseEnterView.e = viewGroup.getChildAt(1);
    }
}
