package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummaryCounters;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ppr {

    /* JADX INFO: renamed from: a */
    @Nullable
    public BLiveActivitySummary f150675a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BLiveEntranceSummary f150676b;

    /* JADX INFO: renamed from: c */
    public Throwable f150677c;

    /* JADX INFO: renamed from: d */
    public int f150678d;

    public ppr(BLiveEnvelope bLiveEnvelope) {
        this.f150675a = null;
        this.f150676b = null;
        this.f150677c = null;
        this.f150678d = 2;
        if (!vwb.m200296J(bLiveEnvelope.data.liveActivitySummaries)) {
            this.f150675a = bLiveEnvelope.data.liveActivitySummaries.get(0);
        }
        if (vwb.m200296J(bLiveEnvelope.data.squareEntranceSummary)) {
            return;
        }
        this.f150676b = bLiveEnvelope.data.squareEntranceSummary.get(0);
    }

    /* JADX INFO: renamed from: a */
    public ppr m170759a() {
        this.f150678d = m170769k();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public ppr m170760b(int i) {
        this.f150678d = i;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public BLiveSquareDetailCounters m170761c() {
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters;
        BLiveActivitySummary bLiveActivitySummary = this.f150675a;
        if (bLiveActivitySummary == null || (bLiveActivitySummaryCounters = bLiveActivitySummary.counters) == null) {
            return null;
        }
        return bLiveActivitySummaryCounters.squareDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public BLiveActivitySummary m170762d() {
        return this.f150675a;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public BLiveEntranceSummary m170763e() {
        return this.f150676b;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m170764f() {
        BLiveActivitySummary bLiveActivitySummary = this.f150675a;
        return bLiveActivitySummary != null ? bLiveActivitySummary.icons : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public int m170765g() {
        return this.f150678d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m170766h() {
        return this.f150677c != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m170767i() {
        return !vwb.m200296J(m170764f());
    }

    /* JADX INFO: renamed from: j */
    public boolean m170768j() {
        BLiveSquareDetailCounters bLiveSquareDetailCountersM170761c = m170761c();
        return bLiveSquareDetailCountersM170761c != null && bLiveSquareDetailCountersM170761c.unreadCount > 0;
    }

    /* JADX INFO: renamed from: k */
    public final int m170769k() {
        BLiveSquareDetailCounters bLiveSquareDetailCountersM170761c = m170761c();
        BLiveActivitySummary bLiveActivitySummary = this.f150675a;
        boolean z = (bLiveActivitySummary == null || vwb.m200296J(bLiveActivitySummary.ongoingLiveIds)) ? false : true;
        if (bLiveSquareDetailCountersM170761c == null || bLiveSquareDetailCountersM170761c.unreadCount <= 0) {
            return z ? 1 : 2;
        }
        return z ? 0 : 2;
    }

    /* JADX INFO: renamed from: l */
    public ppr m170770l(ppr pprVar) {
        int i;
        if (m170761c() != null && this.f150678d == 0) {
            BLiveSquareDetailCounters bLiveSquareDetailCountersM170761c = m170761c();
            BLiveSquareDetailCounters bLiveSquareDetailCountersM170761c2 = pprVar.m170761c();
            if (bLiveSquareDetailCountersM170761c2 != null && (i = bLiveSquareDetailCountersM170761c2.unreadCount) < bLiveSquareDetailCountersM170761c.unreadCount) {
                if (i == 0 && pprVar.m170762d() != null && m170762d() != null) {
                    pprVar.m170762d().description = m170762d().description;
                }
                bLiveSquareDetailCountersM170761c2.unreadCount = bLiveSquareDetailCountersM170761c.unreadCount;
            }
        }
        return pprVar;
    }

    public ppr(Throwable th) {
        this.f150675a = null;
        this.f150676b = null;
        this.f150678d = 2;
        this.f150677c = th;
    }
}
