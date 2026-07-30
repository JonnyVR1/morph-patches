package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pfg {

    /* JADX INFO: renamed from: a */
    @NonNull
    public String f148550a = "";

    /* JADX INFO: renamed from: b */
    public List<mqv<i4g>> f148551b = new ArrayList();

    public pfg(far farVar) {
        for (BLiveLeaderBoards bLiveLeaderBoards : farVar.m120300d()) {
            if (bLiveLeaderBoards.user != null) {
                this.f148551b.add(mqv.m155998f(i4g.m134343a().m134345b(Double.valueOf(bLiveLeaderBoards.amount).longValue()).m134347d(bLiveLeaderBoards.user.f56011id).m134348e(bLiveLeaderBoards.user.m60124fp().url).m134346c(bLiveLeaderBoards.rank).m134344a()).m156003e(farVar.m120301e(bLiveLeaderBoards.user.f56011id)));
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m168638a() {
        return this.f148550a;
    }

    /* JADX INFO: renamed from: b */
    public List<mqv<i4g>> m168639b() {
        return this.f148551b;
    }

    /* JADX INFO: renamed from: c */
    public void m168640c(@NonNull String str) {
        this.f148550a = str;
    }

    public pfg(LongLinkGiftMessage.LiveRankings liveRankings) {
        for (LongLinkGiftMessage.LiveRanking liveRanking : liveRankings.getRankingsList()) {
            i4g i4gVarM134344a = i4g.m134343a().m134345b(liveRanking.getAmount()).m134346c(liveRanking.getRank()).m134347d(liveRanking.getUserId()).m134348e(liveRanking.getUserImage()).m134344a();
            this.f148551b.add(mqv.m155998f(i4gVarM134344a).m156003e(e1t.m114441c(liveRanking.getUserMask())));
        }
    }
}
