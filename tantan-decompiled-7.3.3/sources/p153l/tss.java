package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.GuardHeaderItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardAwardGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardHeaderView;

/* JADX INFO: loaded from: classes4.dex */
public class tss {
    /* JADX INFO: renamed from: a */
    public static void m192644a(LiveGuardBoardHeaderView liveGuardBoardHeaderView, View view) {
        liveGuardBoardHeaderView.f51311d = (LiveGuardBoardHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardBoardHeaderView.f51312e = (LiveGuardInfoView) viewGroup.getChildAt(1);
        liveGuardBoardHeaderView.f51313f = (LiveGuardBoardAwardGroup) viewGroup.getChildAt(2);
        liveGuardBoardHeaderView.f51314g = viewGroup.getChildAt(3);
        liveGuardBoardHeaderView.f51315h = (GuardHeaderItemView) viewGroup.getChildAt(4);
        liveGuardBoardHeaderView.f51316i = (GuardHeaderItemView) viewGroup.getChildAt(5);
        liveGuardBoardHeaderView.f51317j = (GuardHeaderItemView) viewGroup.getChildAt(6);
    }
}
