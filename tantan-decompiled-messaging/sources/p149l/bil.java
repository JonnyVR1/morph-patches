package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.HourLeaderBoardAssistanceGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.HourLeaderBoardContentView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class bil {
    /* JADX INFO: renamed from: a */
    public static void m102085a(HourLeaderBoardContentView hourLeaderBoardContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourLeaderBoardContentView.f50708d = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hourLeaderBoardContentView.f50709e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hourLeaderBoardContentView.f50710f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        hourLeaderBoardContentView.f50711g = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        hourLeaderBoardContentView.f50712h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        hourLeaderBoardContentView.f50713i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        hourLeaderBoardContentView.f50714j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        hourLeaderBoardContentView.f50715k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        hourLeaderBoardContentView.f50716l = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        hourLeaderBoardContentView.f50717m = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
        hourLeaderBoardContentView.f50718n = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
        hourLeaderBoardContentView.f50719o = (HourLeaderBoardAssistanceGiftItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
        hourLeaderBoardContentView.f50720p = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        hourLeaderBoardContentView.f50721q = (HourBoardEmptyView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        hourLeaderBoardContentView.f50722r = (HourBoardMainlandMeItemView) viewGroup.getChildAt(1);
    }
}
