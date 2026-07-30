package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.FansWeekLeaderBoardContentView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardMeItemView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class jhg {
    /* JADX INFO: renamed from: a */
    public static void m141523a(FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView, View view) {
        fansWeekLeaderBoardContentView.f52191d = (FansWeekLeaderBoardContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fansWeekLeaderBoardContentView.f52192e = (RadioGroup) viewGroup.getChildAt(0);
        fansWeekLeaderBoardContentView.f52193f = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fansWeekLeaderBoardContentView.f52194g = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fansWeekLeaderBoardContentView.f52195h = (VImage) viewGroup.getChildAt(1);
        fansWeekLeaderBoardContentView.f52196i = (SwipeRefreshLayout) viewGroup.getChildAt(2);
        fansWeekLeaderBoardContentView.f52197j = (RecyclerView) view.findViewById(g5c0.f100841W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        fansWeekLeaderBoardContentView.f52198k = (FrameLayout) viewGroup2.getChildAt(3);
        fansWeekLeaderBoardContentView.f52199l = (VirtualFansBoardMeItemView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
    }
}
