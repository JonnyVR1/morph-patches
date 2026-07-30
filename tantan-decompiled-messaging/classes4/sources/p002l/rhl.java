package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardSecondOrThirdView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rhl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m21993a(HourBoardSecondOrThirdView hourBoardSecondOrThirdView, View view) {
        hourBoardSecondOrThirdView._root = (HourBoardSecondOrThirdView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardSecondOrThirdView._bg = viewGroup.getChildAt(0);
        hourBoardSecondOrThirdView._rank_svga = viewGroup.getChildAt(1);
        hourBoardSecondOrThirdView._avatar = viewGroup.getChildAt(2);
        hourBoardSecondOrThirdView._crown = viewGroup.getChildAt(3);
        hourBoardSecondOrThirdView._avatar_bottom = viewGroup.getChildAt(4);
        hourBoardSecondOrThirdView._living = viewGroup.getChildAt(5);
        hourBoardSecondOrThirdView._name = viewGroup.getChildAt(6);
        hourBoardSecondOrThirdView._heart = viewGroup.getChildAt(7);
        hourBoardSecondOrThirdView._rank = viewGroup.getChildAt(8);
        hourBoardSecondOrThirdView._rank_icon = viewGroup.getChildAt(9);
    }
}
