package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.voice.member.online.adapter.VoiceMemberOnlineItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ozn0 {
    /* JADX INFO: renamed from: a */
    public static void m19908a(VoiceMemberOnlineItem voiceMemberOnlineItem, View view) {
        voiceMemberOnlineItem.a = (VoiceMemberOnlineItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberOnlineItem.b = viewGroup.getChildAt(0);
        voiceMemberOnlineItem.c = viewGroup.getChildAt(1);
        voiceMemberOnlineItem.d = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        voiceMemberOnlineItem.e = (LinearLayout) viewGroup.getChildAt(3);
        voiceMemberOnlineItem.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceMemberOnlineItem.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        voiceMemberOnlineItem.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceMemberOnlineItem.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceMemberOnlineItem.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceMemberOnlineItem.k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceMemberOnlineItem.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceMemberOnlineItem.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceMemberOnlineItem.n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceMemberOnlineItem.o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceMemberOnlineItem.p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceMemberOnlineItem.q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceMemberOnlineItem.r = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceMemberOnlineItem.s = viewGroup.getChildAt(4);
    }
}
