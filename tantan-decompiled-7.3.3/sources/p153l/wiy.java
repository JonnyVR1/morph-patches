package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p051p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;
import p151v.VButton;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class wiy {
    /* JADX INFO: renamed from: a */
    public static void m206614a(MemberLeaderViewDomestic memberLeaderViewDomestic, View view) {
        memberLeaderViewDomestic.f50074a = (MemberLeaderViewDomestic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberLeaderViewDomestic.f50075b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberLeaderViewDomestic.f50076c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberLeaderViewDomestic.f50077d = (SwipeRefreshLayout) viewGroup.getChildAt(1);
        memberLeaderViewDomestic.f50078e = (VRecyclerView) view.findViewById(mdc0.f136086W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        memberLeaderViewDomestic.f50079f = (VLinear) viewGroup2.getChildAt(2);
        memberLeaderViewDomestic.f50080g = (VButton) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
        memberLeaderViewDomestic.f50081h = viewGroup2.getChildAt(3);
        memberLeaderViewDomestic.f50082i = (LiveMemberItem) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
    }
}
