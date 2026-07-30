package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceMemberLeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xyn0 {
    /* JADX INFO: renamed from: a */
    public static void m26274a(VoiceMemberLeaderView voiceMemberLeaderView, View view) {
        voiceMemberLeaderView.a = (VoiceMemberLeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberLeaderView.b = viewGroup.getChildAt(0);
        voiceMemberLeaderView.c = viewGroup.getChildAt(1);
        voiceMemberLeaderView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
