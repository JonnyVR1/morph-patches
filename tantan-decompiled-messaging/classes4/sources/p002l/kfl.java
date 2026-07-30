package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogContentMainlandView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kfl {
    /* JADX INFO: renamed from: a */
    public static void m16610a(HourBoardDialogContentMainlandView hourBoardDialogContentMainlandView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardDialogContentMainlandView._empty = viewGroup.getChildAt(0);
        hourBoardDialogContentMainlandView._bg = viewGroup.getChildAt(1);
        hourBoardDialogContentMainlandView._bottom_bg = viewGroup.getChildAt(2);
        hourBoardDialogContentMainlandView._bg_svga = viewGroup.getChildAt(3);
        hourBoardDialogContentMainlandView._top_bg = viewGroup.getChildAt(4);
        hourBoardDialogContentMainlandView._title_bar = viewGroup.getChildAt(5);
        hourBoardDialogContentMainlandView._top_divider = viewGroup.getChildAt(6);
        hourBoardDialogContentMainlandView._recyclerView = viewGroup.getChildAt(7);
        hourBoardDialogContentMainlandView._empty_view = (HourBoardEmptyView) viewGroup.getChildAt(8);
        hourBoardDialogContentMainlandView._own = (HourBoardMainlandMeItemView) viewGroup.getChildAt(9);
    }
}
