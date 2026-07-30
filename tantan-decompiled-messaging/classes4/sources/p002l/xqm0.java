package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.voice.applymanager.manager.VoiceCallMemberManagerItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xqm0 {
    /* JADX INFO: renamed from: a */
    public static void m26067a(VoiceCallMemberManagerItemView voiceCallMemberManagerItemView, View view) {
        voiceCallMemberManagerItemView.a = (VoiceCallMemberManagerItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallMemberManagerItemView.b = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallMemberManagerItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallMemberManagerItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCallMemberManagerItemView.e = (LinearLayout) viewGroup.getChildAt(1);
        voiceCallMemberManagerItemView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCallMemberManagerItemView.g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceCallMemberManagerItemView.h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceCallMemberManagerItemView.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceCallMemberManagerItemView.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceCallMemberManagerItemView.k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceCallMemberManagerItemView.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceCallMemberManagerItemView.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceCallMemberManagerItemView.n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceCallMemberManagerItemView.o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceCallMemberManagerItemView.p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceCallMemberManagerItemView.q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceCallMemberManagerItemView.r = viewGroup.getChildAt(2);
    }
}
