package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class vjl {
    /* JADX INFO: renamed from: a */
    public static void m201526a(HourBoardNewEntryView hourBoardNewEntryView, View view) {
        hourBoardNewEntryView.f51380a = (HourBoardNewEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardNewEntryView.f51381b = viewGroup.getChildAt(0);
        hourBoardNewEntryView.f51382c = (HourBoardProgressViewNew) viewGroup.getChildAt(1);
        hourBoardNewEntryView.f51383d = (VImage) viewGroup.getChildAt(2);
        hourBoardNewEntryView.f51384e = (LiveTextRollView) viewGroup.getChildAt(3);
    }
}
