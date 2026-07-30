package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardDialogContentIntlView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;

/* JADX INFO: loaded from: classes4.dex */
public class hfl {
    /* JADX INFO: renamed from: a */
    public static void m130774a(HourBoardDialogContentIntlView hourBoardDialogContentIntlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardDialogContentIntlView._empty = viewGroup.getChildAt(0);
        hourBoardDialogContentIntlView._dialog_title_bar = (DialogTitleBar) viewGroup.getChildAt(1);
        hourBoardDialogContentIntlView._list = (RecyclerView) viewGroup.getChildAt(2);
        hourBoardDialogContentIntlView._shadow = viewGroup.getChildAt(3);
        hourBoardDialogContentIntlView._own = (HourBoardListItem) viewGroup.getChildAt(4);
    }
}
