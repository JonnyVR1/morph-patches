package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.items.gifteffect.VoiceIntlGiftEffectSwitchItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sen0 {
    /* JADX INFO: renamed from: a */
    public static void m183675a(VoiceIntlGiftEffectSwitchItemView voiceIntlGiftEffectSwitchItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceIntlGiftEffectSwitchItemView.f52934a = (FrameLayout) viewGroup.getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f52935b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f52936c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceIntlGiftEffectSwitchItemView.f52937d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f52938e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f52939f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        voiceIntlGiftEffectSwitchItemView.f52940g = (VText) viewGroup.getChildAt(1);
    }
}
