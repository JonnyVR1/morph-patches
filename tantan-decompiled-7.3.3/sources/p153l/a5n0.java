package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a5n0 {
    /* JADX INFO: renamed from: a */
    public static void m96238a(VoiceCardUserLevelView voiceCardUserLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardUserLevelView.f54737a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardUserLevelView.f54738b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardUserLevelView.f54739c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardUserLevelView.f54740d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardUserLevelView.f54741e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceCardUserLevelView.f54742f = (RelativeLayout) viewGroup.getChildAt(1);
        voiceCardUserLevelView.f54743g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCardUserLevelView.f54744h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceCardUserLevelView.f54745i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceCardUserLevelView.f54746j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceCardUserLevelView.f54747k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        voiceCardUserLevelView.f54748l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        voiceCardUserLevelView.f54749m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
