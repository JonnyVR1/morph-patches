package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rgl {
    /* JADX INFO: renamed from: a */
    public static void m21923a(HourBoardMainlandItemView hourBoardMainlandItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardMainlandItemView._rank = viewGroup.getChildAt(0);
        hourBoardMainlandItemView._avatar = viewGroup.getChildAt(1);
        hourBoardMainlandItemView._live_tag = viewGroup.getChildAt(2);
        hourBoardMainlandItemView._name = viewGroup.getChildAt(3);
        hourBoardMainlandItemView._gender = (LiveGenderMedalView) viewGroup.getChildAt(4);
        hourBoardMainlandItemView._level = viewGroup.getChildAt(5);
        hourBoardMainlandItemView._heart = viewGroup.getChildAt(6);
    }
}
