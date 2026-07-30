package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardTopNoticeView;
import p151v.VImage;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class kkl {
    /* JADX INFO: renamed from: a */
    public static void m150109a(HourBoardTopNoticeView hourBoardTopNoticeView, View view) {
        hourBoardTopNoticeView._root = (HourBoardTopNoticeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardTopNoticeView._left_icon = (VImage) viewGroup.getChildAt(0);
        hourBoardTopNoticeView._marqueeText = (VMarqueeText) viewGroup.getChildAt(1);
        hourBoardTopNoticeView._right_icon = (VImage) viewGroup.getChildAt(2);
    }
}
