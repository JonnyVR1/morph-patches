package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p046p1.mobile.putong.live.livingroom.common.member.view.MemberWeekLeaderBoardContentView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class sey {
    /* JADX INFO: renamed from: a */
    public static void m183774a(MemberWeekLeaderBoardContentView memberWeekLeaderBoardContentView, View view) {
        memberWeekLeaderBoardContentView.f49241d = (MemberWeekLeaderBoardContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberWeekLeaderBoardContentView.f49242e = (RadioGroup) viewGroup.getChildAt(0);
        memberWeekLeaderBoardContentView.f49243f = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberWeekLeaderBoardContentView.f49244g = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberWeekLeaderBoardContentView.f49245h = (VImage) viewGroup.getChildAt(1);
        memberWeekLeaderBoardContentView.f49246i = (SwipeRefreshLayout) viewGroup.getChildAt(2);
        memberWeekLeaderBoardContentView.f49247j = (RecyclerView) view.findViewById(g5c0.f100841W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        memberWeekLeaderBoardContentView.f49248k = (FrameLayout) viewGroup2.getChildAt(3);
        memberWeekLeaderBoardContentView.f49249l = (LiveMemberItem) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
    }
}
