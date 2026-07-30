package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardFirstView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardSecondOrThirdView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardTopNoticeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cgl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m11036a(HourBoardHeaderView hourBoardHeaderView, View view) {
        hourBoardHeaderView._root = (HourBoardHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardHeaderView._notice = (HourBoardTopNoticeView) viewGroup.getChildAt(0);
        hourBoardHeaderView._second_user = (HourBoardSecondOrThirdView) viewGroup.getChildAt(1);
        hourBoardHeaderView._third_user = (HourBoardSecondOrThirdView) viewGroup.getChildAt(2);
        hourBoardHeaderView._first_user = (HourBoardFirstView) viewGroup.getChildAt(3);
    }
}
