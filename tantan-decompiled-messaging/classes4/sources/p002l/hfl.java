package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardDialogContentIntlView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hfl {
    /* JADX INFO: renamed from: a */
    public static void m14363a(HourBoardDialogContentIntlView hourBoardDialogContentIntlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardDialogContentIntlView._empty = viewGroup.getChildAt(0);
        hourBoardDialogContentIntlView._dialog_title_bar = viewGroup.getChildAt(1);
        hourBoardDialogContentIntlView._list = viewGroup.getChildAt(2);
        hourBoardDialogContentIntlView._shadow = viewGroup.getChildAt(3);
        hourBoardDialogContentIntlView._own = (HourBoardListItem) viewGroup.getChildAt(4);
    }
}
