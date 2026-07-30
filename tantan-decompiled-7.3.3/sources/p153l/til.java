package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardFirstView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardSecondOrThirdView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardTopNoticeView;

/* JADX INFO: loaded from: classes4.dex */
public class til {
    /* JADX INFO: renamed from: a */
    public static void m191336a(HourBoardHeaderView hourBoardHeaderView, View view) {
        hourBoardHeaderView._root = (HourBoardHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardHeaderView._notice = (HourBoardTopNoticeView) viewGroup.getChildAt(0);
        hourBoardHeaderView._second_user = (HourBoardSecondOrThirdView) viewGroup.getChildAt(1);
        hourBoardHeaderView._third_user = (HourBoardSecondOrThirdView) viewGroup.getChildAt(2);
        hourBoardHeaderView._first_user = (HourBoardFirstView) viewGroup.getChildAt(3);
    }
}
