package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.p1.mobile.putong.live.livingroom.virtual.board.accompany.FansWeekLeaderBoardContentView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jhg {
    /* JADX INFO: renamed from: a */
    public static void m15939a(FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView, View view) {
        fansWeekLeaderBoardContentView.d = (FansWeekLeaderBoardContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fansWeekLeaderBoardContentView.e = (RadioGroup) viewGroup.getChildAt(0);
        fansWeekLeaderBoardContentView.f = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fansWeekLeaderBoardContentView.g = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fansWeekLeaderBoardContentView.h = viewGroup.getChildAt(1);
        fansWeekLeaderBoardContentView.i = viewGroup.getChildAt(2);
        fansWeekLeaderBoardContentView.j = view.findViewById(g5c0.f10991W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        fansWeekLeaderBoardContentView.k = (FrameLayout) viewGroup2.getChildAt(3);
        fansWeekLeaderBoardContentView.l = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
    }
}
