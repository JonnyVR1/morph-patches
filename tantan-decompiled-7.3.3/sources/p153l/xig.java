package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.FansWeekLeaderBoardContentView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardMeItemView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class xig {
    /* JADX INFO: renamed from: a */
    public static void m211141a(FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView, View view) {
        fansWeekLeaderBoardContentView.f53039d = (FansWeekLeaderBoardContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fansWeekLeaderBoardContentView.f53040e = (RadioGroup) viewGroup.getChildAt(0);
        fansWeekLeaderBoardContentView.f53041f = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fansWeekLeaderBoardContentView.f53042g = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fansWeekLeaderBoardContentView.f53043h = (VImage) viewGroup.getChildAt(1);
        fansWeekLeaderBoardContentView.f53044i = (SwipeRefreshLayout) viewGroup.getChildAt(2);
        fansWeekLeaderBoardContentView.f53045j = (RecyclerView) view.findViewById(mdc0.f136086W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        fansWeekLeaderBoardContentView.f53046k = (FrameLayout) viewGroup2.getChildAt(3);
        fansWeekLeaderBoardContentView.f53047l = (VirtualFansBoardMeItemView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
    }
}
