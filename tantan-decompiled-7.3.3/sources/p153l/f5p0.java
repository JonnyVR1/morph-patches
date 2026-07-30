package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class f5p0 {
    /* JADX INFO: renamed from: a */
    public static void m124158a(VoiceTripleDiceView voiceTripleDiceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTripleDiceView.f53966a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceTripleDiceView.f53967b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceTripleDiceView.f53968c = (AnimEffectPlayer) viewGroup.getChildAt(2);
        voiceTripleDiceView.f53969d = (VDraweeView) viewGroup.getChildAt(3);
        voiceTripleDiceView.f53970e = (VDraweeView) viewGroup.getChildAt(4);
        voiceTripleDiceView.f53971f = (VDraweeView) viewGroup.getChildAt(5);
    }
}
