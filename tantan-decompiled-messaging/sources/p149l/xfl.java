package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xfl {
    /* JADX INFO: renamed from: a */
    public static void m208609a(HourBoardEntryView hourBoardEntryView, View view) {
        hourBoardEntryView.f50518a = (HourBoardEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardEntryView.f50519b = (VImage) viewGroup.getChildAt(0);
        hourBoardEntryView.f50520c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hourBoardEntryView.f50521d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
