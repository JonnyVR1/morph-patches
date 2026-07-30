package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oil {
    /* JADX INFO: renamed from: a */
    public static void m167793a(HourBoardEntryView hourBoardEntryView, View view) {
        hourBoardEntryView.f51366a = (HourBoardEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardEntryView.f51367b = (VImage) viewGroup.getChildAt(0);
        hourBoardEntryView.f51368c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hourBoardEntryView.f51369d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
