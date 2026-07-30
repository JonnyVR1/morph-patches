package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceMemberLeaderView;
import p147v.VButton;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class xyn0 {
    /* JADX INFO: renamed from: a */
    public static void m211862a(VoiceMemberLeaderView voiceMemberLeaderView, View view) {
        voiceMemberLeaderView.f53694a = (VoiceMemberLeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberLeaderView.f53695b = (VRecyclerView) viewGroup.getChildAt(0);
        voiceMemberLeaderView.f53696c = (VLinear) viewGroup.getChildAt(1);
        voiceMemberLeaderView.f53697d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
