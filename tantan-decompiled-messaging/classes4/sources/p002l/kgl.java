package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kgl {
    /* JADX INFO: renamed from: a */
    public static void m16618a(HourBoardListItem hourBoardListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardListItem.f6597d = viewGroup.getChildAt(0);
        hourBoardListItem.f6598e = viewGroup.getChildAt(1);
        hourBoardListItem.f6599f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        hourBoardListItem.f6600g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        hourBoardListItem.f6601h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hourBoardListItem.f6602i = (HourBoardProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        hourBoardListItem.f6603j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        hourBoardListItem.f6604k = viewGroup.getChildAt(3);
    }
}
