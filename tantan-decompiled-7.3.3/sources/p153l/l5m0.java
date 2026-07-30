package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.friend.VirtualUserCardMatchView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.p068cp.VirtualVoiceSpFriendHeadView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class l5m0 {
    /* JADX INFO: renamed from: a */
    public static void m152974a(k5m0 k5m0Var, View view) {
        k5m0Var.f124087k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k5m0Var.f124088l = viewGroup.getChildAt(0);
        k5m0Var.f124089m = (FrameLayout) viewGroup.getChildAt(3);
        k5m0Var.f124090n = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        k5m0Var.f124091o = (VirtualVoiceUserCardMedalAndNameView) viewGroup.getChildAt(4);
        k5m0Var.f124092p = (VoiceCardGiftWallView) viewGroup.getChildAt(5);
        k5m0Var.f124093q = (VirtualVoiceSpFriendHeadView) viewGroup.getChildAt(6);
        k5m0Var.f124094r = (VoiceVirtualUserCardMiddleView) viewGroup.getChildAt(7);
        k5m0Var.f124095s = (VirtualUserCardMatchView) viewGroup.getChildAt(8);
        k5m0Var.f124096t = viewGroup.getChildAt(9);
        k5m0Var.f124097u = (VLinear) viewGroup.getChildAt(10);
        k5m0Var.f124098v = (VImage) viewGroup.getChildAt(11);
        k5m0Var.f124099w = (TextView) viewGroup.getChildAt(12);
        k5m0Var.f124100x = (VText) viewGroup.getChildAt(13);
        k5m0Var.f124101y = viewGroup.getChildAt(14);
        k5m0Var.f124102z = (AnimEffectPlayer) viewGroup.getChildAt(15);
        k5m0Var.f124080A = (VideoEffectPlayer) viewGroup.getChildAt(16);
        k5m0Var.f124081B = (AnimEffectPlayer) viewGroup.getChildAt(17);
    }
}
