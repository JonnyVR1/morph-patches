package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.items.gifteffect.VoiceIntlGiftEffectSwitchItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wnn0 {
    /* JADX INFO: renamed from: a */
    public static void m207219a(VoiceIntlGiftEffectSwitchItemView voiceIntlGiftEffectSwitchItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceIntlGiftEffectSwitchItemView.f53782a = (FrameLayout) viewGroup.getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f53783b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f53784c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceIntlGiftEffectSwitchItemView.f53785d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f53786e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        voiceIntlGiftEffectSwitchItemView.f53787f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        voiceIntlGiftEffectSwitchItemView.f53788g = (VText) viewGroup.getChildAt(1);
    }
}
