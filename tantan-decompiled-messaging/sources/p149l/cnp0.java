package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView;

/* JADX INFO: loaded from: classes4.dex */
public class cnp0 {
    /* JADX INFO: renamed from: a */
    public static void m107821a(WeekLeaderBoardContentView weekLeaderBoardContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        weekLeaderBoardContentView.f50735a = (RadioGroup) viewGroup.getChildAt(0);
        weekLeaderBoardContentView.f50736b = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        weekLeaderBoardContentView.f50737c = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        weekLeaderBoardContentView.f50738d = (SwipeRefreshLayout) viewGroup.getChildAt(1);
        weekLeaderBoardContentView.f50739e = (RecyclerView) view.findViewById(g5c0.f100841W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        weekLeaderBoardContentView.f50740f = (FrameLayout) viewGroup2.getChildAt(2);
        weekLeaderBoardContentView.f50741g = (WeekBoardMainlandItemView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
    }
}
