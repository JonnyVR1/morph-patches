package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d5n0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public String f84546a = "";

    /* JADX INFO: renamed from: b */
    public List<mqv<y4n0>> f84547b = new ArrayList();

    public d5n0(njn0 njn0Var) {
        for (BLiveLeaderBoards bLiveLeaderBoards : njn0Var.m159764c()) {
            if (bLiveLeaderBoards.user != null) {
                this.f84547b.add(mqv.m155998f(y4n0.m212926a().m212928b(Double.valueOf(bLiveLeaderBoards.amount).longValue()).m212930d(bLiveLeaderBoards.user.f56011id).m212931e(bLiveLeaderBoards.user.m60124fp().url).m212929c(bLiveLeaderBoards.rank).m212927a()).m156003e(njn0Var.m159765d(bLiveLeaderBoards.user.f56011id)));
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m110064a() {
        return this.f84546a;
    }

    /* JADX INFO: renamed from: b */
    public List<mqv<y4n0>> m110065b() {
        return this.f84547b;
    }

    /* JADX INFO: renamed from: c */
    public void m110066c(@NonNull String str) {
        this.f84546a = str;
    }

    public d5n0(LongLinkGiftMessage.LiveRankings liveRankings) {
        for (LongLinkGiftMessage.LiveRanking liveRanking : liveRankings.getRankingsList()) {
            y4n0 y4n0VarM212927a = y4n0.m212926a().m212928b(liveRanking.getAmount()).m212929c(liveRanking.getRank()).m212930d(liveRanking.getUserId()).m212931e(liveRanking.getUserImage()).m212927a();
            this.f84547b.add(mqv.m155998f(y4n0VarM212927a).m156003e(e1t.m114441c(liveRanking.getUserMask())));
        }
    }
}
