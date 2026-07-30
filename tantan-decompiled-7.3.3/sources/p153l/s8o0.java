package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.member.online.adapter.VoiceMemberOnlineItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s8o0 {
    /* JADX INFO: renamed from: a */
    public static void m185103a(VoiceMemberOnlineItem voiceMemberOnlineItem, View view) {
        voiceMemberOnlineItem.f54502a = (VoiceMemberOnlineItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberOnlineItem.f54503b = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceMemberOnlineItem.f54504c = (VText) viewGroup.getChildAt(1);
        voiceMemberOnlineItem.f54505d = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        voiceMemberOnlineItem.f54506e = (LinearLayout) viewGroup.getChildAt(3);
        voiceMemberOnlineItem.f54507f = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceMemberOnlineItem.f54508g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        voiceMemberOnlineItem.f54509h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceMemberOnlineItem.f54510i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceMemberOnlineItem.f54511j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceMemberOnlineItem.f54512k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceMemberOnlineItem.f54513l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceMemberOnlineItem.f54514m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceMemberOnlineItem.f54515n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceMemberOnlineItem.f54516o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceMemberOnlineItem.f54517p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceMemberOnlineItem.f54518q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceMemberOnlineItem.f54519r = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceMemberOnlineItem.f54520s = (VText) viewGroup.getChildAt(4);
    }
}
