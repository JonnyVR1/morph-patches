package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bxo0 {
    /* JADX INFO: renamed from: a */
    public static void m104368a(axo0 axo0Var, View view) {
        axo0Var.f72214k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        axo0Var.f72215l = viewGroup.getChildAt(0);
        axo0Var.f72216m = (FrameLayout) viewGroup.getChildAt(3);
        axo0Var.f72217n = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        axo0Var.f72218o = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        axo0Var.f72219p = (CommonMaskAvatarView) viewGroup.getChildAt(4);
        axo0Var.f72220q = (VoiceUserCardMedalAndNameView) viewGroup.getChildAt(5);
        axo0Var.f72221r = (VFrame) viewGroup.getChildAt(6);
        axo0Var.f72222s = (VLinear) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        axo0Var.f72223t = (VoiceCardUserLevelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        axo0Var.f72224u = (VoiceCardAnchorLevelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        axo0Var.f72225v = (VoiceCardFanBaseEnterView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        axo0Var.f72226w = (VoiceCardMedalWallEnterView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        axo0Var.f72227x = (UserCardFamilyGroupView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        axo0Var.f72228y = (VoiceCardGiftWallView) viewGroup.getChildAt(7);
        axo0Var.f72229z = (LinearLayout) viewGroup.getChildAt(8);
        axo0Var.f72197A = (VoiceSweetCpHeadView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        axo0Var.f72198B = (LinearLayout) viewGroup.getChildAt(9);
        axo0Var.f72199C = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        axo0Var.f72200D = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        axo0Var.f72201E = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2);
        axo0Var.f72202F = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(3);
        axo0Var.f72203G = (VImage) viewGroup.getChildAt(10);
        axo0Var.f72204H = (VText) viewGroup.getChildAt(11);
        axo0Var.f72205I = viewGroup.getChildAt(12);
        axo0Var.f72206J = (AnimEffectPlayer) viewGroup.getChildAt(13);
        axo0Var.f72207K = (VideoEffectPlayer) viewGroup.getChildAt(14);
    }
}
