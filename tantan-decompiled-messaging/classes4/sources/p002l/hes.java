package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hes {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m14348a(LiveGenderMedalView liveGenderMedalView, View view) {
        liveGenderMedalView._root = (LiveGenderMedalView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGenderMedalView._gender = viewGroup.getChildAt(0);
        liveGenderMedalView._age = viewGroup.getChildAt(1);
    }
}
