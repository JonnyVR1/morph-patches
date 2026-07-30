package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.GuardHeaderItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardAwardGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardHeaderView;

/* JADX INFO: loaded from: classes4.dex */
public class sqs {
    /* JADX INFO: renamed from: a */
    public static void m185611a(LiveGuardBoardHeaderView liveGuardBoardHeaderView, View view) {
        liveGuardBoardHeaderView.f50463d = (LiveGuardBoardHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardBoardHeaderView.f50464e = (LiveGuardInfoView) viewGroup.getChildAt(1);
        liveGuardBoardHeaderView.f50465f = (LiveGuardBoardAwardGroup) viewGroup.getChildAt(2);
        liveGuardBoardHeaderView.f50466g = viewGroup.getChildAt(3);
        liveGuardBoardHeaderView.f50467h = (GuardHeaderItemView) viewGroup.getChildAt(4);
        liveGuardBoardHeaderView.f50468i = (GuardHeaderItemView) viewGroup.getChildAt(5);
        liveGuardBoardHeaderView.f50469j = (GuardHeaderItemView) viewGroup.getChildAt(6);
    }
}
