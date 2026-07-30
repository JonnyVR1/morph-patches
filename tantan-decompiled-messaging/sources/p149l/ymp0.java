package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ymp0 {
    /* JADX INFO: renamed from: a */
    public static void m215376a(WeekBoardMainlandItemView weekBoardMainlandItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        weekBoardMainlandItemView.f50726d = (VText) viewGroup.getChildAt(0);
        weekBoardMainlandItemView.f50727e = (VDraweeView) viewGroup.getChildAt(1);
        weekBoardMainlandItemView.f50728f = (LivingNewTagView) viewGroup.getChildAt(2);
        weekBoardMainlandItemView.f50729g = (VText) viewGroup.getChildAt(3);
        weekBoardMainlandItemView.f50730h = (VDraweeView) viewGroup.getChildAt(4);
        weekBoardMainlandItemView.f50731i = (LinearLayout) viewGroup.getChildAt(5);
        weekBoardMainlandItemView.f50732j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        weekBoardMainlandItemView.f50733k = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
