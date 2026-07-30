package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressView;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bjl {
    /* JADX INFO: renamed from: a */
    public static void m104629a(HourBoardListItem hourBoardListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardListItem.f51403d = (VText) viewGroup.getChildAt(0);
        hourBoardListItem.f51404e = (VDraweeView) viewGroup.getChildAt(1);
        hourBoardListItem.f51405f = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        hourBoardListItem.f51406g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        hourBoardListItem.f51407h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hourBoardListItem.f51408i = (HourBoardProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        hourBoardListItem.f51409j = (LiveTextRollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        hourBoardListItem.f51410k = (VText) viewGroup.getChildAt(3);
    }
}
