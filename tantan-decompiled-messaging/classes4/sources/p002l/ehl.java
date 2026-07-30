package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ehl {
    /* JADX INFO: renamed from: a */
    public static void m12546a(HourBoardNewEntryView hourBoardNewEntryView, View view) {
        hourBoardNewEntryView.f6574a = (HourBoardNewEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardNewEntryView.f6575b = viewGroup.getChildAt(0);
        hourBoardNewEntryView.f6576c = (HourBoardProgressViewNew) viewGroup.getChildAt(1);
        hourBoardNewEntryView.f6577d = viewGroup.getChildAt(2);
        hourBoardNewEntryView.f6578e = viewGroup.getChildAt(3);
    }
}
