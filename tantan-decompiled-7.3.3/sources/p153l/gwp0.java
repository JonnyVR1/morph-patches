package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView;

/* JADX INFO: loaded from: classes4.dex */
public class gwp0 {
    /* JADX INFO: renamed from: a */
    public static void m132687a(WeekLeaderBoardContentView weekLeaderBoardContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        weekLeaderBoardContentView.f51583a = (RadioGroup) viewGroup.getChildAt(0);
        weekLeaderBoardContentView.f51584b = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        weekLeaderBoardContentView.f51585c = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        weekLeaderBoardContentView.f51586d = (SwipeRefreshLayout) viewGroup.getChildAt(1);
        weekLeaderBoardContentView.f51587e = (RecyclerView) view.findViewById(mdc0.f136086W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        weekLeaderBoardContentView.f51588f = (FrameLayout) viewGroup2.getChildAt(2);
        weekLeaderBoardContentView.f51589g = (WeekBoardMainlandItemView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
    }
}
