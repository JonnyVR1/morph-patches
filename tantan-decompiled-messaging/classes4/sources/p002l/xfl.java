package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xfl {
    /* JADX INFO: renamed from: a */
    public static void m25914a(HourBoardEntryView hourBoardEntryView, View view) {
        hourBoardEntryView.f6560a = (HourBoardEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardEntryView.f6561b = viewGroup.getChildAt(0);
        hourBoardEntryView.f6562c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hourBoardEntryView.f6563d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
