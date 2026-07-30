package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ijl {
    /* JADX INFO: renamed from: a */
    public static void m140211a(HourBoardMainlandItemView hourBoardMainlandItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardMainlandItemView._rank = (VText) viewGroup.getChildAt(0);
        hourBoardMainlandItemView._avatar = (VDraweeView) viewGroup.getChildAt(1);
        hourBoardMainlandItemView._live_tag = (LivingNewTagView) viewGroup.getChildAt(2);
        hourBoardMainlandItemView._name = (VText) viewGroup.getChildAt(3);
        hourBoardMainlandItemView._gender = (LiveGenderMedalView) viewGroup.getChildAt(4);
        hourBoardMainlandItemView._level = (VDraweeView) viewGroup.getChildAt(5);
        hourBoardMainlandItemView._heart = (VText) viewGroup.getChildAt(6);
    }
}
