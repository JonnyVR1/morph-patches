package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kun0 {
    /* JADX INFO: renamed from: a */
    public static void m16826a(VoiceLiveMemberItem voiceLiveMemberItem, View view) {
        voiceLiveMemberItem.a = (VoiceLiveMemberItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveMemberItem.b = viewGroup.getChildAt(0);
        voiceLiveMemberItem.c = viewGroup.getChildAt(1);
        voiceLiveMemberItem.d = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        voiceLiveMemberItem.e = (LinearLayout) viewGroup.getChildAt(3);
        voiceLiveMemberItem.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceLiveMemberItem.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        voiceLiveMemberItem.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceLiveMemberItem.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceLiveMemberItem.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceLiveMemberItem.k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceLiveMemberItem.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceLiveMemberItem.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceLiveMemberItem.n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceLiveMemberItem.o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceLiveMemberItem.p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceLiveMemberItem.q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceLiveMemberItem.r = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceLiveMemberItem.s = viewGroup.getChildAt(4);
    }
}
