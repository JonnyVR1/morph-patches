package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.GuardHeaderItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardAwardGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sqs {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m22632a(LiveGuardBoardHeaderView liveGuardBoardHeaderView, View view) {
        liveGuardBoardHeaderView.f6505d = (LiveGuardBoardHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardBoardHeaderView.f6506e = (LiveGuardInfoView) viewGroup.getChildAt(1);
        liveGuardBoardHeaderView.f6507f = (LiveGuardBoardAwardGroup) viewGroup.getChildAt(2);
        liveGuardBoardHeaderView.f6508g = viewGroup.getChildAt(3);
        liveGuardBoardHeaderView.f6509h = (GuardHeaderItemView) viewGroup.getChildAt(4);
        liveGuardBoardHeaderView.f6510i = (GuardHeaderItemView) viewGroup.getChildAt(5);
        liveGuardBoardHeaderView.f6511j = (GuardHeaderItemView) viewGroup.getChildAt(6);
    }
}
