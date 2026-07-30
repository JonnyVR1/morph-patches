package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget.VoiceLiveHourBoardEntryView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class nzn0 {
    /* JADX INFO: renamed from: a */
    public static void m165390a(VoiceLiveHourBoardEntryView voiceLiveHourBoardEntryView, View view) {
        voiceLiveHourBoardEntryView.f54076a = (VoiceLiveHourBoardEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveHourBoardEntryView.f54077b = viewGroup.getChildAt(0);
        voiceLiveHourBoardEntryView.f54078c = (VImage) viewGroup.getChildAt(1);
        voiceLiveHourBoardEntryView.f54079d = (LiveTextRollView) viewGroup.getChildAt(2);
    }
}
