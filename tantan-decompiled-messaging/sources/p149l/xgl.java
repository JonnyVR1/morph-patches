package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p147v.VDraweeView;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xgl {
    /* JADX INFO: renamed from: a */
    public static void m208682a(HourBoardMainlandMeItemView hourBoardMainlandMeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardMainlandMeItemView._rank = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hourBoardMainlandMeItemView._avatar = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hourBoardMainlandMeItemView._live_tag = (LivingNewTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hourBoardMainlandMeItemView._name = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        hourBoardMainlandMeItemView._live_gender = (LiveGenderMedalView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        hourBoardMainlandMeItemView._live_level = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        hourBoardMainlandMeItemView._medal = (Group) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        hourBoardMainlandMeItemView._live_progressBar = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        hourBoardMainlandMeItemView._live_roll_text = (LiveTextRollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        hourBoardMainlandMeItemView._progress_layout = (Group) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        hourBoardMainlandMeItemView._heart = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
    }
}
