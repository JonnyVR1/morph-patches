package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uum0 {
    /* JADX INFO: renamed from: a */
    public static void m195383a(VoiceCardFanBaseEnterView voiceCardFanBaseEnterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardFanBaseEnterView.f53138a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardFanBaseEnterView.f53139b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardFanBaseEnterView.f53140c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardFanBaseEnterView.f53141d = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardFanBaseEnterView.f53142e = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
