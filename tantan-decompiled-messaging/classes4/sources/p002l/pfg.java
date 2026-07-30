package p002l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.mqv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pfg {

    /* JADX INFO: renamed from: a */
    @NonNull
    public String f17243a = "";

    /* JADX INFO: renamed from: b */
    public List<mqv<i4g>> f17244b = new ArrayList();

    public pfg(far farVar) {
        for (BLiveLeaderBoards bLiveLeaderBoards : farVar.m13042d()) {
            if (bLiveLeaderBoards.user != null) {
                this.f17244b.add(mqv.f(i4g.m14991a().m14993b(Double.valueOf(bLiveLeaderBoards.amount).longValue()).m14995d(((DbObject) bLiveLeaderBoards.user).id).m14996e(((Media) bLiveLeaderBoards.user.fp()).url).m14994c(bLiveLeaderBoards.rank).m14992a()).e(farVar.m13043e(((DbObject) bLiveLeaderBoards.user).id)));
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m20226a() {
        return this.f17243a;
    }

    /* JADX INFO: renamed from: b */
    public List<mqv<i4g>> m20227b() {
        return this.f17244b;
    }

    /* JADX INFO: renamed from: c */
    public void m20228c(@NonNull String str) {
        this.f17243a = str;
    }

    public pfg(LongLinkGiftMessage.LiveRankings liveRankings) {
        for (LongLinkGiftMessage.LiveRanking liveRanking : liveRankings.getRankingsList()) {
            i4g i4gVarM14992a = i4g.m14991a().m14993b(liveRanking.getAmount()).m14994c(liveRanking.getRank()).m14995d(liveRanking.getUserId()).m14996e(liveRanking.getUserImage()).m14992a();
            this.f17244b.add(mqv.f(i4gVarM14992a).e(e1t.m12109c(liveRanking.getUserMask())));
        }
    }
}
