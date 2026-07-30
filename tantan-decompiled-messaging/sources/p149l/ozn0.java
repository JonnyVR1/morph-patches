package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.member.online.adapter.VoiceMemberOnlineItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ozn0 {
    /* JADX INFO: renamed from: a */
    public static void m166889a(VoiceMemberOnlineItem voiceMemberOnlineItem, View view) {
        voiceMemberOnlineItem.f53654a = (VoiceMemberOnlineItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberOnlineItem.f53655b = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceMemberOnlineItem.f53656c = (VText) viewGroup.getChildAt(1);
        voiceMemberOnlineItem.f53657d = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        voiceMemberOnlineItem.f53658e = (LinearLayout) viewGroup.getChildAt(3);
        voiceMemberOnlineItem.f53659f = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceMemberOnlineItem.f53660g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        voiceMemberOnlineItem.f53661h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceMemberOnlineItem.f53662i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceMemberOnlineItem.f53663j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceMemberOnlineItem.f53664k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceMemberOnlineItem.f53665l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceMemberOnlineItem.f53666m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceMemberOnlineItem.f53667n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceMemberOnlineItem.f53668o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceMemberOnlineItem.f53669p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceMemberOnlineItem.f53670q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceMemberOnlineItem.f53671r = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceMemberOnlineItem.f53672s = (VText) viewGroup.getChildAt(4);
    }
}
