package p002l;

import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardMedal;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.c1t;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y8g {

    /* JADX INFO: renamed from: a */
    public List<BLiveLeaderboardRecord> f22739a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Map<String, BLiveLeaderboardMedal> f22740b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Map<String, BLiveLeaderboardUser> f22741c = new HashMap();

    /* JADX INFO: renamed from: d */
    public gm0 f22742d;

    public y8g(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.J(bLiveEnvelope.data.records)) {
            this.f22739a.addAll(bLiveEnvelope.data.records);
        }
        if (!vwb.J(bLiveEnvelope.data.medals)) {
            for (BLiveLeaderboardMedal bLiveLeaderboardMedal : bLiveEnvelope.data.medals) {
                this.f22740b.put(bLiveLeaderboardMedal.userId, bLiveLeaderboardMedal);
            }
        }
        if (vwb.J(bLiveEnvelope.data.leaderboardUsers)) {
            return;
        }
        for (BLiveLeaderboardUser bLiveLeaderboardUser : bLiveEnvelope.data.leaderboardUsers) {
            this.f22741c.put(bLiveLeaderboardUser.userId, bLiveLeaderboardUser);
        }
    }

    /* JADX INFO: renamed from: a */
    public gm0 m26436a() {
        return this.f22742d;
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveLeaderboardRecord> m26437b() {
        return this.f22739a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public BLiveLeaderboardUser m26438c(String str) {
        return (BLiveLeaderboardUser) c1t.a(this.f22741c, str, (Object) null);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public BLiveLeaderboardMedal m26439d(String str) {
        return (BLiveLeaderboardMedal) c1t.a(this.f22740b, str, (Object) null);
    }

    /* JADX INFO: renamed from: e */
    public void m26440e(gm0 gm0Var) {
        this.f22742d = gm0Var;
    }
}
