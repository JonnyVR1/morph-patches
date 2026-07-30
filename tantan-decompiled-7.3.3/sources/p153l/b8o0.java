package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceMemberLeaderView;
import p151v.VButton;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class b8o0 {
    /* JADX INFO: renamed from: a */
    public static void m103026a(VoiceMemberLeaderView voiceMemberLeaderView, View view) {
        voiceMemberLeaderView.f54542a = (VoiceMemberLeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberLeaderView.f54543b = (VRecyclerView) viewGroup.getChildAt(0);
        voiceMemberLeaderView.f54544c = (VLinear) viewGroup.getChildAt(1);
        voiceMemberLeaderView.f54545d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
