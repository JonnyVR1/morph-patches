package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p051p1.mobile.putong.live.livingroom.common.member.view.MemberWeekLeaderBoardContentView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class pny {
    /* JADX INFO: renamed from: a */
    public static void m173083a(MemberWeekLeaderBoardContentView memberWeekLeaderBoardContentView, View view) {
        memberWeekLeaderBoardContentView.f50089d = (MemberWeekLeaderBoardContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberWeekLeaderBoardContentView.f50090e = (RadioGroup) viewGroup.getChildAt(0);
        memberWeekLeaderBoardContentView.f50091f = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberWeekLeaderBoardContentView.f50092g = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberWeekLeaderBoardContentView.f50093h = (VImage) viewGroup.getChildAt(1);
        memberWeekLeaderBoardContentView.f50094i = (SwipeRefreshLayout) viewGroup.getChildAt(2);
        memberWeekLeaderBoardContentView.f50095j = (RecyclerView) view.findViewById(mdc0.f136086W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        memberWeekLeaderBoardContentView.f50096k = (FrameLayout) viewGroup2.getChildAt(3);
        memberWeekLeaderBoardContentView.f50097l = (LiveMemberItem) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
    }
}
