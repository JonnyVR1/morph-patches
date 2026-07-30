package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class bwo0 {
    /* JADX INFO: renamed from: a */
    public static void m104164a(VoiceTripleDiceView voiceTripleDiceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTripleDiceView.f53118a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceTripleDiceView.f53119b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceTripleDiceView.f53120c = (AnimEffectPlayer) viewGroup.getChildAt(2);
        voiceTripleDiceView.f53121d = (VDraweeView) viewGroup.getChildAt(3);
        voiceTripleDiceView.f53122e = (VDraweeView) viewGroup.getChildAt(4);
        voiceTripleDiceView.f53123f = (VDraweeView) viewGroup.getChildAt(5);
    }
}
