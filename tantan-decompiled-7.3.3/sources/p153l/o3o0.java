package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class o3o0 {
    /* JADX INFO: renamed from: a */
    public static void m165880a(VoiceLiveMemberItem voiceLiveMemberItem, View view) {
        voiceLiveMemberItem.f54522a = (VoiceLiveMemberItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveMemberItem.f54523b = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceLiveMemberItem.f54524c = (VText) viewGroup.getChildAt(1);
        voiceLiveMemberItem.f54525d = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        voiceLiveMemberItem.f54526e = (LinearLayout) viewGroup.getChildAt(3);
        voiceLiveMemberItem.f54527f = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceLiveMemberItem.f54528g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        voiceLiveMemberItem.f54529h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceLiveMemberItem.f54530i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceLiveMemberItem.f54531j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceLiveMemberItem.f54532k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceLiveMemberItem.f54533l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceLiveMemberItem.f54534m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceLiveMemberItem.f54535n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceLiveMemberItem.f54536o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceLiveMemberItem.f54537p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceLiveMemberItem.f54538q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceLiveMemberItem.f54539r = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceLiveMemberItem.f54540s = (VText) viewGroup.getChildAt(4);
    }
}
