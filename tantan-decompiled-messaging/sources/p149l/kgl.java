package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressView;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kgl {
    /* JADX INFO: renamed from: a */
    public static void m145893a(HourBoardListItem hourBoardListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardListItem.f50555d = (VText) viewGroup.getChildAt(0);
        hourBoardListItem.f50556e = (VDraweeView) viewGroup.getChildAt(1);
        hourBoardListItem.f50557f = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        hourBoardListItem.f50558g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        hourBoardListItem.f50559h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hourBoardListItem.f50560i = (HourBoardProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        hourBoardListItem.f50561j = (LiveTextRollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        hourBoardListItem.f50562k = (VText) viewGroup.getChildAt(3);
    }
}
