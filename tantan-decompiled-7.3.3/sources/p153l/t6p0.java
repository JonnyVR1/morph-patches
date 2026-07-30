package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.head.VoiceUserCardHeadView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardHeadRatioView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class t6p0 {
    /* JADX INFO: renamed from: a */
    public static void m189543a(VoiceUserCardHeadView voiceUserCardHeadView, View view) {
        voiceUserCardHeadView.f54686a = (VoiceUserCardHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceUserCardHeadView.f54687b = (VoiceUserCardHeadRatioView) viewGroup.getChildAt(0);
        voiceUserCardHeadView.f54688c = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceUserCardHeadView.f54689d = (AnimEffectPlayer) viewGroup.getChildAt(2);
        voiceUserCardHeadView.f54690e = (VImage) viewGroup.getChildAt(3);
    }
}
