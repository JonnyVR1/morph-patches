package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cnp0 {
    /* JADX INFO: renamed from: a */
    public static void m11131a(WeekLeaderBoardContentView weekLeaderBoardContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        weekLeaderBoardContentView.f6777a = (RadioGroup) viewGroup.getChildAt(0);
        weekLeaderBoardContentView.f6778b = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        weekLeaderBoardContentView.f6779c = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        weekLeaderBoardContentView.f6780d = viewGroup.getChildAt(1);
        weekLeaderBoardContentView.f6781e = view.findViewById(g5c0.f10991W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        weekLeaderBoardContentView.f6782f = (FrameLayout) viewGroup2.getChildAt(2);
        weekLeaderBoardContentView.f6783g = (WeekBoardMainlandItemView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
    }
}
