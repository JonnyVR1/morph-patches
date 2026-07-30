package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dhg {

    /* JADX INFO: renamed from: a */
    @NonNull
    public String f88492a = "";

    /* JADX INFO: renamed from: b */
    public List<nsv<w5g>> f88493b = new ArrayList();

    public dhg(hcr hcrVar) {
        for (BLiveLeaderBoards bLiveLeaderBoards : hcrVar.m134494d()) {
            if (bLiveLeaderBoards.user != null) {
                this.f88493b.add(nsv.m164636f(w5g.m204972a().m204974b(Double.valueOf(bLiveLeaderBoards.amount).longValue()).m204976d(bLiveLeaderBoards.user.f56859id).m204977e(bLiveLeaderBoards.user.m61308fp().url).m204975c(bLiveLeaderBoards.rank).m204973a()).m164641e(hcrVar.m134495e(bLiveLeaderBoards.user.f56859id)));
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m115796a() {
        return this.f88492a;
    }

    /* JADX INFO: renamed from: b */
    public List<nsv<w5g>> m115797b() {
        return this.f88493b;
    }

    /* JADX INFO: renamed from: c */
    public void m115798c(@NonNull String str) {
        this.f88492a = str;
    }

    public dhg(LongLinkGiftMessage.LiveRankings liveRankings) {
        for (LongLinkGiftMessage.LiveRanking liveRanking : liveRankings.getRankingsList()) {
            w5g w5gVarM204973a = w5g.m204972a().m204974b(liveRanking.getAmount()).m204975c(liveRanking.getRank()).m204976d(liveRanking.getUserId()).m204977e(liveRanking.getUserImage()).m204973a();
            this.f88493b.add(nsv.m164636f(w5gVarM204973a).m164641e(f3t.m123802c(liveRanking.getUserMask())));
        }
    }
}
