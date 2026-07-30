package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class ehl {
    /* JADX INFO: renamed from: a */
    public static void m116475a(HourBoardNewEntryView hourBoardNewEntryView, View view) {
        hourBoardNewEntryView.f50532a = (HourBoardNewEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardNewEntryView.f50533b = viewGroup.getChildAt(0);
        hourBoardNewEntryView.f50534c = (HourBoardProgressViewNew) viewGroup.getChildAt(1);
        hourBoardNewEntryView.f50535d = (VImage) viewGroup.getChildAt(2);
        hourBoardNewEntryView.f50536e = (LiveTextRollView) viewGroup.getChildAt(3);
    }
}
