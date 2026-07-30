package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.friend.VirtualUserCardMatchView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.p063cp.VirtualVoiceSpFriendHeadView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hwl0 {
    /* JADX INFO: renamed from: a */
    public static void m133251a(gwl0 gwl0Var, View view) {
        gwl0Var.f104726k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gwl0Var.f104727l = viewGroup.getChildAt(0);
        gwl0Var.f104728m = (FrameLayout) viewGroup.getChildAt(3);
        gwl0Var.f104729n = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        gwl0Var.f104730o = (VirtualVoiceUserCardMedalAndNameView) viewGroup.getChildAt(4);
        gwl0Var.f104731p = (VoiceCardGiftWallView) viewGroup.getChildAt(5);
        gwl0Var.f104732q = (VirtualVoiceSpFriendHeadView) viewGroup.getChildAt(6);
        gwl0Var.f104733r = (VoiceVirtualUserCardMiddleView) viewGroup.getChildAt(7);
        gwl0Var.f104734s = (VirtualUserCardMatchView) viewGroup.getChildAt(8);
        gwl0Var.f104735t = viewGroup.getChildAt(9);
        gwl0Var.f104736u = (VLinear) viewGroup.getChildAt(10);
        gwl0Var.f104737v = (VImage) viewGroup.getChildAt(11);
        gwl0Var.f104738w = (TextView) viewGroup.getChildAt(12);
        gwl0Var.f104739x = (VText) viewGroup.getChildAt(13);
        gwl0Var.f104740y = viewGroup.getChildAt(14);
        gwl0Var.f104741z = (AnimEffectPlayer) viewGroup.getChildAt(15);
        gwl0Var.f104719A = (VideoEffectPlayer) viewGroup.getChildAt(16);
        gwl0Var.f104720B = (AnimEffectPlayer) viewGroup.getChildAt(17);
    }
}
