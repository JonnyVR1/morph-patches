package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p000p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z9y {
    /* JADX INFO: renamed from: a */
    public static void m27141a(MemberLeaderViewDomestic memberLeaderViewDomestic, View view) {
        memberLeaderViewDomestic.f5268a = (MemberLeaderViewDomestic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberLeaderViewDomestic.f5269b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberLeaderViewDomestic.f5270c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberLeaderViewDomestic.f5271d = viewGroup.getChildAt(1);
        memberLeaderViewDomestic.f5272e = view.findViewById(g5c0.f10991W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        memberLeaderViewDomestic.f5273f = viewGroup2.getChildAt(2);
        memberLeaderViewDomestic.f5274g = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
        memberLeaderViewDomestic.f5275h = viewGroup2.getChildAt(3);
        memberLeaderViewDomestic.f5276i = (LiveMemberItem) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
    }
}
