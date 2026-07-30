package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardFirstView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bgl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m10322a(HourBoardFirstView hourBoardFirstView, View view) {
        hourBoardFirstView._root = (HourBoardFirstView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardFirstView._bg = viewGroup.getChildAt(0);
        hourBoardFirstView._rank_svga = viewGroup.getChildAt(1);
        hourBoardFirstView._avatar = viewGroup.getChildAt(2);
        hourBoardFirstView._crown = viewGroup.getChildAt(3);
        hourBoardFirstView._avatar_bottom = viewGroup.getChildAt(4);
        hourBoardFirstView._living = viewGroup.getChildAt(5);
        hourBoardFirstView._name = viewGroup.getChildAt(6);
        hourBoardFirstView._heart = viewGroup.getChildAt(7);
        hourBoardFirstView._rank = viewGroup.getChildAt(8);
        hourBoardFirstView._rank_icon = viewGroup.getChildAt(9);
    }
}
