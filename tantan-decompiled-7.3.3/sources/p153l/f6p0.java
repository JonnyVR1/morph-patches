package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f6p0 {
    /* JADX INFO: renamed from: a */
    public static void m124321a(e6p0 e6p0Var, View view) {
        e6p0Var.f92323k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e6p0Var.f92324l = viewGroup.getChildAt(0);
        e6p0Var.f92325m = (FrameLayout) viewGroup.getChildAt(3);
        e6p0Var.f92326n = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        e6p0Var.f92327o = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        e6p0Var.f92328p = (CommonMaskAvatarView) viewGroup.getChildAt(4);
        e6p0Var.f92329q = (VoiceUserCardMedalAndNameView) viewGroup.getChildAt(5);
        e6p0Var.f92330r = (VFrame) viewGroup.getChildAt(6);
        e6p0Var.f92331s = (VLinear) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        e6p0Var.f92332t = (VoiceCardUserLevelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        e6p0Var.f92333u = (VoiceCardAnchorLevelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        e6p0Var.f92334v = (VoiceCardFanBaseEnterView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        e6p0Var.f92335w = (VoiceCardMedalWallEnterView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        e6p0Var.f92336x = (UserCardFamilyGroupView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        e6p0Var.f92337y = (VoiceCardGiftWallView) viewGroup.getChildAt(7);
        e6p0Var.f92338z = (LinearLayout) viewGroup.getChildAt(8);
        e6p0Var.f92306A = (VoiceSweetCpHeadView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        e6p0Var.f92307B = (LinearLayout) viewGroup.getChildAt(9);
        e6p0Var.f92308C = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        e6p0Var.f92309D = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        e6p0Var.f92310E = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2);
        e6p0Var.f92311F = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(3);
        e6p0Var.f92312G = (VImage) viewGroup.getChildAt(10);
        e6p0Var.f92313H = (VText) viewGroup.getChildAt(11);
        e6p0Var.f92314I = viewGroup.getChildAt(12);
        e6p0Var.f92315J = (AnimEffectPlayer) viewGroup.getChildAt(13);
        e6p0Var.f92316K = (VideoEffectPlayer) viewGroup.getChildAt(14);
    }
}
