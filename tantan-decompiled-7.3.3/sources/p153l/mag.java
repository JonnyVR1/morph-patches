package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class mag {

    /* JADX INFO: renamed from: a */
    public List<BLiveLeaderboardRecord> f135515a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Map<String, BLiveLeaderboardMedal> f135516b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Map<String, BLiveLeaderboardUser> f135517c = new HashMap();

    /* JADX INFO: renamed from: d */
    public cm0 f135518d;

    public mag(BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.records)) {
            this.f135515a.addAll(bLiveEnvelope.data.records);
        }
        if (!jyb.m147479J(bLiveEnvelope.data.medals)) {
            for (BLiveLeaderboardMedal bLiveLeaderboardMedal : bLiveEnvelope.data.medals) {
                this.f135516b.put(bLiveLeaderboardMedal.userId, bLiveLeaderboardMedal);
            }
        }
        if (jyb.m147479J(bLiveEnvelope.data.leaderboardUsers)) {
            return;
        }
        for (BLiveLeaderboardUser bLiveLeaderboardUser : bLiveEnvelope.data.leaderboardUsers) {
            this.f135517c.put(bLiveLeaderboardUser.userId, bLiveLeaderboardUser);
        }
    }

    /* JADX INFO: renamed from: a */
    public cm0 m157643a() {
        return this.f135518d;
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveLeaderboardRecord> m157644b() {
        return this.f135515a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public BLiveLeaderboardUser m157645c(String str) {
        return (BLiveLeaderboardUser) d3t.m113898a(this.f135517c, str, null);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public BLiveLeaderboardMedal m157646d(String str) {
        return (BLiveLeaderboardMedal) d3t.m113898a(this.f135516b, str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m157647e(cm0 cm0Var) {
        this.f135518d = cm0Var;
    }
}
