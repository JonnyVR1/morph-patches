package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hen0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public String f109177a = "";

    /* JADX INFO: renamed from: b */
    public List<nsv<cen0>> f109178b = new ArrayList();

    public hen0(rsn0 rsn0Var) {
        for (BLiveLeaderBoards bLiveLeaderBoards : rsn0Var.m183020c()) {
            if (bLiveLeaderBoards.user != null) {
                this.f109178b.add(nsv.m164636f(cen0.m109432a().m109434b(Double.valueOf(bLiveLeaderBoards.amount).longValue()).m109436d(bLiveLeaderBoards.user.f56859id).m109437e(bLiveLeaderBoards.user.m61308fp().url).m109435c(bLiveLeaderBoards.rank).m109433a()).m164641e(rsn0Var.m183021d(bLiveLeaderBoards.user.f56859id)));
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m134667a() {
        return this.f109177a;
    }

    /* JADX INFO: renamed from: b */
    public List<nsv<cen0>> m134668b() {
        return this.f109178b;
    }

    /* JADX INFO: renamed from: c */
    public void m134669c(@NonNull String str) {
        this.f109177a = str;
    }

    public hen0(LongLinkGiftMessage.LiveRankings liveRankings) {
        for (LongLinkGiftMessage.LiveRanking liveRanking : liveRankings.getRankingsList()) {
            cen0 cen0VarM109433a = cen0.m109432a().m109434b(liveRanking.getAmount()).m109435c(liveRanking.getRank()).m109436d(liveRanking.getUserId()).m109437e(liveRanking.getUserImage()).m109433a();
            this.f109178b.add(nsv.m164636f(cen0VarM109433a).m164641e(f3t.m123802c(liveRanking.getUserMask())));
        }
    }
}
