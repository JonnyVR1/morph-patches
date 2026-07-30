package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hes {
    /* JADX INFO: renamed from: a */
    public static void m130688a(LiveGenderMedalView liveGenderMedalView, View view) {
        liveGenderMedalView._root = (LiveGenderMedalView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGenderMedalView._gender = (VImage) viewGroup.getChildAt(0);
        liveGenderMedalView._age = (VText) viewGroup.getChildAt(1);
    }
}
