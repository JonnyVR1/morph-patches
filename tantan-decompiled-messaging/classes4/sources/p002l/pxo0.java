package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.voice.usercard.submodule.head.VoiceUserCardHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pxo0 {
    /* JADX INFO: renamed from: a */
    public static void m20751a(VoiceUserCardHeadView voiceUserCardHeadView, View view) {
        voiceUserCardHeadView.a = (VoiceUserCardHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceUserCardHeadView.b = viewGroup.getChildAt(0);
        voiceUserCardHeadView.c = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceUserCardHeadView.d = viewGroup.getChildAt(2);
        voiceUserCardHeadView.e = viewGroup.getChildAt(3);
    }
}
