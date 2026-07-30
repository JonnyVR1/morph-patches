package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardListItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uqs {
    /* JADX INFO: renamed from: a */
    public static void m195008a(LiveGuardBoardListItem liveGuardBoardListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardBoardListItem.f50471d = (VText) viewGroup.getChildAt(0);
        liveGuardBoardListItem.f50472e = (VDraweeView) viewGroup.getChildAt(1);
        liveGuardBoardListItem.f50473f = (LiveTagView) viewGroup.getChildAt(2);
        liveGuardBoardListItem.f50474g = (TextView) viewGroup.getChildAt(3);
        liveGuardBoardListItem.f50475h = (TextView) viewGroup.getChildAt(4);
    }
}
