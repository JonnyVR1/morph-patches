package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class him0 {
    /* JADX INFO: renamed from: a */
    public static void m131292a(VoiceBackgroundView voiceBackgroundView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBackgroundView.f53380a = (VDraweeView) viewGroup.getChildAt(0);
        voiceBackgroundView.f53381b = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
