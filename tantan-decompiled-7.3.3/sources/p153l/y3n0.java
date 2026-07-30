package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class y3n0 {
    /* JADX INFO: renamed from: a */
    public static void m214152a(VoiceCardFanBaseEnterView voiceCardFanBaseEnterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardFanBaseEnterView.f53986a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardFanBaseEnterView.f53987b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardFanBaseEnterView.f53988c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardFanBaseEnterView.f53989d = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardFanBaseEnterView.f53990e = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
