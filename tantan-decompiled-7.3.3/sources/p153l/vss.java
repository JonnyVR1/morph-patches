package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardListItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vss {
    /* JADX INFO: renamed from: a */
    public static void m202662a(LiveGuardBoardListItem liveGuardBoardListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardBoardListItem.f51319d = (VText) viewGroup.getChildAt(0);
        liveGuardBoardListItem.f51320e = (VDraweeView) viewGroup.getChildAt(1);
        liveGuardBoardListItem.f51321f = (LiveTagView) viewGroup.getChildAt(2);
        liveGuardBoardListItem.f51322g = (TextView) viewGroup.getChildAt(3);
        liveGuardBoardListItem.f51323h = (TextView) viewGroup.getChildAt(4);
    }
}
