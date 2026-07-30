package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.HourLeaderBoardAssistanceGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.HourLeaderBoardContentView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class skl {
    /* JADX INFO: renamed from: a */
    public static void m186519a(HourLeaderBoardContentView hourLeaderBoardContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourLeaderBoardContentView.f51556d = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hourLeaderBoardContentView.f51557e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hourLeaderBoardContentView.f51558f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        hourLeaderBoardContentView.f51559g = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        hourLeaderBoardContentView.f51560h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        hourLeaderBoardContentView.f51561i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        hourLeaderBoardContentView.f51562j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        hourLeaderBoardContentView.f51563k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        hourLeaderBoardContentView.f51564l = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        hourLeaderBoardContentView.f51565m = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
        hourLeaderBoardContentView.f51566n = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
        hourLeaderBoardContentView.f51567o = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
        hourLeaderBoardContentView.f51568p = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        hourLeaderBoardContentView.f51569q = (HourBoardEmptyView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        hourLeaderBoardContentView.f51570r = (HourBoardMainlandMeItemView) viewGroup.getChildAt(1);
    }
}
