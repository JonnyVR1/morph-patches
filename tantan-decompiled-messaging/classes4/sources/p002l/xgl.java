package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xgl {
    /* JADX INFO: renamed from: a */
    public static void m25930a(HourBoardMainlandMeItemView hourBoardMainlandMeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardMainlandMeItemView._rank = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hourBoardMainlandMeItemView._avatar = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hourBoardMainlandMeItemView._live_tag = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hourBoardMainlandMeItemView._name = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        hourBoardMainlandMeItemView._live_gender = (LiveGenderMedalView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        hourBoardMainlandMeItemView._live_level = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        hourBoardMainlandMeItemView._medal = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        hourBoardMainlandMeItemView._live_progressBar = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        hourBoardMainlandMeItemView._live_roll_text = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        hourBoardMainlandMeItemView._progress_layout = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        hourBoardMainlandMeItemView._heart = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
    }
}
