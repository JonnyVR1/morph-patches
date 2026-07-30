package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardTopNoticeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class thl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m22962a(HourBoardTopNoticeView hourBoardTopNoticeView, View view) {
        hourBoardTopNoticeView._root = (HourBoardTopNoticeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardTopNoticeView._left_icon = viewGroup.getChildAt(0);
        hourBoardTopNoticeView._marqueeText = viewGroup.getChildAt(1);
        hourBoardTopNoticeView._right_icon = viewGroup.getChildAt(2);
    }
}
