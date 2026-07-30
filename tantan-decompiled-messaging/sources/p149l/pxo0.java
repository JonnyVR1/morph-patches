package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.head.VoiceUserCardHeadView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardHeadRatioView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class pxo0 {
    /* JADX INFO: renamed from: a */
    public static void m171947a(VoiceUserCardHeadView voiceUserCardHeadView, View view) {
        voiceUserCardHeadView.f53838a = (VoiceUserCardHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceUserCardHeadView.f53839b = (VoiceUserCardHeadRatioView) viewGroup.getChildAt(0);
        voiceUserCardHeadView.f53840c = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceUserCardHeadView.f53841d = (AnimEffectPlayer) viewGroup.getChildAt(2);
        voiceUserCardHeadView.f53842e = (VImage) viewGroup.getChildAt(3);
    }
}
