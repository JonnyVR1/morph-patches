package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.manager.VoiceCallMemberManagerItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b0n0 {
    /* JADX INFO: renamed from: a */
    public static void m101329a(VoiceCallMemberManagerItemView voiceCallMemberManagerItemView, View view) {
        voiceCallMemberManagerItemView.f53697a = (VoiceCallMemberManagerItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallMemberManagerItemView.f53698b = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallMemberManagerItemView.f53699c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallMemberManagerItemView.f53700d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCallMemberManagerItemView.f53701e = (LinearLayout) viewGroup.getChildAt(1);
        voiceCallMemberManagerItemView.f53702f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCallMemberManagerItemView.f53703g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceCallMemberManagerItemView.f53704h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceCallMemberManagerItemView.f53705i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceCallMemberManagerItemView.f53706j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceCallMemberManagerItemView.f53707k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceCallMemberManagerItemView.f53708l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        voiceCallMemberManagerItemView.f53709m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        voiceCallMemberManagerItemView.f53710n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        voiceCallMemberManagerItemView.f53711o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        voiceCallMemberManagerItemView.f53712p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        voiceCallMemberManagerItemView.f53713q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        voiceCallMemberManagerItemView.f53714r = (VText) viewGroup.getChildAt(2);
    }
}
