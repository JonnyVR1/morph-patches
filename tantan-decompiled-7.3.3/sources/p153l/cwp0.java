package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cwp0 {
    /* JADX INFO: renamed from: a */
    public static void m112931a(WeekBoardMainlandItemView weekBoardMainlandItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        weekBoardMainlandItemView.f51574d = (VText) viewGroup.getChildAt(0);
        weekBoardMainlandItemView.f51575e = (VDraweeView) viewGroup.getChildAt(1);
        weekBoardMainlandItemView.f51576f = (LivingNewTagView) viewGroup.getChildAt(2);
        weekBoardMainlandItemView.f51577g = (VText) viewGroup.getChildAt(3);
        weekBoardMainlandItemView.f51578h = (VDraweeView) viewGroup.getChildAt(4);
        weekBoardMainlandItemView.f51579i = (LinearLayout) viewGroup.getChildAt(5);
        weekBoardMainlandItemView.f51580j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        weekBoardMainlandItemView.f51581k = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
