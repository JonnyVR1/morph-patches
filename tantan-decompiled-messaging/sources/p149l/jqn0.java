package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget.VoiceLiveHourBoardEntryView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class jqn0 {
    /* JADX INFO: renamed from: a */
    public static void m142828a(VoiceLiveHourBoardEntryView voiceLiveHourBoardEntryView, View view) {
        voiceLiveHourBoardEntryView.f53228a = (VoiceLiveHourBoardEntryView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveHourBoardEntryView.f53229b = viewGroup.getChildAt(0);
        voiceLiveHourBoardEntryView.f53230c = (VImage) viewGroup.getChildAt(1);
        voiceLiveHourBoardEntryView.f53231d = (LiveTextRollView) viewGroup.getChildAt(2);
    }
}
