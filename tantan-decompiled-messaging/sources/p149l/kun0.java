package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kun0 {
    /* JADX INFO: renamed from: a */
    public static void m147288a(VoiceLiveMemberItem voiceLiveMemberItem, View view) {
        voiceLiveMemberItem.f53674a = (VoiceLiveMemberItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveMemberItem.f53675b = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceLiveMemberItem.f53676c = (VText) viewGroup.getChildAt(1);
        voiceLiveMemberItem.f53677d = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        voiceLiveMemberItem.f53678e = (LinearLayout) viewGroup.getChildAt(3);
        voiceLiveMemberItem.f53679f = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceLiveMemberItem.f53680g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        voiceLiveMemberItem.f53681h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceLiveMemberItem.f53682i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceLiveMemberItem.f53683j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceLiveMemberItem.f53684k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceLiveMemberItem.f53685l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceLiveMemberItem.f53686m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceLiveMemberItem.f53687n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceLiveMemberItem.f53688o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceLiveMemberItem.f53689p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceLiveMemberItem.f53690q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceLiveMemberItem.f53691r = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceLiveMemberItem.f53692s = (VText) viewGroup.getChildAt(4);
    }
}
