package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.member.view.MemberLeaderView;
import p147v.VButton;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class aay {
    /* JADX INFO: renamed from: a */
    public static void m95577a(MemberLeaderView memberLeaderView, View view) {
        memberLeaderView.f49236a = (MemberLeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberLeaderView.f49237b = (VRecyclerView) viewGroup.getChildAt(0);
        memberLeaderView.f49238c = (VLinear) viewGroup.getChildAt(1);
        memberLeaderView.f49239d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
