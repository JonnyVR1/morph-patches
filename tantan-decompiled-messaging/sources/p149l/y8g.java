package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class y8g {

    /* JADX INFO: renamed from: a */
    public List<BLiveLeaderboardRecord> f196824a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Map<String, BLiveLeaderboardMedal> f196825b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Map<String, BLiveLeaderboardUser> f196826c = new HashMap();

    /* JADX INFO: renamed from: d */
    public gm0 f196827d;

    public y8g(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.records)) {
            this.f196824a.addAll(bLiveEnvelope.data.records);
        }
        if (!vwb.m200296J(bLiveEnvelope.data.medals)) {
            for (BLiveLeaderboardMedal bLiveLeaderboardMedal : bLiveEnvelope.data.medals) {
                this.f196825b.put(bLiveLeaderboardMedal.userId, bLiveLeaderboardMedal);
            }
        }
        if (vwb.m200296J(bLiveEnvelope.data.leaderboardUsers)) {
            return;
        }
        for (BLiveLeaderboardUser bLiveLeaderboardUser : bLiveEnvelope.data.leaderboardUsers) {
            this.f196826c.put(bLiveLeaderboardUser.userId, bLiveLeaderboardUser);
        }
    }

    /* JADX INFO: renamed from: a */
    public gm0 m213371a() {
        return this.f196827d;
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveLeaderboardRecord> m213372b() {
        return this.f196824a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public BLiveLeaderboardUser m213373c(String str) {
        return (BLiveLeaderboardUser) c1t.m104876a(this.f196826c, str, null);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public BLiveLeaderboardMedal m213374d(String str) {
        return (BLiveLeaderboardMedal) c1t.m104876a(this.f196825b, str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m213375e(gm0 gm0Var) {
        this.f196827d = gm0Var;
    }
}
