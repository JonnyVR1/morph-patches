package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class lrm0 {
    /* JADX INFO: renamed from: a */
    public static void m155632a(VoiceBackgroundView voiceBackgroundView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBackgroundView.f54228a = (VDraweeView) viewGroup.getChildAt(0);
        voiceBackgroundView.f54229b = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
