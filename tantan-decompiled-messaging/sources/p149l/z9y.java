package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p046p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;
import p147v.VButton;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class z9y {
    /* JADX INFO: renamed from: a */
    public static void m217707a(MemberLeaderViewDomestic memberLeaderViewDomestic, View view) {
        memberLeaderViewDomestic.f49226a = (MemberLeaderViewDomestic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberLeaderViewDomestic.f49227b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberLeaderViewDomestic.f49228c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberLeaderViewDomestic.f49229d = (SwipeRefreshLayout) viewGroup.getChildAt(1);
        memberLeaderViewDomestic.f49230e = (VRecyclerView) view.findViewById(g5c0.f100841W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        memberLeaderViewDomestic.f49231f = (VLinear) viewGroup2.getChildAt(2);
        memberLeaderViewDomestic.f49232g = (VButton) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
        memberLeaderViewDomestic.f49233h = viewGroup2.getChildAt(3);
        memberLeaderViewDomestic.f49234i = (LiveMemberItem) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
    }
}
